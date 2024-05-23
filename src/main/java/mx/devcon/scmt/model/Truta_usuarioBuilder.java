package mx.devcon.scmt.model;

public class Truta_usuarioBuilder {
    public static Truta_usuarioDTO fromVO(Truta_usuarioVO truta_usuarioVO) {
        Truta_usuarioDTO truta_usuarioDTO = new Truta_usuarioDTO();
        truta_usuarioDTO.setId(truta_usuarioVO.getId());

        truta_usuarioDTO.setTruta_id(truta_usuarioVO.getTruta().getId());
        truta_usuarioDTO.setTusuario_id(truta_usuarioVO.getTusuario().getId());

        truta_usuarioDTO.setEstado(truta_usuarioVO.getEstado());
        return truta_usuarioDTO;
    }

    public static Truta_usuarioVO fromDTO(Truta_usuarioDTO truta_usuarioDTO) {
        Truta_usuarioVO truta_usuarioVO = new Truta_usuarioVO();
        truta_usuarioVO.setId(truta_usuarioDTO.getId());

        truta_usuarioVO.setTruta(new TrutaVO());
        truta_usuarioVO.setTusuario(new TusuarioVO());

        truta_usuarioVO.setEstado(truta_usuarioDTO.getEstado());
        return truta_usuarioVO;
    }
}
