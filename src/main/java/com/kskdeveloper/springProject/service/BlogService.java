package com.kskdeveloper.springProject.service;

import com.kskdeveloper.springProject.DTO.AddArticleRequest;
import com.kskdeveloper.springProject.domain.Article;
import com.kskdeveloper.springProject.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    //블로그 글 추가 메서트
    public Article save(AddArticleRequest request){

        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }
}
