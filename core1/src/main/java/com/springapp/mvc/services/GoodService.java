package com.springapp.mvc.services;

import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.repositories.GoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Gataullin Kamil
 * 07.03.2016 0:20
 */
@Service
public class GoodService {

    @Autowired
    private GoodRepository goodRepository;

    public GoodInfo getGood(Long goodId) {
        return goodRepository.getGoodById(goodId);
    }

    @Transactional  // оборачивает данный метод в Транзакцию
    public void add(GoodInfo goodInfo) {
        goodRepository.saveAndFlush(goodInfo) ;
    }

    @Transactional  // оборачивает данный метод в Транзакцию
    public void update(GoodInfo goodInfo) {
        goodRepository.saveAndFlush(goodInfo);
    }

    @Transactional  // оборачивает данный метод в Транзакцию
    public void delete(Long goodId) {
        goodRepository.delete(goodId);
    }

}
