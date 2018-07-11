package com.topic3.topic3.repository;

import java.util.List;

/**
 * Generic to implement in all repositories
 * Created by martin on 6/7/2018.
 * @author angelonimartin90@gmail.com
 */
public interface IRepository<T> {

    public T create(T t);
    public T get(int id);
    public void update(T t);
    public void delete(T t);
    public List<T> getAll();

}
