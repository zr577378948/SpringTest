package com.example.test.service;

import com.example.test.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Collection;
import java.util.List;

public interface UserService {
    User findById(Integer id);
    List<User> findAll();
    User save(User user);
    void delete(Integer id);
    Page<User> findAll(Pageable pageable);
    List<User> findByUserName(String name);
    List<User> findByUserNameLike(String name);
    List<User> findByIds(Collection<Integer> ids);
}
