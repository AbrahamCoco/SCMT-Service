package com.DevCon.SCMT_Services.service.impl;

import com.DevCon.SCMT_Services.model.TincidenteDTO;
import com.DevCon.SCMT_Services.service.TincidenteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TincidenteServiceImpl implements TincidenteService {
    @Override
    public List<TincidenteDTO> consultarInformeIncidencia(String inicio, String fin) {
        return List.of();
    }
}
