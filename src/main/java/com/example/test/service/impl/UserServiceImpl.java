package com.example.test.service.impl;

import com.example.test.entity.User;
import com.example.test.repository.UserRespository;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;
//@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRespository userRespository;

    @Override
    public User findById(Integer id) {
        return userRespository.getOne(id);
    }

    @Override
    public List<User> findAll() {
        return userRespository.findAll();
    }

    //@Transactional
    @Override
    public User save(User user) {
        User user1 = userRespository.save(user);
        String error = null;
        error.split("/");
        return user1;
    }

    @Override
    public void delete(Integer id) {
        userRespository.deleteById(id);
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return userRespository.findAll(pageable);
    }

    @Override
    public List<User> findByUserName(String name) {
        return userRespository.findByUserName(name);
    }

    @Override
    public List<User> findByUserNameLike(String name) {
        return userRespository.findByUserNameLike(name);
    }

    @Override
    public List<User> findByIds(Collection<Integer> ids) {
        return userRespository.findByIdIn(ids);
    }

}
