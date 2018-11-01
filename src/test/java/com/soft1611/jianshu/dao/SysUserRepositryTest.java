package com.soft1611.jianshu.dao;

import com.soft1611.jianshu.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserRepositryTest {
    @Resource
    private SysUserRepository sysUserRepositry;

    @Test
    public void findSysUserByEmail() {
        SysUser sysUser = sysUserRepositry.findSysUserByEmail("aaa@qq.com");
        if (sysUser != null) {
            System.out.println(sysUser);
        }
    }

    @Test
    public void findByUserId() {
        System.out.println(sysUserRepositry.findByUserId(1));
    }
}