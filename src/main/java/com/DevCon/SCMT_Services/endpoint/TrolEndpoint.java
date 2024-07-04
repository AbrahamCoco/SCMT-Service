package com.DevCon.SCMT_Services.endpoint;

import com.DevCon.SCMT_Services.repository.TrolRepository;
import com.DevCon.SCMT_Services.service.TrolService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("SCMT-Services/trol")
@RestController
@CrossOrigin("*")
public class TrolEndpoint {
    private static final Logger LOG = LoggerFactory.getLogger(TrolEndpoint.class);

    @Autowired
    TrolService trolService;

    @Autowired
    TrolRepository trolRepository;
}
