package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.List;

/**
 * Author: 江云飞
 * Date:   2019/3/28
 */


@Entity
@ApiModel("商品中级类别")
public class SecondaryCategory {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "商品中级类别ID",example = "1")
    private Integer id;


    @ApiModelProperty(value = "商品中级类名")
    @Column(name = "secondary_category_name")
    private  String secondaryCategoryName;

    /*子级分类*/
    @ApiModelProperty(value = "分类")
    @OneToMany(mappedBy = "secondaryCategory",cascade=CascadeType.ALL,fetch= FetchType.LAZY)
    private List<Category> CategoryList;


    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH},optional=false)
    @ApiModelProperty(value = "父级类别")
    private  BigCategory bigCategory;
}
