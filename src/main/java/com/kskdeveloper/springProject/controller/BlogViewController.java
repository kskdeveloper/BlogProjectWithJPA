package com.kskdeveloper.springProject.controller;

import lombok.RequiredArgsConstructor;
import com.kskdeveloper.springProject.domain.Article;
import com.kskdeveloper.springProject.DTO.ArticleListViewResponse;
import com.kskdeveloper.springProject.DTO.ArticleViewResponse;
import com.kskdeveloper.springProject.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class BlogViewController {

    private final BlogService blogService;

    @GetMapping("/articles")
    public String getArticles(Model model) {
        List<ArticleListViewResponse> articles = blogService.findAll()
                .stream()
                .map(ArticleListViewResponse::new)
                .toList();
        model.addAttribute("articles", articles);

        return "articleList";
    }


}
