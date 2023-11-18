package com.Katinan.GestionDesStock.dto;

import com.Katinan.GestionDesStock.model.Roles;
import com.Katinan.GestionDesStock.model.Utilisateur;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;


@Data
@Builder
public class RolesDTO {
    private Integer id;

    private String roleNom;

    private UtilisateurDTO utilisateurDTO;

    public static RolesDTO fromEntity(Roles roles){
        if (roles == null){
            return null;
        }
        return RolesDTO.builder()
                .id(roles.getId())
                .roleNom(roles.getRoleNom())
                .build();
    }

    public static Roles toEntity(RolesDTO rolesDTO){
        if (rolesDTO == null){
            return null;
        }
        Roles roles = new Roles();

        roles.setId(rolesDTO.getId());
        roles.setRoleNom(rolesDTO.getRoleNom());

        return roles;
    }
}
