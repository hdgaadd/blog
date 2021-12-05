package com.codeman.domain;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hdgaadd
 * @since 2021-12-04
 */
public class ArticleCategoryRef implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章ID
     */
    private Integer articleId;

    /**
     * 分类ID
     */
    private Integer categoryId;


    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "ArticleCategoryRef{" +
        "articleId=" + articleId +
        ", categoryId=" + categoryId +
        "}";
    }
}
