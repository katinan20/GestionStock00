package com.Katinan.GestionDesStock.service;

import com.Katinan.GestionDesStock.dto.ArticleDTO;
import com.Katinan.GestionDesStock.model.Article;
import com.Katinan.GestionDesStock.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.Katinan.GestionDesStock.dto.ArticleDTO.fromEntity;
import static com.Katinan.GestionDesStock.dto.ArticleDTO.toEntity;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public void ajouter(ArticleDTO articleDTO){
        Article val = toEntity(articleDTO);
        articleRepository.save(val);
    }

    public void supprimer(int id){
        articleRepository.deleteById(id);
    }

    public List <ArticleDTO> articleDTOList (Article article){
        ArticleDTO val = fromEntity(article);
        return articleRepository.listeOperation(val);
    }


}
