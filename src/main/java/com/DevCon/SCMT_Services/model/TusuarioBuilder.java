package com.DevCon.SCMT_Services.model;

public class TusuarioBuilder {
    public static TusuarioDTO fromVO(TusuarioVO tusuarioVO) {
        TusuarioDTO tusuarioDTO = new TusuarioDTO();
        tusuarioDTO.setId(tusuarioVO.getId());

        tusuarioDTO.setTcompania_id(tusuarioVO.getTcompania().getId());
        tusuarioDTO.setTcompania_nombre(tusuarioVO.getTcompania().getNombre());
        tusuarioDTO.setTcompania_descripcion(tusuarioVO.getTcompania().getDescripcion());
        tusuarioDTO.setTcompania_telefono(tusuarioVO.getTcompania().getTelefono());
        tusuarioDTO.setTcompania_estado(tusuarioVO.getTcompania().getEstado());

        tusuarioDTO.setTrol_id(tusuarioVO.getTrol().getId());
        tusuarioDTO.setTrol_descripcion(tusuarioVO.getTrol().getDescripcion());
        tusuarioDTO.setTrol_estado(tusuarioVO.getTrol().getEstado());

        if (tusuarioDTO.getTrol_id() == 1 ) {
            if (tusuarioVO.getTusuario_admin() != null && tusuarioVO.getTusuario_admin().getId() != null) {
                tusuarioDTO.setTusuario_admin_id(tusuarioVO.getTusuario_admin().getId());
                tusuarioDTO.setTusuario_admin_fotografia(tusuarioVO.getTusuario_admin().getFotografia());
                tusuarioDTO.setTusuario_admin_descripcion(tusuarioVO.getTusuario_admin().getDescripcion());
                tusuarioDTO.setTusuario_admin_telefono(tusuarioVO.getTusuario_admin().getTelefono());
                tusuarioDTO.setTusuario_admin_estado(tusuarioVO.getTusuario_admin().getEstado());
            } else {

            }
        } else if (tusuarioDTO.getTrol_id() == 2 ) {
            if (tusuarioVO.getTusuario_conductor() != null && tusuarioVO.getTusuario_conductor().getId() != null) {
                tusuarioDTO.setTusuario_conductor_id(tusuarioVO.getTusuario_conductor().getId());
                tusuarioDTO.setTusuario_conductor_id_empleado(tusuarioVO.getTusuario_conductor().getId_empleado());
                tusuarioDTO.setTusuario_conductor_fotografia(tusuarioVO.getTusuario_conductor().getFotografia());
                tusuarioDTO.setTusuario_conductor_direccion(tusuarioVO.getTusuario_conductor().getDireccion());
                tusuarioDTO.setTusuario_conductor_telefono(tusuarioVO.getTusuario_conductor().getTelefono());
                tusuarioDTO.setTusuario_conductor_id_licencia(tusuarioVO.getTusuario_conductor().getId_licencia());
                tusuarioDTO.setTusuario_conductor_estado(tusuarioVO.getTusuario_conductor().getEstado());
            } else {

            }
        } else if (tusuarioDTO.getTrol_id() == 3) {
            if (tusuarioVO.getTusuario_pasajero() != null && tusuarioVO.getTusuario_pasajero().getId() != null) {
                tusuarioDTO.setTusuario_pasajero_id(tusuarioVO.getTusuario_pasajero().getId());
                tusuarioDTO.setTusuario_pasajero_id_pasajero(tusuarioVO.getTusuario_pasajero().getId_pasajero());
                tusuarioDTO.setTusuario_pasajero_fotografia(tusuarioVO.getTusuario_pasajero().getFotografia());
                tusuarioDTO.setTusuario_pasajero_telefono(tusuarioVO.getTusuario_pasajero().getTelefono());
                tusuarioDTO.setTusuario_pasajero_area(tusuarioVO.getTusuario_pasajero().getArea());
                tusuarioDTO.setTusuario_pasajero_jefe_inmediato(tusuarioVO.getTusuario_pasajero().getJefe_inmediato());
                tusuarioDTO.setTusuario_pasajero_turno(tusuarioVO.getTusuario_pasajero().getTurno());
                tusuarioDTO.setTusuario_pasajero_estado(tusuarioVO.getTusuario_pasajero().getEstado());
            } else {

            }
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

        if (tusuarioDTO.getTrol_id() == 1) {
            tusuarioVO.setTusuario_admin(new Tusuario_adminVO());
        } else if (tusuarioDTO.getTrol_id() == 2) {
            tusuarioVO.setTusuario_conductor(new Tusuario_conductorVO());
        } else if (tusuarioDTO.getTrol_id() == 3) {
            tusuarioVO.setTusuario_pasajero(new Tusuario_pasajeroVO());
        }

        tusuarioVO.setNombre(tusuarioDTO.getNombre());
        tusuarioVO.setPrimer_apellido(tusuarioDTO.getPrimer_apellido());
        tusuarioVO.setSegundo_apellido(tusuarioDTO.getSegundo_apellido());
        tusuarioVO.setUsuario(tusuarioDTO.getUsuario());
        tusuarioVO.setContraseña(tusuarioDTO.getContraseña());
        tusuarioVO.setEstado(tusuarioDTO.getEstado());

        return tusuarioVO;
    }
}
