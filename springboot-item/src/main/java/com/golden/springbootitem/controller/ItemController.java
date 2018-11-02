package com.golden.springbootitem.controller;

import com.golden.springbootitem.pojo.Item;
import com.golden.springbootitem.service.ItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api("商品controller")
public class ItemController {

    @Autowired
    private ItemService itemService;
    @ApiOperation(value = "根据id查询商品信息", notes = "查询数据库中某个的商品信息")
    @ApiImplicitParam(name = "id", value = "商品ID", paramType = "path", required = true, dataType = "Integer")
    @GetMapping(value = "item/{id}")
    public Item findById(@PathVariable("id") Integer id){
        Item item = itemService.findItemById(id);
        return item;
    }
    @ApiOperation(value = "查询所有商品信息", notes = "查询数据库中所有商品信息")
    @GetMapping(value = "item/all")
    public List<Item> findAllItem(){
        List<Item> allItem = itemService.findAllItem();
        return allItem;
    }
}
