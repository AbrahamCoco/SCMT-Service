package com.DevCon.SCMT_Services.service;

import com.DevCon.SCMT_Services.model.TrutaDTO;

import java.util.List;

public interface TrutaService {
    List<TrutaDTO> consultarRutas(int tcompania_id) throws Exception;
}
