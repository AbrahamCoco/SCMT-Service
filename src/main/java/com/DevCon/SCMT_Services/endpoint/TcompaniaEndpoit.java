package com.DevCon.SCMT_Services.endpoint;

import com.DevCon.SCMT_Services.repository.TcompaniaRepository;
import com.DevCon.SCMT_Services.service.TcompaniaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("SCMT-Services/tcompania")
@RestController
@CrossOrigin("*")
public class TcompaniaEndpoit {
    private static final Logger LOG = LoggerFactory.getLogger(TcompaniaEndpoit.class);

    @Autowired
    TcompaniaService tcompaniaService;

    @Autowired
    TcompaniaRepository companiaRepository;
}
