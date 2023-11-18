package com.Katinan.GestionDesStock.controller;

import com.Katinan.GestionDesStock.dto.ArticleDTO;
import com.Katinan.GestionDesStock.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

    @Autowired
     private ArticleService articleService;

    @PostMapping("/article")
    public ResponseEntity<String> enregistreArt(@RequestBody ArticleDTO articleDTO){
        return ResponseEntity.ok("Operation reusie");
    }


}
