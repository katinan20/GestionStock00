package com.Katinan.GestionDesStock.dto;

import com.Katinan.GestionDesStock.model.Article;
import com.Katinan.GestionDesStock.model.MvtStk;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;


@Data
@Builder
public class MvtStkDTO {

    private Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;

    private ArticleDTO articleDTO;

    private TypeMvtStk typeMvtStk;

    public static MvtStkDTO fromEntity(MvtStk mvtStk){
        if (mvtStk == null){
            return null;
        }
        return MvtStkDTO.builder()
                .id(mvtStk.getId())
                .dateMvt(mvtStk.getDateMvt())
                .quantite(mvtStk.getQuantite())
                .build();
    }


    public static MvtStk toEntity(MvtStkDTO mvtStkDTO){
        if (mvtStkDTO == null){
            return null;
        }

        MvtStk mvtStk = new MvtStk();

        mvtStk.setId(mvtStkDTO.getId());
        mvtStk.setDateMvt(mvtStkDTO.getDateMvt());
        mvtStk.setQuantite(mvtStkDTO.getQuantite());

        return mvtStk;
    }
}
