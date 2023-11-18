package com.Katinan.GestionDesStock.dto;

import com.Katinan.GestionDesStock.model.Adresse;
import com.Katinan.GestionDesStock.model.Article;
import com.Katinan.GestionDesStock.model.Entreprise;
import com.Katinan.GestionDesStock.model.Utilisateur;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;


@Data
@Builder
public class EntrepriseDTO  {
    private Integer id;

    private String nom;

    private String description;

    private Adresse adresse;

    private String codeFiscal;

    private String photo;

    private String email;

    private String numTel;

    private String siteWeb;

    private List<ArticleDTO> articles;

    private List<Utilisateur> utilisateurs;


    public static EntrepriseDTO fromEntity(Entreprise entreprise){
        if (entreprise == null){
            return null;
        }
        return EntrepriseDTO.builder()
                .id(entreprise.getId())
                .nom(entreprise.getNom())
                .description(entreprise.getDescription())
                .adresse(entreprise.getAdresse())
                .codeFiscal(entreprise.getCodeFiscal())
                .photo(entreprise.getPhoto())
                .email(entreprise.getEmail())
                .numTel(entreprise.getNumTel())
                .siteWeb(entreprise.getSiteWeb())
                .build();
    }

    public static Entreprise toEntity(EntrepriseDTO entrepriseDTO){

        if (entrepriseDTO == null){
            return null;
        }
        Entreprise entreprise = new Entreprise();

        entreprise.setId(entrepriseDTO.getId());
        entreprise.setNom(entrepriseDTO.getNom());
        entreprise.setDescription(entrepriseDTO.getDescription());
        entreprise.setAdresse(entrepriseDTO.getAdresse());
        entreprise.setCodeFiscal(entrepriseDTO.getCodeFiscal());
        entreprise.setPhoto(entrepriseDTO.getPhoto());
        entreprise.setEmail(entrepriseDTO.getEmail());
        entreprise.setNumTel(entrepriseDTO.getNumTel());
        entreprise.setSiteWeb(entrepriseDTO.getSiteWeb());

        return entreprise;

    }

}
