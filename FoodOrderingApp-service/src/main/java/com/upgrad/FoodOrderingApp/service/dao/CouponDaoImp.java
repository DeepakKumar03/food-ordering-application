package com.upgrad.FoodOrderingApp.service.dao;

import com.upgrad.FoodOrderingApp.service.entity.CouponEntity;
import com.upgrad.FoodOrderingApp.service.exception.CouponNotFoundException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

@Repository
public class CouponDaoImp implements CouponDao {

  @PersistenceContext private EntityManager entityManager;

  /**
   * @param couponName
   * @return CouponEntity
   * @throws CouponNotFoundException
   */
  public CouponEntity getCouponByCouponName(final String couponName)
      throws CouponNotFoundException {
    try {
      return entityManager
          .createNamedQuery("getCouponByName", CouponEntity.class)
          .setParameter("coupon_name", couponName)
          .getSingleResult();
    } catch (NoResultException nre) {
      return null;
    }
  }

  /**
   * @param couponUuid
   * @return CouponEntity
   */
  public CouponEntity getCouponByCouponUuid(final String couponUuid) {
    try {
      return entityManager
          .createNamedQuery("getCouponById", CouponEntity.class)
          .setParameter("uuid", couponUuid)
          .getSingleResult();
    } catch (NoResultException nre) {
      return null;
    }
  }
}
