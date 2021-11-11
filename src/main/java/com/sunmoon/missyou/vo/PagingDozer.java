package com.sunmoon.missyou.vo;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;

/**
 * @author San
 * @time 2021/11/11 00:21:57
 * @desc
 */
public class PagingDozer<T, K> extends Paging {
    public PagingDozer(Page<T> pageT, Class<K> kClass) {
        this.initPageParameters(pageT);

        List<T> tList = pageT.getContent();
        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
        List<K> voList = new ArrayList<>();
        tList.forEach(t -> {
            System.out.println(t);
            K vo = mapper.map(t, kClass);
            voList.add(vo);
        });
        this.setItems(voList);
    }
}
