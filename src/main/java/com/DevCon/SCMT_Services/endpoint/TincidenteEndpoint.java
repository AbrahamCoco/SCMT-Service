package com.DevCon.SCMT_Services.endpoint;

import com.DevCon.SCMT_Services.model.TincidenteDTO;
import com.DevCon.SCMT_Services.repository.TincidenteRepository;
import com.DevCon.SCMT_Services.service.TincidenteService;
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
public class TincidenteEndpoint {
    private static final Logger LOG = LoggerFactory.getLogger(TincidenteEndpoint.class);

    @Autowired
    TincidenteService tincidenteService;

    @Autowired
    TincidenteRepository ticidenteRepository;

    @GetMapping("/consultarInformeIncidencia")
    public ResponseEntity<ResponseBody<List<TincidenteDTO>>> consultarInformeIncidencias(@RequestParam("inicio") String inicio, @RequestParam("fin") String fin) {
        ResponseEntity<ResponseBody<List<TincidenteDTO>>> res = null;
        LOG.info("Consultar informeIncidencia()->Inicio->Response: {} ", inicio);
        LOG.info("Consultar informeIncidencia()->Fin->Response: {} ", fin);
        try {
            List<TincidenteDTO> tincidenteDTOList = tincidenteService.getInformeIncidencias(inicio, fin);
            res = Utils.response200OK("Lista de incidencias", tincidenteDTOList);
        } catch (Exception e) {
            res = Utils.handle(e, "Error al obtener las incidencias");
        }
        LOG.info("Consultar informeIncidencia()->Response: {} ", res);
        return res;
    }
}
