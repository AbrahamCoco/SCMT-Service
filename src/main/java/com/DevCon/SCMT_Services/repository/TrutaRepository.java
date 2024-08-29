package com.DevCon.SCMT_Services.repository;

import com.DevCon.SCMT_Services.model.TrutaVO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrutaRepository extends JpaRepository<TrutaVO, Long> {
    List<TrutaVO> consultarRutas(int tcompania_id);
}
