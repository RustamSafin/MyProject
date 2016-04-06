package com.springapp.mvc.repositories;

import com.springapp.mvc.common.GoodInfo;

import java.util.List;

/**
 * Created by Rustam on 03.04.2016.
 */
public interface GoodRepositoryCustom {
    List<GoodInfo> findGoodsByCategoryId(Long id);
}
