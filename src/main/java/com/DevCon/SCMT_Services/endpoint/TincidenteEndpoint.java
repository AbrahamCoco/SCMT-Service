package com.DevCon.SCMT_Services.endpoint;

import com.DevCon.SCMT_Services.repository.TincidenteRepository;
import com.DevCon.SCMT_Services.service.TincidenteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("SCMT-Services/tincidente")
@RestController
@CrossOrigin("*")
public class TincidenteEndpoint {
    private static final Logger LOG = LoggerFactory.getLogger(TincidenteEndpoint.class);

    @Autowired
    TincidenteService tincidenteService;

    @Autowired
    TincidenteRepository ticidenteRepository;
}
