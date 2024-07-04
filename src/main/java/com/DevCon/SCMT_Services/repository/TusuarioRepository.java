package com.DevCon.SCMT_Services.repository;

import com.DevCon.SCMT_Services.model.TusuarioVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TusuarioRepository extends JpaRepository<TusuarioVO, Long> {
    List<TusuarioVO> consultarAll(int tcompania_id);
    List<TusuarioVO> consultarC(@Param("usuario") String usuario, @Param("contraseña") String contraseña);
}
