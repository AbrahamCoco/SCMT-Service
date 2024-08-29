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
        LOG.info("Consultar Rutas: {} ", tcompania_id);
        try {
            List<TrutaDTO> trutaDTOList = trutaService.consultarRutas(tcompania_id);
            res = Utils.response200OK("Lista de rutas", trutaDTOList);
        } catch (Exception e) {
            res = Utils.handle(e, "Error al obtener las rutas");
        }
        LOG.info("Consultar Rutas: {} ", tcompania_id);
        return res;
    }
}
