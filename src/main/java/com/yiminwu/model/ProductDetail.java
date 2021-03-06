package com.yiminwu.model;

import java.io.Serializable;

public class ProductDetail implements BaseObject {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_detail.Id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_detail.Detail
     *
     * @mbggenerated
     */
    private String detail;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_detail.Id
     *
     * @return the value of product_detail.Id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_detail.Id
     *
     * @param id the value for product_detail.Id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_detail.Detail
     *
     * @return the value of product_detail.Detail
     *
     * @mbggenerated
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_detail.Detail
     *
     * @param detail the value for product_detail.Detail
     *
     * @mbggenerated
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

   @Override
   public Serializable getPK() {
      return id;
   }

   @Override
   public String getName() {
      return "";
   }
}