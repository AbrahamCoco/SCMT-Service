package com.DevCon.SCMT_Services.service.impl;

import com.DevCon.SCMT_Services.model.TusuarioBuilder;
import com.DevCon.SCMT_Services.model.TusuarioDTO;
import com.DevCon.SCMT_Services.model.TusuarioVO;
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
}
