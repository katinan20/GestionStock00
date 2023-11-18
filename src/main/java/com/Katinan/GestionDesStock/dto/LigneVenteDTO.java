package com.Katinan.GestionDesStock.dto;

import com.Katinan.GestionDesStock.model.LigneVente;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;


@Data
@Builder
public class LigneVenteDTO {

    private Integer id;

    private ArticleDTO articleDTO;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    private VentesDTO ventesDTO;

    public static LigneVenteDTO fromEntity(LigneVente ligneVente){
        if (ligneVente == null){
            return null;
        }
        return LigneVenteDTO.builder()
                .id(ligneVente.getId())
                .quantite(ligneVente.getQuantite())
                .prixUnitaire(ligneVente.getQuantite())
                .build();
    }

    public static LigneVente toEntity(LigneVenteDTO ligneVenteDTO){
        if (ligneVenteDTO == null){
            return null;
        }
        LigneVente ligneVente = new LigneVente();

        ligneVente.setId(ligneVenteDTO.getId());
        ligneVente.setQuantite(ligneVenteDTO.getQuantite());


        return ligneVente;
    }
}
