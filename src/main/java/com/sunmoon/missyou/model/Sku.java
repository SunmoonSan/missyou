package com.sunmoon.missyou.model;

import com.sunmoon.missyou.util.ListAndJson;
import com.sunmoon.missyou.util.MapAndJson;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @author San
 * @time 2021/11/10 08:06:06
 * @desc
 */
@Getter
@Setter
@Entity
public class Sku extends BaseEntity {
    @Id
    private Long id;
    private BigDecimal price;
    private BigDecimal discountPrice;
    private Boolean online;
    private String img;
    private String title;
    private Long spuId;
    private Long categoryId;
    private Long rootCategoryId;

    @Convert(converter = ListAndJson.class)
    private String specs;
    //    @Convert(converter = MapAndJson.class)
//    private Map<String, Object> test;
    private String code;
    private int stock;
}
