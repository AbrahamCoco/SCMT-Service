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
            if (tusuarioVO.getAdministrador() != null && tusuarioVO.getAdministrador().getId() != null) {
                tusuarioDTO.setTusuario_admin_id(tusuarioVO.getAdministrador().getId());
                tusuarioDTO.setTusuario_admin_fotografia(tusuarioVO.getAdministrador().getFotografia());
                tusuarioDTO.setTusuario_admin_descripcion(tusuarioVO.getAdministrador().getDescripcion());
                tusuarioDTO.setTusuario_admin_telefono(tusuarioVO.getAdministrador().getTelefono());
                tusuarioDTO.setTusuario_admin_estado(tusuarioVO.getAdministrador().getEstado());
            } else {

            }
        } else if (tusuarioDTO.getTrol_id() == 2 ) {
            /*if (tusuarioVO.getConductor() != null && tusuarioVO.getConductor().getId() != null) {
                tusuarioDTO.setTusuario_conductor_id(tusuarioVO.getConductor().getId());
                tusuarioDTO.setTusuario_conductor_id_empleado(tusuarioVO.getConductor().getId_empleado());
                tusuarioDTO.setTusuario_conductor_fotografia(tusuarioVO.getConductor().getFotografia());
                tusuarioDTO.setTusuario_conductor_direccion(tusuarioVO.getConductor().getDireccion());
                tusuarioDTO.setTusuario_conductor_telefono(tusuarioVO.getConductor().getTelefono());
                tusuarioDTO.setTusuario_conductor_id_licencia(tusuarioVO.getConductor().getId_licencia());
                tusuarioDTO.setTusuario_conductor_estado(tusuarioVO.getConductor().getEstado());
            } else {

            }*/
        } else if (tusuarioDTO.getTrol_id() == 3) {
            if (tusuarioVO.getPasajero() != null && tusuarioVO.getPasajero().getId() != null) {
                tusuarioDTO.setTusuario_pasajero_id(tusuarioVO.getPasajero().getId());
                tusuarioDTO.setTusuario_pasajero_id_pasajero(tusuarioVO.getPasajero().getId_pasajero());
                tusuarioDTO.setTusuario_pasajero_fotografia(tusuarioVO.getPasajero().getFotografia());
                tusuarioDTO.setTusuario_pasajero_telefono(tusuarioVO.getPasajero().getTelefono());
                tusuarioDTO.setTusuario_pasajero_area(tusuarioVO.getPasajero().getArea());
                tusuarioDTO.setTusuario_pasajero_jefe_inmediato(tusuarioVO.getPasajero().getJefe_inmediato());
                tusuarioDTO.setTusuario_pasajero_turno(tusuarioVO.getPasajero().getTurno());
                tusuarioDTO.setTusuario_pasajero_estado(tusuarioVO.getPasajero().getEstado());
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
            tusuarioVO.setAdministrador(new Tusuario_adminVO());
        } else if (tusuarioDTO.getTrol_id() == 2) {
            // tusuarioVO.setConductor(new Tusuario_conductorVO());
        } else if (tusuarioDTO.getTrol_id() == 3) {
            tusuarioVO.setPasajero(new Tusuario_pasajeroVO());
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
