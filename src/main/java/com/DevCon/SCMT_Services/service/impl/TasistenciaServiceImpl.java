package com.DevCon.SCMT_Services.service.impl;

import com.DevCon.SCMT_Services.model.TasistenciaBuilder;
import com.DevCon.SCMT_Services.model.TasistenciaDTO;
import com.DevCon.SCMT_Services.model.TasistenciaVO;
import com.DevCon.SCMT_Services.repository.TasistenciaRepository;
import com.DevCon.SCMT_Services.service.TasistenciaService;
import mx.softitlan.utils.Utils;
import mx.softitlan.utils.exception.AppException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TasistenciaServiceImpl implements TasistenciaService {
    @Autowired
    private TasistenciaRepository tasistenciaRepository;

    @Override
    public List<TasistenciaDTO> getInformeAsistencia(String inicio, String fin) throws AppException {
        List<TasistenciaDTO> tasistenciaDTOS = null;
        try {
            List<TasistenciaVO> tasistenciaVOS = tasistenciaRepository.consultarInformeAsistencia(inicio, fin);
            tasistenciaDTOS = tasistenciaVOS.stream()
                    .map(TasistenciaBuilder::fromVO)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            Utils.raise(e, "Error al consultar los datos del informe");
        }
        return tasistenciaDTOS;
    }
}
