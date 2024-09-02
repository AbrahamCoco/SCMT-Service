package com.DevCon.SCMT_Services.endpoint;

import com.DevCon.SCMT_Services.model.TrutaDTO;
import com.DevCon.SCMT_Services.repository.TrutaRepository;
import com.DevCon.SCMT_Services.service.TrutaService;
import mx.softitlan.utils.ResponseBody;
import mx.softitlan.utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("SCMT-Services")
@RestController
@CrossOrigin("*")
public class TrutaEndpoint {
    private static final Logger LOG = LoggerFactory.getLogger(TrutaEndpoint.class);

    @Autowired
    TrutaService trutaService;

    @Autowired
    TrutaRepository trutaRepository;

    @GetMapping("/consultarRutas")
    public ResponseEntity<ResponseBody<List<TrutaDTO>>> consultarRutas(@RequestParam("compania") int tcompania_id){
        ResponseEntity<ResponseBody<List<TrutaDTO>>> res = null;
        LOG.info("Consultar Rutas->id: {} ", tcompania_id);
        try {
            List<TrutaDTO> trutaDTOList = trutaService.consultarRutas(tcompania_id);
            res = Utils.response200OK("Lista de rutas", trutaDTOList);
        } catch (Exception e) {
            res = Utils.handle(e, "Error al obtener las rutas");
        }
        LOG.info("Consultar Rutas->Response: {} ", res);
        return res;
    }

    @PostMapping("/eliminarRuta")
    public ResponseEntity<ResponseBody<Void>> eliminarRuta(@RequestParam("id") int id){
        ResponseEntity<ResponseBody<Void>> res = null;
        LOG.info("Eliminar Ruta->id: {} ", id);
        try {
            trutaService.eliminarRuta(id);
            res = Utils.response200OK("Ruta eliminada");
        } catch (Exception e) {
            res = Utils.handle(e, "Error al eliminar la ruta");
        }
        LOG.info("Eliminar Ruta->Response: {} ", res);
        return res;
    }

    @PostMapping("/actualizarRuta")
    public ResponseEntity<ResponseBody<Void>> actualizarRuta(@RequestParam("id") Long id, @RequestBody TrutaDTO trutaDTO){
        ResponseEntity<ResponseBody<Void>> res = null;
        LOG.info("Actualizar Ruta->id: {} ", id);
        LOG.info("Actualizar Ruta->trutaDTO: {} ", trutaDTO);
        try {
            trutaService.actualizarRuta(id, trutaDTO);
            res = Utils.response200OK("Ruta actualizada");
        } catch (Exception e){
            res = Utils.handle(e, "Error al actualizar la ruta");
        }
        LOG.info("Actualizar Ruta->Response: {} ", res);
        return res;
    }
}
