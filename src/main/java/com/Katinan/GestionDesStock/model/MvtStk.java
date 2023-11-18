package com.Katinan.GestionDesStock.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Table(name = "mvtstk")
public class MvtStk  extends AbstractEntity{

    @Column(name = "dataMvt")
    private Instant dateMvt;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;

    @OneToMany(mappedBy = "mvtStk")
    private List <TypeMvtStk> typeMvtStk;

}
