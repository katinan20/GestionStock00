package com.Katinan.GestionDesStock.repository;

import com.Katinan.GestionDesStock.dto.ArticleDTO;
import com.Katinan.GestionDesStock.model.Article;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArticleRepository extends CrudRepository<Article,Integer> {
    @Query("select a from Article a where a.entreprise.id=:x order by a.creationDate desc")
    List<ArticleDTO> listeOperation(@Param("x") ArticleDTO codec);

}
