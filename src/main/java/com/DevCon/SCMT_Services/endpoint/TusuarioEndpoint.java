package com.DevCon.SCMT_Services.endpoint;

import com.DevCon.SCMT_Services.model.TusuarioDTO;
import com.DevCon.SCMT_Services.repository.TusuarioRepository;
import com.DevCon.SCMT_Services.service.TusuarioService;
import mx.softitlan.utils.ResponseBody;
import mx.softitlan.utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("SCMT-Services/tusuario")
@RestController
@CrossOrigin("*")
public class TusuarioEndpoint {
    private static final Logger LOG = LoggerFactory.getLogger(TusuarioEndpoint.class);

    @Autowired
    TusuarioService tusuarioService;

    @Autowired
    TusuarioRepository tusuarioRepository;

    @GetMapping("/consultarAll/{tcompania_id}")
    public ResponseEntity<ResponseBody<List<TusuarioDTO>>> consultarAll(@PathVariable int tcompania_id){
        ResponseEntity<ResponseBody<List<TusuarioDTO>>> res = null;
        LOG.info("consultarAll()->Response: {} ", tcompania_id);
        try {
            List<TusuarioDTO> tusuarioDTOList = tusuarioService.consultarAll(tcompania_id);
            res = Utils.response200OK("Lista de usuarios", tusuarioDTOList);
        }catch (Exception e){
            res = Utils.handle(e, "Error al obtener los usuarios");
        }
        LOG.info("consultarAll()->Response: {} ", res);
        return res;
    }
}
