package com.golden.springbootitem.service.impl;

import com.golden.springbootitem.pojo.Item;
import com.golden.springbootitem.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class ItemServiceImpl implements ItemService {

    private final static Map<Integer,Item> map = new HashMap<Integer,Item>();
    static {
        map.put(1,new Item(1,"西红柿",2.13,"http://1.png","酸甜可口"));
        map.put(2,new Item(2,"苹果",3.13,"http://2.png","钆喷催"));
        map.put(3,new Item(3,"娃哈哈",4.13,"http://3.png","酸甜可口"));
        map.put(4,new Item(4,"桃子",5.13,"http://4.png","酸甜可口"));
        map.put(5,new Item(5,"雪花梨",6.13,"http://5.png","酸甜可口"));
    }
    @Override
    public Item findItemById(Integer id) {
        Item item = map.get(id);
        return item;
    }

    @Override
    public List<Item> findAllItem() {
        List<Item> list = new ArrayList<Item>();
        for(Map.Entry<Integer,Item> map : map.entrySet()){
            list.add(map.getValue());
        }
        return list;
    }
}
