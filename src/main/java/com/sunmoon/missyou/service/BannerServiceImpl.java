package com.sunmoon.missyou.service;

import com.sunmoon.missyou.model.Banner;
import com.sunmoon.missyou.repository.BannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author San
 * @time 2021/11/8 00:48:22
 * @desc
 */

@Service
public class BannerServiceImpl implements BannerService{
    @Autowired
    private BannerRepository bannerRepository;

    @Override
    public Banner getByName(String name) {
        return bannerRepository.findOneByName(name);
    }
}
