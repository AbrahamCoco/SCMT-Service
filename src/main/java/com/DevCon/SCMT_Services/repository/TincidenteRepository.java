package com.DevCon.SCMT_Services.repository;

import com.DevCon.SCMT_Services.model.TincidenteVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TincidenteRepository extends JpaRepository<TincidenteVO, Long> {
    List<TincidenteVO> consultarInformeIncidencia(@Param("inicio") String inicio, @Param("fin") String fin);
}
