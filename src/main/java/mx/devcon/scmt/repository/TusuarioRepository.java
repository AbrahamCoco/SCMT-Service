package mx.devcon.scmt.repository;

import mx.devcon.scmt.model.TusuarioVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TusuarioRepository extends JpaRepository<TusuarioVO, Long> {

}
