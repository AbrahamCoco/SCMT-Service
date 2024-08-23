package com.DevCon.SCMT_Services.service;

import com.DevCon.SCMT_Services.model.TasistenciaDTO;
import mx.softitlan.utils.exception.AppException;

import java.util.List;

public interface TasistenciaService {
    List<TasistenciaDTO> getInformeAsistencia(String inicio, String fim) throws AppException;
}
