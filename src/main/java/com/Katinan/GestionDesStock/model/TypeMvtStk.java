package com.Katinan.GestionDesStock.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "TypeMvtStk")
public class TypeMvtStk extends AbstractEntity{

    @Column(name = "name")
    private String name;

    @ManyToOne()
    private MvtStk mvtStk;
}
