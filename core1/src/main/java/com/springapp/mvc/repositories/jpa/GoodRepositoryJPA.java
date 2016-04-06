package com.springapp.mvc.repositories.jpa;

import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.repositories.GoodRepositoryCustom;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by Rustam on 03.04.2016.
 */
@Repository
public class GoodRepositoryJPA implements GoodRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<GoodInfo> findGoodsByCategoryId(Long id) {
        CriteriaBuilder cb= entityManager.getCriteriaBuilder();
        CriteriaQuery<GoodInfo> query = cb.createQuery(GoodInfo.class);
        Root<GoodInfo> sm =query.from(GoodInfo.class);
        query.where(cb.equal(sm.get("category_id"),id));
        return entityManager.createQuery(query).getResultList();
    }
}
