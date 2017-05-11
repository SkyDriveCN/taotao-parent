package com.taotao.manager.service.impl;

import com.taotao.manager.mapper.TbItemMapper;
import com.taotao.manager.po.TbItem;
import com.taotao.manager.po.TbItemExample;
import com.taotao.manager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Name: ItemServiceImpl
 * User: Edward Stock
 * Date: 2017/5/10
 * Time: 19:32
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private TbItemMapper itemMapper;
    /**
     * 根据商品id查询商品
     * @param id    商品id
     * @return  商品
     */
    @Override
    public TbItem getItemById(Long id) {
        TbItem item = itemMapper.selectByPrimaryKey(id);
        return item;
    }

    /**
     * 查询商品列表
     * @return  商品列表
     */
    @Override
    public List<TbItem> getItemList() {
        List<TbItem> itemList = itemMapper.selectByExample(new TbItemExample());
        return itemList;
    }
}
