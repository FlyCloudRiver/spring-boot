package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "goods")
//不与@Table结合的话 表名 默认为 SnakeCaseStrategy(命名策略 )为表名
@ApiModel("商品")
public class Goods implements Serializable {

    //商品唯一标识
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "商品ID",example = "1")
    private Integer id;

    @ApiModelProperty(value = "商品编号")
    @Column(name = "goods_code")
    private  String goodsCode;

    @ApiModelProperty(value = "商品名称",example = "思源方便面")
    @Column(name = "goods_name")
    private  String goodsName;

    @ApiModelProperty(value = "商品单价",example = "3.5")
    @Column(name = "goods_price")
    private  Float goodsPrice;

    @ApiModelProperty(value = "商品种类")
    @Column(name = "goods_type")
    private  Integer goodsType;


    @ApiModelProperty(value = "商品数量")
    @Column(name = "goods_number")
    private  Integer goodsNumber;

    @ApiModelProperty(value = "商品保质期")
    @Column(name = "goods_shelf_life")
    private  Integer goodsShelfLife;

    @ApiModelProperty(value = "商品生产日期")
    @Column(name = "goods_date")
    private Date goodsDate;

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH},optional=false)//可选属性optional=false,表示author不能为空。删除文章，不影响用户
    @ApiModelProperty(value = "商品所属厂商")
    private  Supplier supplier;

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH},optional=false)//可选属性optional=false,表示author不能为空。删除文章，不影响用户
    @ApiModelProperty(value = "商品所属类别")
    private  Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Float getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Float goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Integer getGoodsShelfLife() {
        return goodsShelfLife;
    }

    public void setGoodsShelfLife(Integer goodsShelfLife) {
        this.goodsShelfLife = goodsShelfLife;
    }

    public Date getGoodsDate() {
        return goodsDate;
    }

    public void setGoodsDate(Date goodsDate) {
        this.goodsDate = goodsDate;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
