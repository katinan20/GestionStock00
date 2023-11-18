package com.Katinan.GestionDesStock.dto;

import com.Katinan.GestionDesStock.model.LigneCommandeFourniseur;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;


@Data
@Builder
public class LigneCommandeFourniseurDTO {

    private Integer id;

    private ArticleDTO articleDTO;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    private CommandeFournisseurDTO commandeFournisseurDTO;

    public static LigneCommandeFourniseurDTO fromEntity(LigneCommandeFourniseur ligneCommandeFourniseur){
        if (ligneCommandeFourniseur == null){
            return null;
        }
        return LigneCommandeFourniseurDTO.builder()
                .id(ligneCommandeFourniseur.getId())
                .quantite(ligneCommandeFourniseur.getQuantite())
                .prixUnitaire(ligneCommandeFourniseur.getPrixUnitaire())
                .build();
    }

    public static LigneCommandeFourniseur toEntity(LigneCommandeFourniseurDTO ligneCommandeFourniseurDTO){
        if (ligneCommandeFourniseurDTO == null){
            return null;
        }
        LigneCommandeFourniseur ligneCommandeFourniseur = new LigneCommandeFourniseur();
        ligneCommandeFourniseur.setId(ligneCommandeFourniseurDTO.getId());
        ligneCommandeFourniseur.setQuantite(ligneCommandeFourniseurDTO.getQuantite());
        ligneCommandeFourniseur.setPrixUnitaire(ligneCommandeFourniseurDTO.getPrixUnitaire());

        return ligneCommandeFourniseur;
    }
}
