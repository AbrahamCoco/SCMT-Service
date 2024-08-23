package com.DevCon.SCMT_Services.repository;

import com.DevCon.SCMT_Services.model.TasistenciaVO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TasistenciaRepository extends JpaRepository<TasistenciaVO, Long> {
    List<TasistenciaVO> consultarInformeAsistencia(String inicio, String fin);
}
