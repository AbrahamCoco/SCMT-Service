package com.DevCon.SCMT_Services.endpoint;

import com.DevCon.SCMT_Services.repository.TasistenciaRepository;
import com.DevCon.SCMT_Services.service.TasistenciaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("SCMT-Services/tasistencia")
@RestController
@CrossOrigin("*")
public class TasistenciaEndpoint {
    private static final Logger LOG = LoggerFactory.getLogger(TasistenciaEndpoint.class);

    @Autowired
    TasistenciaService tasistenciaService;

    @Autowired
    TasistenciaRepository taistenciaRepository;
}
