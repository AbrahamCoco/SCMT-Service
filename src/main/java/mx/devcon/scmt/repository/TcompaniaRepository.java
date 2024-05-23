package mx.devcon.scmt.repository;

import mx.devcon.scmt.model.TincidenteVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TcompaniaRepository extends JpaRepository<TincidenteVO, Long> {
}
