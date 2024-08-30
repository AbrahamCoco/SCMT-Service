package com.DevCon.SCMT_Services.service.impl;

import com.DevCon.SCMT_Services.model.TrutaBuilder;
import com.DevCon.SCMT_Services.model.TrutaDTO;
import com.DevCon.SCMT_Services.model.TrutaVO;
import com.DevCon.SCMT_Services.repository.TrutaRepository;
import com.DevCon.SCMT_Services.service.TrutaService;
import mx.softitlan.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrutaServiceImpl implements TrutaService {
    @Autowired
    private TrutaRepository trutaRepository;

    @Override
    public List<TrutaDTO> consultarRutas(int tcompania_id) throws Exception {
        List<TrutaDTO> trutaDTOSList = null;
        try {
            List<TrutaVO> trutaVOList = trutaRepository.consultarRutas(tcompania_id);
            trutaDTOSList = trutaVOList.stream()
                    .map(TrutaBuilder::fromVO)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            Utils.raise(e, "Error al obtener las rutas");
        }
        return trutaDTOSList;
    }

    @Override
    public void eliminarRuta(int id) throws Exception {
        List<TrutaVO> trutaVo = null;
        try {
            trutaVo = trutaRepository.eliminarRuta(id);
            if (trutaVo == null || trutaVo.isEmpty()) {
                Utils.raise(null, "Ruta no encontrada");
            }
        } catch (Exception e) {
            Utils.raise(e, "Error al eliminar la ruta");
        }
    }
}
