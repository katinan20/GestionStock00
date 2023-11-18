package com.Katinan.GestionDesStock.dto;

import com.Katinan.GestionDesStock.model.Client;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;


@Data
@Builder
public class ClientDTO  {
    private Integer id;

    private String nom;

    private String prenom;

    private AdresseDTO adresse;

    private String photo;

    private String mail;

    private String numTel;

    private List<CommandeClientDTO> commandeClients;


    public static ClientDTO fromEntity(Client client){
        if (client == null){
            return null;
        }
        return ClientDTO.builder()
                .id(client.getId())
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .adresse(AdresseDTO.fromEntty(client.getAdresse()))
                .photo(client.getPhoto())
                .mail(client.getMail())
                .numTel(client.getNumTel())
                .build();
    }

    public static Client toEntity(ClientDTO clientDTO){
        if (clientDTO == null){
            return null;
        }

        Client client = new Client();

        client.setId(clientDTO.getId());
        client.setNom(clientDTO.getNom());
        client.setPrenom(clientDTO.getPrenom());
       // client.setAdresse(clientDTO.getAdresse());
        client.setPhoto(clientDTO.getPhoto());
        client.setMail(clientDTO.getMail());
        client.setNumTel(clientDTO.getNumTel());

        return client;
    }
}
