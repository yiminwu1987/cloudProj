package com.yiminwu.model;

import java.io.Serializable;

public class UserProfile implements BaseObject{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_profile.Id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_profile.Name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_profile.ImgUrl
     *
     * @mbggenerated
     */
    private String imgurl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_profile.Description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_profile.Introduction
     *
     * @mbggenerated
     */
    private String introduction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_profile.Phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_profile.WechatNo
     *
     * @mbggenerated
     */
    private String wechatno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_profile.QrCodeUrl
     *
     * @mbggenerated
     */
    private String qrcodeurl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_profile.Email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_profile.Company
     *
     * @mbggenerated
     */
    private String company;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_profile.Tag
     *
     * @mbggenerated
     */
    private String tag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_profile.Address
     *
     * @mbggenerated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_profile.ShareContent
     *
     * @mbggenerated
     */
    private String sharecontent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_profile.Id
     *
     * @return the value of user_profile.Id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_profile.Id
     *
     * @param id the value for user_profile.Id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_profile.Name
     *
     * @return the value of user_profile.Name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_profile.Name
     *
     * @param name the value for user_profile.Name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_profile.ImgUrl
     *
     * @return the value of user_profile.ImgUrl
     *
     * @mbggenerated
     */
    public String getImgurl() {
        return imgurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_profile.ImgUrl
     *
     * @param imgurl the value for user_profile.ImgUrl
     *
     * @mbggenerated
     */
    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_profile.Description
     *
     * @return the value of user_profile.Description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_profile.Description
     *
     * @param description the value for user_profile.Description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_profile.Introduction
     *
     * @return the value of user_profile.Introduction
     *
     * @mbggenerated
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_profile.Introduction
     *
     * @param introduction the value for user_profile.Introduction
     *
     * @mbggenerated
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_profile.Phone
     *
     * @return the value of user_profile.Phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_profile.Phone
     *
     * @param phone the value for user_profile.Phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_profile.WechatNo
     *
     * @return the value of user_profile.WechatNo
     *
     * @mbggenerated
     */
    public String getWechatno() {
        return wechatno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_profile.WechatNo
     *
     * @param wechatno the value for user_profile.WechatNo
     *
     * @mbggenerated
     */
    public void setWechatno(String wechatno) {
        this.wechatno = wechatno == null ? null : wechatno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_profile.QrCodeUrl
     *
     * @return the value of user_profile.QrCodeUrl
     *
     * @mbggenerated
     */
    public String getQrcodeurl() {
        return qrcodeurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_profile.QrCodeUrl
     *
     * @param qrcodeurl the value for user_profile.QrCodeUrl
     *
     * @mbggenerated
     */
    public void setQrcodeurl(String qrcodeurl) {
        this.qrcodeurl = qrcodeurl == null ? null : qrcodeurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_profile.Email
     *
     * @return the value of user_profile.Email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_profile.Email
     *
     * @param email the value for user_profile.Email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_profile.Company
     *
     * @return the value of user_profile.Company
     *
     * @mbggenerated
     */
    public String getCompany() {
        return company;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_profile.Company
     *
     * @param company the value for user_profile.Company
     *
     * @mbggenerated
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_profile.Tag
     *
     * @return the value of user_profile.Tag
     *
     * @mbggenerated
     */
    public String getTag() {
        return tag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_profile.Tag
     *
     * @param tag the value for user_profile.Tag
     *
     * @mbggenerated
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_profile.Address
     *
     * @return the value of user_profile.Address
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_profile.Address
     *
     * @param address the value for user_profile.Address
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_profile.ShareContent
     *
     * @return the value of user_profile.ShareContent
     *
     * @mbggenerated
     */
    public String getSharecontent() {
        return sharecontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_profile.ShareContent
     *
     * @param sharecontent the value for user_profile.ShareContent
     *
     * @mbggenerated
     */
    public void setSharecontent(String sharecontent) {
        this.sharecontent = sharecontent == null ? null : sharecontent.trim();
    }

   @Override
   public Serializable getPK() {
      return id;
   }
}