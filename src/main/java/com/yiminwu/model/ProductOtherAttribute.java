package com.yiminwu.model;

import java.io.Serializable;

public class ProductOtherAttribute implements BaseObject{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_other_attr.Id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_other_attr.Name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_other_attr.Value
     *
     * @mbggenerated
     */
    private String value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_other_attr.ProductId
     *
     * @mbggenerated
     */
    private Long productid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_other_attr.Id
     *
     * @return the value of product_other_attr.Id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_other_attr.Id
     *
     * @param id the value for product_other_attr.Id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_other_attr.Name
     *
     * @return the value of product_other_attr.Name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_other_attr.Name
     *
     * @param name the value for product_other_attr.Name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_other_attr.Value
     *
     * @return the value of product_other_attr.Value
     *
     * @mbggenerated
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_other_attr.Value
     *
     * @param value the value for product_other_attr.Value
     *
     * @mbggenerated
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_other_attr.ProductId
     *
     * @return the value of product_other_attr.ProductId
     *
     * @mbggenerated
     */
    public Long getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_other_attr.ProductId
     *
     * @param productid the value for product_other_attr.ProductId
     *
     * @mbggenerated
     */
    public void setProductid(Long productid) {
        this.productid = productid;
    }

   @Override
   public Serializable getPK() {
      return id;
   }
}