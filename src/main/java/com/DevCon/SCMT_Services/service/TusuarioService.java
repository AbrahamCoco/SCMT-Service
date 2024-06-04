package com.DevCon.SCMT_Services.service;

import com.DevCon.SCMT_Services.model.TusuarioDTO;
import mx.softitlan.utils.exception.AppException;

import java.util.List;

public interface TusuarioService {
    List<TusuarioDTO> consultarAll(int tcompania_id) throws AppException;
    //List<TusuarioDTO> consultarC(String usuario, String contraseña) throws AppException;
}
