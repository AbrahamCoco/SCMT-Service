package com.DevCon.SCMT_Services.repository;

import com.DevCon.SCMT_Services.model.TincidenteVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TcompaniaRepository extends JpaRepository<TincidenteVO, Long> {
}
