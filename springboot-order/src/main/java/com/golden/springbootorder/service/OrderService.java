package com.golden.springbootorder.service;

import com.golden.springbootorder.pojo.Item;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private ItemService itemService;
    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "baclMethod")
    public Item findById(Integer id){

        Item item = itemService.findItemByid(id);
        return item;
    }
    public Item baclMethod(Integer id){
        return new Item();
    }
    @HystrixCommand(fallbackMethod = "findAllBack")
    public List<Item> findAllItem(){
        return itemService.findAllItem();
    }
    public List<Item> findAllBack(){
        return new ArrayList<Item>();
    }
}
