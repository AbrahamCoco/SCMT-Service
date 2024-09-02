package com.DevCon.SCMT_Services.model;

public class TrutaBuilder {
    public static TrutaDTO fromVO(TrutaVO trutaVO) {
        TrutaDTO trutaDTO = new TrutaDTO();
        trutaDTO.setId(trutaVO.getId());

        trutaDTO.setTcompania_id(trutaVO.getTcompania().getId());

        trutaDTO.setTusuario_id_conductor(trutaVO.getTusuario_conductor().getId());
        trutaDTO.setTusuario_nombre_conductor(trutaVO.getTusuario_conductor().getNombre());
        trutaDTO.setTusuario_primerapellido_conductor(trutaVO.getTusuario_conductor().getPrimer_apellido());
        trutaDTO.setTusuario_segundoapellido_conductor(trutaVO.getTusuario_conductor().getSegundo_apellido());

        trutaDTO.setNombre(trutaVO.getNombre());
        trutaDTO.setDescripcion(trutaVO.getDescripcion());
        trutaDTO.setPunto_acceso(trutaVO.getPunto_acceso());
        trutaDTO.setVehiculo(trutaVO.getVehiculo());
        trutaDTO.setQr(trutaVO.getQr());
        trutaDTO.setEstado(trutaVO.getEstado());
        return trutaDTO;
    }

    public static TrutaVO fromDTO(TrutaDTO trutaDTO) {
        TrutaVO trutaVO = new TrutaVO();
        trutaVO.setId(trutaDTO.getId());

        trutaVO.setTcompania(new TcompaniaVO());
        // trutaVO.setTusuario_conductor(new Tusuario_conductorVO());

        trutaVO.setNombre(trutaDTO.getNombre());
        trutaVO.setDescripcion(trutaDTO.getDescripcion());
        trutaVO.setPunto_acceso(trutaDTO.getPunto_acceso());
        trutaVO.setVehiculo(trutaDTO.getVehiculo());
        trutaVO.setQr(trutaDTO.getQr());
        trutaVO.setEstado(trutaDTO.getEstado());
        return trutaVO;
    }
}
