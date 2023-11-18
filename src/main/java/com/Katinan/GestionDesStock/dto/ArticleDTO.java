package com.Katinan.GestionDesStock.dto;

import com.Katinan.GestionDesStock.model.Article;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;


@Data
@Builder
public class ArticleDTO {
    private Integer id;

    private String code;

    private String designation;

    private BigDecimal tauxUnitaireHt;

    private BigDecimal tauxTva;

    private BigDecimal prixUnitaireTtc;

    private String photo;

    private CategoryDTO category;

    private EntrepriseDTO entreprise;

    public static ArticleDTO fromEntity(Article article){
        if (article == null){
            return null;
        }

        return ArticleDTO.builder()
                .id(article.getId())
                .code(article.getCode())
                .designation(article.getDesignation())
                .prixUnitaireTtc(article.getPrixUnitaireTtc())
                .photo(article.getPhoto())
                .tauxUnitaireHt(article.getTauxUnitaireHt())
                .tauxTva(article.getTauxTva())
                .build();

    }

    public static Article toEntity(ArticleDTO articleDTO){
        if (articleDTO == null){
            return null;
        }
        Article article = new Article();
        article.setId(articleDTO.getId());
        article.setCode(articleDTO.getCode());
        article.setDesignation(articleDTO.getDesignation());
        article.setPrixUnitaireTtc(articleDTO.getPrixUnitaireTtc());
        article.setPhoto(articleDTO.getPhoto());
        article.setTauxTva(articleDTO.getTauxTva());
        article.setTauxUnitaireHt(articleDTO.getTauxUnitaireHt());

        return article;
    }

}
