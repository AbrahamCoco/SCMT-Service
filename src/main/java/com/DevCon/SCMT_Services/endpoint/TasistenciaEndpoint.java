package com.DevCon.SCMT_Services.endpoint;

import com.DevCon.SCMT_Services.model.TasistenciaDTO;
import com.DevCon.SCMT_Services.repository.TasistenciaRepository;
import com.DevCon.SCMT_Services.service.TasistenciaService;
import mx.softitlan.utils.ResponseBody;
import mx.softitlan.utils.Utils;
import mx.softitlan.utils.exception.AppException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("SCMT-Services")
@RestController
@CrossOrigin("*")
public class TasistenciaEndpoint {
    private static final Logger LOG = LoggerFactory.getLogger(TasistenciaEndpoint.class);

    @Autowired
    TasistenciaService tasistenciaService;

    @Autowired
    TasistenciaRepository taistenciaRepository;

    @GetMapping("/consultarInformeAsistencia")
    public ResponseEntity<ResponseBody<List<TasistenciaDTO>>> consultarInformeAsistencia(@RequestParam("inicio") String inicio, @RequestParam("fin") String fin) {
        ResponseEntity<ResponseBody<List<TasistenciaDTO>>> res = null;
        LOG.info("Consultar informeAsistencia()->Inicio->Response: {} ", inicio);
        LOG.info("Consultar informeAsistencia()->Fin->Response: {}", fin);
        try {
            List<TasistenciaDTO> tasistenciaDTOList = tasistenciaService.getInformeAsistencia(inicio, fin);
            res = Utils.response200OK("Lista de asistencia", tasistenciaDTOList);
        } catch (AppException e) {
            res = Utils.handle(e,"Error al obtener las asistencias");
        }
        LOG.info("Consultar informeAsistencia()->Response: {}", res);
        return res;
    }
}
