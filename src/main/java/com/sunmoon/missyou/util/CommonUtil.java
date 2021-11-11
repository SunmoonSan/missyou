package com.sunmoon.missyou.util;

import com.sunmoon.missyou.bo.PageCounter;

/**
 * @author San
 * @time 2021/11/11 00:01:56
 * @desc
 */
public class CommonUtil {
    public static PageCounter convertToPageParameter(Integer start, Integer count) {
        int pageNum = start / count;
        PageCounter pageCounter = PageCounter.builder()
                .page(pageNum)
                .count(count)
                .build();
        return pageCounter;
    }
}
