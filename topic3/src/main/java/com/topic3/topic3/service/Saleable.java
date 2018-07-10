package com.topic3.topic3.service;

/**
 * Created by martin on 9/7/2018.
 */
public interface Saleable<T,K> {
    public T buy(K k);
}
