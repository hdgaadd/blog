package com.codeman.entity;

import com.codeman.domain.Article;
import com.codeman.domain.Comment;
import lombok.Data;

import java.util.List;

@Data
public class IndexResult {

    List<Article> articleList;
    List<Comment> commentList;

}
