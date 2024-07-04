package com.DevCon.SCMT_Services.model;

public class TasistenciaBuilder {
    public static TasistenciaDTO fromVO(TasistenciaVO tasistenciaVO) {
        TasistenciaDTO tasistenciaDTO = new TasistenciaDTO();
        tasistenciaDTO.setId(tasistenciaVO.getId());

        tasistenciaDTO.setTruta_id(tasistenciaVO.getTruta().getId());

        tasistenciaDTO.setTusuario_id(tasistenciaVO.getTusuario().getId());

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
