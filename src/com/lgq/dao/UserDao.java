package com.lgq.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lgq.obj.UserObj;

@Repository("UserDao")
public interface UserDao {

    public List<UserObj> findAll();
}
