package com.soft1611.jianshu.service.impl;

import com.soft1611.jianshu.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserServiceImplTest {
    @Resource
    private SysUserService sysUserService;

    @Test
    public void getOne() {
        System.out.println(sysUserService.getOne(1));
    }
}