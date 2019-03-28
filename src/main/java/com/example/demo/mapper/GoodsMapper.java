package com.example.demo.mapper;

import com.example.demo.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author: 江云飞
 * Date:   2019/3/28
 */

@Repository
@Mapper
public interface GoodsMapper {

    Integer insertGoods(Goods goods);

    Integer deletGoods(Integer id);

    Integer updateGoods(Goods goods);

    List<Goods> selectGoods(Goods goods);
}
