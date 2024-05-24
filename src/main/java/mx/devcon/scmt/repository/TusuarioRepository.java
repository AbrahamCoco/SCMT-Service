package mx.devcon.scmt.repository;

import mx.devcon.scmt.model.TusuarioVO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TusuarioRepository extends JpaRepository<TusuarioVO, Long> {
    List<TusuarioVO> consultarAll(int tcompania_id);
}
