package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Author: 江云飞
 * Date:   2019/3/26
 */

@Entity
@ApiModel("商品类别")
//烟酒，饮料，食品，牛奶，豆制品，粮油，调料，水果，蔬菜，速冻食品，日用百货，家电，散饼干，床上用品，成人用品
public class Category implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "商品类别ID",example = "1")
    private Integer id;

  /*  @ApiModelProperty(value = "商品类别ID外键",example = "烟酒")
    @Column(name = "goods_id")
    private  String goodsId;*/

    @ApiModelProperty(value = "商品类别",example = "烟酒")
    @Column(name = "category_name")
    private  String categoryName;


    @ApiModelProperty(value = "商品")
    @OneToMany(mappedBy = "category",cascade=CascadeType.ALL,fetch= FetchType.LAZY)
    private List<Goods> goodsList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }
}
