package com.DevCon.SCMT_Services.repository;

import com.DevCon.SCMT_Services.model.TincidenteVO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TincidenteRepository extends JpaRepository<TincidenteVO, Long> {
    List<TincidenteVO> consultarInformeIncidencia(String inicio, String fin);
    List<TincidenteVO> consultarIncidencias(int rutas);
}
