package com.DevCon.SCMT_Services.model;

public class TusuarioBuilder {
    public static TusuarioDTO fromVO(TusuarioVO tusuarioVO) {
        TusuarioDTO tusuarioDTO = new TusuarioDTO();
        tusuarioDTO.setId(tusuarioVO.getId());

        tusuarioDTO.setTcompania_id(tusuarioVO.getTcompania().getId());
        tusuarioDTO.setTrol_id(tusuarioVO.getTrol().getId());

        if (tusuarioVO.getTusuario_admin() != null && tusuarioVO.getTusuario_admin().getId() != null) {
            tusuarioDTO.setTusuario_admin_id(tusuarioVO.getTusuario_admin().getId());
        } else {

        }

        if (tusuarioVO.getTusuario_conductor() != null && tusuarioVO.getTusuario_conductor().getId() != null) {
            tusuarioDTO.setTusuario_conductor_id(tusuarioVO.getTusuario_conductor().getId());
        } else {

        }

        if (tusuarioVO.getTusuario_pasajero() != null && tusuarioVO.getTusuario_pasajero().getId() != null) {
            tusuarioDTO.setTusuario_pasajero_id(tusuarioVO.getTusuario_pasajero().getId());
        } else {

        }

        tusuarioDTO.setNombre(tusuarioVO.getNombre());
        tusuarioDTO.setPrimer_apellido(tusuarioVO.getPrimer_apellido());
        tusuarioDTO.setSegundo_apellido(tusuarioVO.getSegundo_apellido());
        tusuarioDTO.setUsuario(tusuarioVO.getUsuario());
        tusuarioDTO.setContraseña(tusuarioVO.getContraseña());
        tusuarioDTO.setEstado(tusuarioVO.getEstado());

        return tusuarioDTO;
    }

    public static TusuarioVO fromDTO(TusuarioDTO tusuarioDTO) {
        TusuarioVO tusuarioVO = new TusuarioVO();
        tusuarioVO.setId(tusuarioDTO.getId());

        tusuarioVO.setTcompania(new TcompaniaVO());
        tusuarioVO.setTrol(new TrolVO());
        tusuarioVO.setTusuario_admin(new Tusuario_adminVO());
        tusuarioVO.setTusuario_conductor(new Tusuario_conductorVO());
        tusuarioVO.setTusuario_pasajero(new Tusuario_pasajeroVO());

        tusuarioVO.setNombre(tusuarioDTO.getNombre());
        tusuarioVO.setPrimer_apellido(tusuarioDTO.getPrimer_apellido());
        tusuarioVO.setSegundo_apellido(tusuarioDTO.getSegundo_apellido());
        tusuarioVO.setUsuario(tusuarioDTO.getUsuario());
        tusuarioVO.setContraseña(tusuarioDTO.getContraseña());
        tusuarioVO.setEstado(tusuarioDTO.getEstado());

        return tusuarioVO;
    }
}
