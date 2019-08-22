package com.example.test;

import com.example.test.entity.User;
import com.example.test.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

    @Resource
    private UserService userService;

    @Test
    public void testRepository(){
        //通过id查找
        User userId = userService.findById(23);
        System.out.println("通过id查找的用户:"+userId.getUserName());
        //查找全部
        List<User> userList = userService.findAll();
        System.out.println("查找全部用户:"+userList.size());
        //保存
        User user = new User();
        user.setUserName("静吧吧");
        user.setPassWord("123");
        userService.save(user);
        //通过id删除
//        userService.delete(82);
        //通过名字查询
        List<User> userList2 = userService.findByUserName("我是十");
        System.out.println("通过名字查询:"+userList2.size());
        //通过名字模糊匹配
        List<User> userList3 = userService.findByUserNameLike("%十%");
        System.out.println("通过名字模糊匹配:"+userList3.size());
        //查询范围id
        Collection<Integer> collection=new ArrayList<Integer>(Arrays.asList(1,2,24,26));
        List<User> userList4 = userService.findByIds(collection);
        System.out.println("查询范围id:"+userList4.size());
        //分页查询数据
        PageRequest pageRequest = new PageRequest(0,5);
        Page<User> all = userService.findAll(pageRequest);
        System.out.println("查询分页::"+all.getSize());

    }

    @Test
    public void testTransaction(){
        User user = new User();
        user.setUserName("蔡蔡");
        user.setPassWord("123");
        userService.save(user);
    }
    @Test
    public void contextLoads() {
    }

}
