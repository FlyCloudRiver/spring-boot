package com.example.demo.service;

import com.example.demo.entity.Goods;

import java.util.List;

/**
 * Author: 江云飞
 * Date:   2019/3/28
 */
public interface GoodsService {

    Integer insertGoods(Goods goods);

    Integer deletGoods(Integer id);

    Integer updateGoods(Goods goods);

    List<Goods> selectGoods(Goods goods);
}
