package com.DevCon.SCMT_Services.service;

import com.DevCon.SCMT_Services.model.TincidenteDTO;

import java.util.List;

public interface TincidenteService {
    List<TincidenteDTO> consultarInformeIncidencia(String inicio, String fin);
}
