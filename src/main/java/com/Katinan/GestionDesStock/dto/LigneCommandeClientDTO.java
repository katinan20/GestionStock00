package com.Katinan.GestionDesStock.dto;

import com.Katinan.GestionDesStock.model.LigneCommandeClient;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;


@Data
@Builder
public class LigneCommandeClientDTO {
    private Integer id;

    private ArticleDTO articleDTO;

    private CommandeClientDTO commandeClientDTO;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    public static LigneCommandeClientDTO fromEntity(LigneCommandeClient ligneCommandeClient){
        if (ligneCommandeClient == null){
            return null;
        }
        return LigneCommandeClientDTO.builder()
                .id(ligneCommandeClient.getId())
                .quantite(ligneCommandeClient.getQuantite())
                .prixUnitaire(ligneCommandeClient.getPrixUnitaire())
                .build();
    }

    public static LigneCommandeClient toEntity(LigneCommandeClientDTO ligneCommandeClientDTO){
        if (ligneCommandeClientDTO == null){
            return null;
        }
        LigneCommandeClient ligneCommandeClient = new LigneCommandeClient();

        ligneCommandeClient.setId(ligneCommandeClientDTO.getId());
        ligneCommandeClient.setQuantite(ligneCommandeClientDTO.getQuantite());
        ligneCommandeClient.setPrixUnitaire(ligneCommandeClientDTO.getPrixUnitaire());

        return ligneCommandeClient;
    }

}
