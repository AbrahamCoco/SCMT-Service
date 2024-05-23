package mx.devcon.scmt.model;

public class TrolBuilder {
    public static TrolDTO fromVO(TrolVO trolVO) {
        TrolDTO trolDTO = new TrolDTO();
        trolDTO.setId(trolVO.getId());
        trolDTO.setDescripcion(trolVO.getDescripcion());
        trolDTO.setEstado(trolVO.getEstado());
        return trolDTO;
    }

    public static TrolVO fromDTO(TrolDTO trolDTO) {
        TrolVO trolVO = new TrolVO();
        trolVO.setId(trolDTO.getId());
        trolVO.setDescripcion(trolDTO.getDescripcion());
        trolVO.setEstado(trolDTO.getEstado());
        return trolVO;
    }
}
