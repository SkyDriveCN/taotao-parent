package com.taotao.manager.web.controller;

import com.taotao.manager.po.TbItem;
import com.taotao.manager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Name: ItemController
 * User: Edward Stock
 * Date: 2017/5/11
 * Time: 0:27
 */
@Controller
@RequestMapping("item")
public class ItemController {
    @Autowired
    private ItemService itemService;
    @RequestMapping("{id}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long id){
        TbItem item = itemService.getItemById(id);
        return item;
    }
    @RequestMapping("list")
    @ResponseBody
    public List<TbItem> getItemList(){
        List<TbItem> itemList = itemService.getItemList();
        return itemList;
    }
}
