package com.DevCon.SCMT_Services.service;

import com.DevCon.SCMT_Services.model.TrutaDTO;

import java.util.List;

public interface TrutaService {
    List<TrutaDTO> consultarRutas(int tcompania_id) throws Exception;
    void eliminarRuta(int id) throws Exception;
    void actualizarRuta(Long id, TrutaDTO trutaDTO) throws Exception;
}
