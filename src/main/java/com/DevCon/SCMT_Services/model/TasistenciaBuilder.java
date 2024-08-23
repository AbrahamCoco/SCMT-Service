package com.DevCon.SCMT_Services.model;

public class TasistenciaBuilder {
    public static TasistenciaDTO fromVO(TasistenciaVO tasistenciaVO) {
        TasistenciaDTO tasistenciaDTO = new TasistenciaDTO();
        tasistenciaDTO.setId(tasistenciaVO.getId());

        tasistenciaDTO.setTruta_id(tasistenciaVO.getTruta().getId());
        tasistenciaDTO.setTruta_nombre(tasistenciaVO.getTruta().getNombre());

        tasistenciaDTO.setTusuario_id(tasistenciaVO.getTusuario().getId());
        tasistenciaDTO.setTusuario_area(tasistenciaVO.getTusuario().getPasajero().getArea());
        tasistenciaDTO.setTusuario_jefeinmediato(tasistenciaVO.getTusuario().getPasajero().getJefe_inmediato());
        tasistenciaDTO.setTusuario_nombre(tasistenciaVO.getTusuario().getNombre());
        tasistenciaDTO.setTusuario_primerapellido(tasistenciaVO.getTusuario().getPrimer_apellido());
        tasistenciaDTO.setTusuario_segundoapellido(tasistenciaVO.getTusuario().getSegundo_apellido());

        tasistenciaDTO.setAsistencia(tasistenciaVO.getAsistencia());
        tasistenciaDTO.setFecha(tasistenciaVO.getFecha());
        tasistenciaDTO.setHora(tasistenciaVO.getHora());
        tasistenciaDTO.setEstado(tasistenciaVO.getEstado());

        return tasistenciaDTO;
    }

    public static TasistenciaVO fromDTO(TasistenciaDTO tasistenciaDTO) {
        TasistenciaVO tasistenciaVO = new TasistenciaVO();
        tasistenciaVO.setId(tasistenciaDTO.getId());
        tasistenciaVO.setTruta(new TrutaVO());
        tasistenciaVO.setTusuario(new TusuarioVO());
        tasistenciaVO.setAsistencia(tasistenciaDTO.getAsistencia());
        tasistenciaVO.setFecha(tasistenciaDTO.getFecha());
        tasistenciaVO.setHora(tasistenciaDTO.getHora());
        tasistenciaVO.setEstado(tasistenciaDTO.getEstado());
        return tasistenciaVO;
    }
}
