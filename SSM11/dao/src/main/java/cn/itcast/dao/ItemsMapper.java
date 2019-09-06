package cn.itcast.dao;

import cn.itcast.domain.Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ItemsMapper {
    @Select("select * from items")
    List<Item> findAll();

    @Select("select * from items where id = #{id}")
    Item findById(Integer id);
}
