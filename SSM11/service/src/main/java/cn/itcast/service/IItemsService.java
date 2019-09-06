package cn.itcast.service;

import cn.itcast.domain.Item;

import java.util.List;

public interface IItemsService {
    List<Item> findAll();

    Item findById(Integer id);
}
