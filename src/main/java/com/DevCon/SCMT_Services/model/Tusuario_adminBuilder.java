package com.DevCon.SCMT_Services.model;

public class Tusuario_adminBuilder {
    public static Tusuario_adminDTO fromVO(Tusuario_adminVO tusuario_adminVO) {
        Tusuario_adminDTO tusuario_adminDTO = new Tusuario_adminDTO();
        tusuario_adminDTO.setId(tusuario_adminVO.getId());
        tusuario_adminDTO.setFotografia(tusuario_adminVO.getFotografia());
        tusuario_adminDTO.setDescripcion(tusuario_adminVO.getDescripcion());
        tusuario_adminDTO.setTelefono(tusuario_adminVO.getTelefono());
        tusuario_adminDTO.setEstado(tusuario_adminVO.getEstado());
        return tusuario_adminDTO;
    }

    public static Tusuario_adminVO fromDTO(Tusuario_adminDTO tusuario_adminDTO) {
        Tusuario_adminVO tusuario_adminVO = new Tusuario_adminVO();
        tusuario_adminVO.setId(tusuario_adminDTO.getId());
        tusuario_adminVO.setFotografia(tusuario_adminDTO.getFotografia());
        tusuario_adminVO.setDescripcion(tusuario_adminDTO.getDescripcion());
        tusuario_adminVO.setTelefono(tusuario_adminDTO.getTelefono());
        tusuario_adminVO.setEstado(tusuario_adminDTO.getEstado());
        return tusuario_adminVO;
    }
}
