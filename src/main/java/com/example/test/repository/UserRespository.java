package com.example.test.repository;

import com.example.test.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

/**
 * @Author zhangrui
 * @Date 14:33 2018/12/29
 * 用户Repository
 */
public interface UserRespository extends JpaRepository<User,Integer> {
//    User findById(int id);
    /**
     * 自定义查询方法
     * 通过姓名查询,参数为name
     * 相当于select * from user_tab where name = ?
     */
    List<User> findByUserName(String name);
    List<User> findByUserNameLike(String name);
    List<User> findByIdIn(Collection<Integer> ids);
}