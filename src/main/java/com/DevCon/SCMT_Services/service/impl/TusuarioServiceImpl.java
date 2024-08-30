package com.DevCon.SCMT_Services.service.impl;

import com.DevCon.SCMT_Services.model.*;
import com.DevCon.SCMT_Services.repository.TusuarioRepository;
import com.DevCon.SCMT_Services.service.TusuarioService;
import mx.softitlan.utils.Utils;
import mx.softitlan.utils.exception.AppException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TusuarioServiceImpl implements TusuarioService {
    @Autowired
    private TusuarioRepository tusuarioRepository;

    @Override
    public List<TusuarioDTO> consultarAll(int tcompania_id) throws AppException {
        List<TusuarioDTO> tusuarioDTOList = null;
        try {
            List<TusuarioVO> tusuarioVOList = tusuarioRepository.consultarAll(tcompania_id);
            tusuarioDTOList = tusuarioVOList.stream()
                    .map(TusuarioBuilder::fromVO)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            Utils.raise(e, "Error al obtener los usuarios");
        }
        return tusuarioDTOList;
    }

    @Override
    public List<TusuarioDTO> consultarC(String usuario, String contraseña) throws AppException {
        List<TusuarioDTO> tusuarioDTOList = null;
        try {
            List<TusuarioVO> tusuarioVOList = tusuarioRepository.consultarC(usuario, contraseña);
            if (tusuarioVOList == null || tusuarioVOList.isEmpty()) {
                throw new AppException("Usuario o contraseña incorrecto");
            } else {
                tusuarioDTOList = tusuarioVOList.stream()
                        .map(TusuarioBuilder::fromVO)
                        .collect(Collectors.toList());
            }
        }catch (Exception e) {
            Utils.raise(e, "Error al iniciar sesion");
        }
        return tusuarioDTOList;
    }

    @Override
    public List<TusuarioDTO> consultarConductores(int tcompania_id) throws AppException {
        List<TusuarioDTO> tusuarioDTOList = null;
        try {
            List<TusuarioVO> tusuarioVOList = tusuarioRepository.consultarConductores(tcompania_id);
            tusuarioDTOList = tusuarioVOList.stream()
                    .map(TusuarioBuilder::fromVO)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            Utils.raise(e, "Error al obtener los conductores");
        }
        return tusuarioDTOList;
    }

}
