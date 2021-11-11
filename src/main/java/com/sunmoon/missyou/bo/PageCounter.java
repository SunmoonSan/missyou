package com.sunmoon.missyou.bo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author San
 * @time 2021/11/11 00:06:36
 * @desc
 */
@Getter
@Setter
@Builder
public class PageCounter {
    private Integer page;
    private Integer count;
}
