package mx.devcon.scmt.model;

public class Tusuario_pasajeroBuilder {
    public static Tusuario_pasajeroDTO fromVO(Tusuario_pasajeroVO tusuario_pasajeroVO) {
        Tusuario_pasajeroDTO tusuario_pasajeroDTO = new Tusuario_pasajeroDTO();
        tusuario_pasajeroDTO.setId(tusuario_pasajeroVO.getId());
        tusuario_pasajeroDTO.setId_pasajero(tusuario_pasajeroVO.getId_pasajero());
        tusuario_pasajeroDTO.setFotografia(tusuario_pasajeroVO.getFotografia());
        tusuario_pasajeroDTO.setTelefono(tusuario_pasajeroVO.getTelefono());
        tusuario_pasajeroDTO.setArea(tusuario_pasajeroVO.getArea());
        tusuario_pasajeroDTO.setJefe_inmediato(tusuario_pasajeroVO.getJefe_inmediato());
        tusuario_pasajeroDTO.setTurno(tusuario_pasajeroVO.getTurno());
        tusuario_pasajeroDTO.setEstado(tusuario_pasajeroVO.getEstado());
        return tusuario_pasajeroDTO;
    }

    public static Tusuario_pasajeroVO fromDTO(Tusuario_pasajeroDTO tusuario_pasajeroDTO) {
        Tusuario_pasajeroVO tusuario_pasajeroVO = new Tusuario_pasajeroVO();
        tusuario_pasajeroVO.setId(tusuario_pasajeroDTO.getId());
        tusuario_pasajeroVO.setId_pasajero(tusuario_pasajeroDTO.getId_pasajero());
        tusuario_pasajeroVO.setFotografia(tusuario_pasajeroDTO.getFotografia());
        tusuario_pasajeroVO.setTelefono(tusuario_pasajeroDTO.getTelefono());
        tusuario_pasajeroVO.setArea(tusuario_pasajeroDTO.getArea());
        tusuario_pasajeroVO.setJefe_inmediato(tusuario_pasajeroDTO.getJefe_inmediato());
        tusuario_pasajeroVO.setTurno(tusuario_pasajeroDTO.getTurno());
        tusuario_pasajeroVO.setEstado(tusuario_pasajeroDTO.getEstado());
        return tusuario_pasajeroVO;
    }
}
