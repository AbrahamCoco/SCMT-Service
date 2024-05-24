package mx.devcon.scmt.service;

import mx.devcon.scmt.model.TusuarioDTO;
import mx.softitlan.utils.exception.AppException;

import java.util.List;

public interface TusuarioService {
    List<TusuarioDTO> consultarAll(int tcompania_id) throws AppException;
}
