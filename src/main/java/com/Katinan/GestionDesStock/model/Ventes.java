package com.Katinan.GestionDesStock.model;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Table(name = "vente")
public class Ventes  extends AbstractEntity{

    @Column(name = "code")
    private String code;

    @Column(name = "dateVente")
    private Instant dateVente;

    @Column(name = "commentaire")
    private String commentaire;

}
