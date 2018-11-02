package com.golden.springbootitem.service;

import com.golden.springbootitem.pojo.Item;

import java.util.List;


public interface ItemService {
    public Item findItemById(Integer id);

    public List<Item> findAllItem();
}
