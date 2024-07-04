package com.DevCon.SCMT_Services.endpoint;

import com.DevCon.SCMT_Services.repository.TrutaRepository;
import com.DevCon.SCMT_Services.service.TrutaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("SCMT-Services/truta")
@RestController
@CrossOrigin("*")
public class TrutaEndpoint {
    private static final Logger LOG = LoggerFactory.getLogger(TrutaEndpoint.class);

    @Autowired
    TrutaService trutaService;

    @Autowired
    TrutaRepository trutaRepository;
}
