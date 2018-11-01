package com.soft1611.jianshu.controller;

import com.soft1611.jianshu.service.ArticleService;
import com.soft1611.jianshu.utils.ResponseUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/article")
@CrossOrigin("http://localhost")
public class ArticleController {
    @Resource
    private ArticleService articleService;
    @RequestMapping(value = "/hot", method = RequestMethod.GET)
    public ResponseUtil getHotArticles() {
        return new ResponseUtil(0, "get hot users!",articleService.getAll() );
    }
}
