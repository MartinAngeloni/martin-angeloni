package com.topic3.topic3.repository;

import com.topic3.topic3.entity.Cart;

import java.util.List;

/**
 * Created by martin on 6/7/2018.
 */
public interface IRepository<T> {

    public T create(T t);
    public T get(int id);
    public void update(T t);
    public void delete(T t);
    public List<T> getAll();

}
