package com.sunmoon.missyou.service;

import com.sunmoon.missyou.model.Spu;
import com.sunmoon.missyou.repository.SpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author San
 * @time 2021/11/10 00:16:33
 * @desc
 */

@Service
public class SpuService {

    @Autowired
    private SpuRepository spuRepository;

    public Spu getSpu(Long id) {
        return this.spuRepository.findOneById(id);
    }

    public Page<Spu> getLatestPagingSpu(Integer pageNum, Integer size) {
        Pageable page = PageRequest.of(pageNum, size, Sort.by("createTime").descending());
        return this.spuRepository.findAll(page);
    }

    public Page<Spu> getByCategory(Long cid, Boolean isRoot, Integer pageNum, Integer size) {
        Pageable page = PageRequest.of(pageNum, size, Sort.by("createTime").descending());
        Page<Spu> spuPage = null;
        if (isRoot) {
            return this.spuRepository.findByRootCategoryIdOrderByCreateTimeDesc(cid, page);
        } else {
            return this.spuRepository.findByCategoryIdOrderByCreateTimeDesc(cid, page);
        }
    }
}
