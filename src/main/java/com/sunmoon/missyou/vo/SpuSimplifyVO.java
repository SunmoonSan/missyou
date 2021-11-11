package com.sunmoon.missyou.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author San
 * @time 2021/11/10 12:34:00
 * @desc
 */

@Setter
@Getter
public class SpuSimplifyVO {
    private Long id;
    private String title;
    private String subtitle;
    private String img;
    private String forThemeImg;
    private String price;
    private String discountPrice;
    private String description;
    private String tags;
    private Long sketchSpecId;
}
