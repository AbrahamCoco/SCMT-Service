package com.DevCon.SCMT_Services.model;

public class TincidenteBuilder {
    public static TincidenteDTO fromVO(TincidenteVO tincidenteVO) {
        TincidenteDTO tincidenteDTO = new TincidenteDTO();
        tincidenteDTO.setId(tincidenteVO.getId());

        tincidenteDTO.setTruta_id(tincidenteVO.getTruta().getId());
        tincidenteDTO.setTusuario_id(tincidenteVO.getTusuario().getId());

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
