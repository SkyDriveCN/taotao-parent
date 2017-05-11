package com.taotao.manager.service;

import com.taotao.manager.po.TbItem;

import java.util.List;

/**
 * Name: ItemService
 * User: Edward Stock
 * Date: 2017/5/10
 * Time: 19:30
 */
public interface ItemService {
    TbItem getItemById(Long id);
    List<TbItem> getItemList();
}
