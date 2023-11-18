package com.Katinan.GestionDesStock.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Table(name = "roles")
public class Roles extends AbstractEntity {

    @Column(name = "roleNom")
    private String roleNom;

    @ManyToOne
    @JoinColumn(name = "idUtilisateur")
    private Utilisateur utilisateur;

}
