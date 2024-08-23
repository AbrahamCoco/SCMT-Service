package com.DevCon.SCMT_Services.model;

public class TincidenteBuilder {
    public static TincidenteDTO fromVO(TincidenteVO tincidenteVO) {
        TincidenteDTO tincidenteDTO = new TincidenteDTO();
        tincidenteDTO.setId(tincidenteVO.getId());

        tincidenteDTO.setTruta_id(tincidenteVO.getTruta().getId());
        tincidenteDTO.setTruta_nombre(tincidenteVO.getTruta().getNombre());
        tincidenteDTO.setTruta_descripcion(tincidenteVO.getTruta().getDescripcion());
        tincidenteDTO.setTruta_puntoacceso(tincidenteVO.getTruta().getPunto_acceso());
        tincidenteDTO.setTruta_vehiculo(tincidenteVO.getTruta().getVehiculo());

        tincidenteDTO.setTusuario_id(tincidenteVO.getTusuario().getId());
        tincidenteDTO.setTusuario_nombre(tincidenteVO.getTusuario().getNombre());
        tincidenteDTO.setTusuario_primerapellido(tincidenteVO.getTusuario().getPrimer_apellido());
        tincidenteDTO.setTusuario_segundoapellido(tincidenteVO.getTusuario().getSegundo_apellido());
        tincidenteDTO.setTusuario_usuario(tincidenteVO.getTusuario().getUsuario());

        tincidenteDTO.setNombre(tincidenteVO.getNombre());
        tincidenteDTO.setDescripcion(tincidenteVO.getDescripcion());
        tincidenteDTO.setFecha(tincidenteVO.getFecha());
        tincidenteDTO.setHora(tincidenteVO.getHora());
        tincidenteDTO.setEstado(tincidenteVO.getEstado());
        return tincidenteDTO;
    }

    public static TincidenteVO fromDTO(TincidenteDTO tincidenteDTO) {
        TincidenteVO tincidenteVO = new TincidenteVO();
        tincidenteVO.setId(tincidenteDTO.getId());
        tincidenteVO.setTruta(new TrutaVO());
        tincidenteVO.setTusuario(new TusuarioVO());
        tincidenteVO.setDescripcion(tincidenteDTO.getDescripcion());
        tincidenteVO.setFecha(tincidenteDTO.getFecha());
        tincidenteVO.setHora(tincidenteDTO.getHora());
        tincidenteVO.setEstado(tincidenteDTO.getEstado());
        return tincidenteVO;
    }
}
