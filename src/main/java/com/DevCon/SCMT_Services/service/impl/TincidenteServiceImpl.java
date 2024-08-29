package com.DevCon.SCMT_Services.service.impl;

import com.DevCon.SCMT_Services.model.TincidenteBuilder;
import com.DevCon.SCMT_Services.model.TincidenteDTO;
import com.DevCon.SCMT_Services.model.TincidenteVO;
import com.DevCon.SCMT_Services.repository.TincidenteRepository;
import com.DevCon.SCMT_Services.service.TincidenteService;
import mx.softitlan.utils.Utils;
import mx.softitlan.utils.exception.AppException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TincidenteServiceImpl implements TincidenteService {
    @Autowired
    private TincidenteRepository tincidenteRepository;

    @Override
    public List<TincidenteDTO> getInformeIncidencias(String inicio, String fin) throws AppException {
        List<TincidenteDTO> tincidenteDTOS = null;
        try {
            List<TincidenteVO> tincidenteVOS = tincidenteRepository.consultarInformeIncidencia(inicio, fin);
            tincidenteDTOS = tincidenteVOS.stream()
                    .map(TincidenteBuilder::fromVO)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            Utils.raise(e, "Error al buscar los datos del informe");
        }
        return tincidenteDTOS;
    }

    @Override
    public List<TincidenteDTO> getIncidencias(int rutas) throws AppException {
        List<TincidenteDTO> tincidenteDTOSList = null;
        try {
            List<TincidenteVO> tincidenteVOSList = tincidenteRepository.consultarIncidencias(rutas);
            tincidenteDTOSList = tincidenteVOSList.stream()
                    .map(TincidenteBuilder::fromVO)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            Utils.raise(e, "Error al obtener las incidencias");
        }
        return tincidenteDTOSList;
    }
}
