package com.Katinan.GestionDesStock.dto;

import com.Katinan.GestionDesStock.model.CommandeFournisseur;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;


@Data
@Builder
public class CommandeFournisseurDTO {
    private Integer id;

    private String code;

    private Instant dateCommande;

    private FournisseurDTO fournisseur;

    private List<LigneCommandeFourniseurDTO> ligneCommandeFourniseurDTOS;

    public static CommandeFournisseurDTO fromEntity(CommandeFournisseur commandeFournisseur){
        if (commandeFournisseur == null){
            return null;
        }
        return CommandeFournisseurDTO.builder()
                .id(commandeFournisseur.getId())
                .code(commandeFournisseur.getCode())
                .dateCommande(commandeFournisseur.getDateCommande())
                .build();
    }

    public static CommandeFournisseur toEntity(CommandeClientDTO commandeClientDTO){
        if (commandeClientDTO == null){
            return null;
        }
        CommandeFournisseur commandeFournisseur  = new CommandeFournisseur();

        commandeFournisseur.setId(commandeClientDTO.getId());
        commandeFournisseur.setCode(commandeClientDTO.getCode());
        commandeFournisseur.setDateCommande(commandeClientDTO.getDateCommande());

        return commandeFournisseur;
    }
}
