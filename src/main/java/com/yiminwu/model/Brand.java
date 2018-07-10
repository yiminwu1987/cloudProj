package com.yiminwu.model;

import java.io.Serializable;

public class Brand implements BaseObject{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column brand.Id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column brand.Name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column brand.Description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column brand.LogoImgUrl
     *
     * @mbggenerated
     */
    private String logoimgurl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column brand.Id
     *
     * @return the value of brand.Id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column brand.Id
     *
     * @param id the value for brand.Id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column brand.Name
     *
     * @return the value of brand.Name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column brand.Name
     *
     * @param name the value for brand.Name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column brand.Description
     *
     * @return the value of brand.Description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column brand.Description
     *
     * @param description the value for brand.Description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column brand.LogoImgUrl
     *
     * @return the value of brand.LogoImgUrl
     *
     * @mbggenerated
     */
    public String getLogoimgurl() {
        return logoimgurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column brand.LogoImgUrl
     *
     * @param logoimgurl the value for brand.LogoImgUrl
     *
     * @mbggenerated
     */
    public void setLogoimgurl(String logoimgurl) {
        this.logoimgurl = logoimgurl == null ? null : logoimgurl.trim();
    }

   @Override
   public Serializable getPK() {
      return id;
   }
}