package com.DevCon.SCMT_Services.service;

import com.DevCon.SCMT_Services.model.TincidenteDTO;
import mx.softitlan.utils.exception.AppException;

import java.util.List;

public interface TincidenteService {
    List<TincidenteDTO> getInformeIncidencias(String inicio, String fin) throws AppException;
    List<TincidenteDTO> getIncidencias(int truta_id) throws AppException;
}
