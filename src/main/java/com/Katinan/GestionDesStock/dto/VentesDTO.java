package com.Katinan.GestionDesStock.dto;

import com.Katinan.GestionDesStock.model.Ventes;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;


@Data
@Builder
public class VentesDTO {
    private Integer id;

    private String code;

    private Instant dateVente;

    private String commentaire;

    public static VentesDTO fromEntity(Ventes ventes){
        if (ventes == null){
            return null;
        }
        return VentesDTO.builder()
                .id(ventes.getId())
                .code(ventes.getCode())
                .dateVente(ventes.getDateVente())
                .commentaire(ventes.getCommentaire())
                .build();
    }

    public static Ventes toEntity(VentesDTO ventesDTO) {
        if (ventesDTO == null) {
            return null;
        }

        Ventes ventes = new Ventes();

        ventes.setId(ventesDTO.getId());
        ventes.setCode(ventesDTO.getCode());
        ventes.setDateVente(ventesDTO.getDateVente());
        ventes.setCommentaire(ventesDTO.getCommentaire());

        return ventes;
    }
}
