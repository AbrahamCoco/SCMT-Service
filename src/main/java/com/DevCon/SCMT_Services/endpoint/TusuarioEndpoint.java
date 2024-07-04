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

    @GetMapping("/consultarAll")
    public ResponseEntity<ResponseBody<List<TusuarioDTO>>> consultarAll(@RequestParam("compania") int tcompania_id) {
        ResponseEntity<ResponseBody<List<TusuarioDTO>>> res = null;
        LOG.info("consultarAll()->Response: {} ", tcompania_id);
        try {
            List<TusuarioDTO> tusuarioDTOList = tusuarioService.consultarAll(tcompania_id);
            res = Utils.response200OK("Lista de usuarios", tusuarioDTOList);
        } catch (Exception e) {
            res = Utils.handle(e, "Error al obtener los usuarios");
        }
        LOG.info("consultarAll()->Response: {} ", res);
        return res;
    }

    @PostMapping("/consultarU")
    public ResponseEntity<ResponseBody<Void>> consultarU(@RequestParam String usuario, @RequestParam String contraseña) {
        ResponseEntity<ResponseBody<Void>> res = null;
        LOG.info("consultarU()->usuario: Usuario enviado correctamente");
        LOG.info("consultarU()->contraseña: Contraseña enviada correctamente");
        try {
            tusuarioService.consultarC(usuario, contraseña);
            res = Utils.response200OK("Usuario logeado correctamente");
        } catch (Exception e){
            res = Utils.handle(e, "Error al logear el usuario");
        }
        LOG.info("consultarU()->Response: {} ", res);
        return res;
    }
}
