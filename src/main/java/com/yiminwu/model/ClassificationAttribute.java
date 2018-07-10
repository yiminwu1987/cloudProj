package com.yiminwu.model;

import java.io.Serializable;

public class ClassificationAttribute implements BaseObject{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification_attr.Id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification_attr.Name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification_attr.ClassificationId
     *
     * @mbggenerated
     */
    private Integer classificationid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification_attr.Id
     *
     * @return the value of classification_attr.Id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification_attr.Id
     *
     * @param id the value for classification_attr.Id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification_attr.Name
     *
     * @return the value of classification_attr.Name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification_attr.Name
     *
     * @param name the value for classification_attr.Name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification_attr.ClassificationId
     *
     * @return the value of classification_attr.ClassificationId
     *
     * @mbggenerated
     */
    public Integer getClassificationid() {
        return classificationid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification_attr.ClassificationId
     *
     * @param classificationid the value for classification_attr.ClassificationId
     *
     * @mbggenerated
     */
    public void setClassificationid(Integer classificationid) {
        this.classificationid = classificationid;
    }

   @Override
   public Serializable getPK() {
      return id;
   }
}