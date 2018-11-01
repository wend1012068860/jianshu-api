package com.soft1611.jianshu.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleRepositoryTest {
    @Resource
    private ArticleRepository articleRepository;

    @Test
    public void getAll(){
        System.out.println(articleRepository.findAll());
    }

}