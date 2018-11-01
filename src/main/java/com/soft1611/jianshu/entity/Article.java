package com.soft1611.jianshu.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@Builder
public class Article {
    @Id
    @GeneratedValue
    private Integer articleId;
    @Column(nullable = false)
    private String articleTitle;
    @Column(nullable = false)
    private String articleAuthorId;
    @Column(nullable = false)
    private String articleAuthor;
    @Column(nullable = false)
    private String articleContent;
    private String articlePic;

}
