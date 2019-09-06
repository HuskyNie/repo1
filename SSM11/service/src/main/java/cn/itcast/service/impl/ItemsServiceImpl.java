package cn.itcast.service.impl;

import cn.itcast.dao.ItemsMapper;
import cn.itcast.domain.Item;
import cn.itcast.service.IItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ItemsServiceImpl implements IItemsService {

    @Autowired
    private ItemsMapper itemsMapper;

    public List<Item> findAll() {
        return itemsMapper.findAll();
    }

    public Item findById(Integer id) {
        return itemsMapper.findById(id);
    }
}
