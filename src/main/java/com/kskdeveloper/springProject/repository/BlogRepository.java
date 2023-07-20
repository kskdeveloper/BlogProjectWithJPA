package com.kskdeveloper.springProject.repository;

import com.kskdeveloper.springProject.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {

}
