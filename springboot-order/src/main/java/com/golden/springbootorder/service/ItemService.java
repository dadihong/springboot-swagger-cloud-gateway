package com.golden.springbootorder.service;

import com.golden.springbootorder.pojo.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@FeignClient(value = "springboot-item")
public interface ItemService {

    @GetMapping(value = "item/{id}")
    public Item findItemByid(@PathVariable("id") Integer id);

    @GetMapping(value = "item/all")
    public List<Item> findAllItem();
}
