package com.DevCon.SCMT_Services.model;

public class TcompaniaBuilder {
    public static TcompaniaDTO fromVO(TcompaniaVO tcompaniaVO) {
        TcompaniaDTO tcompaniaDTO = new TcompaniaDTO();
        tcompaniaDTO.setId(tcompaniaVO.getId());
        tcompaniaDTO.setNombre(tcompaniaVO.getNombre());
        tcompaniaDTO.setDescripcion(tcompaniaVO.getDescripcion());
        tcompaniaDTO.setTelefono(tcompaniaVO.getTelefono());
        tcompaniaDTO.setEstado(tcompaniaVO.getEstado());
        return tcompaniaDTO;
    }

    public static TcompaniaVO fromDTO(TcompaniaDTO tcompaniaDTO) {
        TcompaniaVO tcompaniaVO = new TcompaniaVO();
        tcompaniaVO.setId(tcompaniaDTO.getId());
        tcompaniaVO.setNombre(tcompaniaDTO.getNombre());
        tcompaniaVO.setDescripcion(tcompaniaDTO.getDescripcion());
        tcompaniaVO.setTelefono(tcompaniaDTO.getTelefono());
        tcompaniaVO.setEstado(tcompaniaDTO.getEstado());
        return tcompaniaVO;
    }
}
