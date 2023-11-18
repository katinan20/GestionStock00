package com.Katinan.GestionDesStock.model;


import com.Katinan.GestionDesStock.dto.AdresseDTO;
import com.Katinan.GestionDesStock.dto.EntrepriseDTO;
import com.Katinan.GestionDesStock.dto.RolesDTO;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Table(name = "utilisateur")
public class Utilisateur extends AbstractEntity {

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "mail")
    private String mail;

    @Column(name = "dateNaissance")
    private Instant dateNaissance;

    @Column(name = "motDePasse")
    private String motDePasse;

    @Column(name = "adresse")
    private Adresse adresse;

    @Column(name = "photo")
    private String photo;

    @OneToMany(mappedBy = "utilisateur")
    private List<Roles> rolesDTOS;

    @ManyToOne
    @JoinColumn(name = "identreprise")
    private Entreprise entreprise;


}
