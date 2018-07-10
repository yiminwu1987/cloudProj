
-- 创建数据库
create database cloud_mall;

use cloud_mall;

DROP TABLE IF EXISTS `classification`;

CREATE TABLE classification (
  Id   int  NOT NULL comment 'ID',
  ParentId   int  NULL comment 'Parent ID',
  Name varchar(64)  NOT NULL comment 'Name',
  ImgUrl varchar(512) NULL comment 'Img Url',
  Description  varchar(2000)  NULL comment 'Description'
) comment='分类'DEFAULT CHARSET=utf8;

ALTER TABLE classification ADD
    CONSTRAINT PK_classification PRIMARY KEY (Id);
-- add auto increment column
ALTER TABLE  classification  MODIFY  Id  int auto_increment;

DROP TABLE IF EXISTS `classification_attr`;

CREATE TABLE classification_attr (
  Id   int  NOT NULL comment 'ID',
  Name varchar(64)  NOT NULL comment 'Name',
  ClassificationId int  NOT NULL comment 'ClassificationId'
) comment='分类属性'DEFAULT CHARSET=utf8;

ALTER TABLE classification_attr ADD
    CONSTRAINT PK_classification_attr PRIMARY KEY (Id);
-- add auto increment column
ALTER TABLE  classification_attr  MODIFY  Id  int auto_increment;

DROP TABLE IF EXISTS `brand`;

CREATE TABLE brand (
  Id   int  NOT NULL comment 'ID',
  Name varchar(64)  NOT NULL comment 'Name',
  Description  varchar(2000)  NULL comment 'Description',
  LogoImgUrl varchar(512) NULL comment 'LogoImg'
) comment='品牌'DEFAULT CHARSET=utf8;

ALTER TABLE brand ADD
    CONSTRAINT PK_brand PRIMARY KEY (Id);
-- add auto increment column
ALTER TABLE  brand  MODIFY  Id  int auto_increment;

DROP TABLE IF EXISTS `img`;

CREATE TABLE img (
  Id   int  NOT NULL comment 'ID',
  FileName varchar(64)  NOT NULL comment 'File Name',
  Ts   datetime  NULL comment 'Ts',
  Path varchar(512)  NOT NULL comment 'Path',
  Ext varchar(64)  NOT NULL comment 'Ext',
  ImgSize int NULL comment 'Size',
  Width int NULL comment 'Width',
  Height int NULL comment 'Height'
) comment='图片'DEFAULT CHARSET=utf8;

ALTER TABLE img ADD
    CONSTRAINT PK_img PRIMARY KEY (Id);
-- add auto increment column
ALTER TABLE  img  MODIFY  Id  int auto_increment;

DROP TABLE IF EXISTS `product`;

CREATE TABLE product (
  Id   int  NOT NULL comment 'ID',
  Name varchar(64)  NOT NULL comment 'Name',
  CodeNo varchar(64)  NOT NULL comment 'Code No.',
  Description  varchar(2000)  NULL comment 'Description',
  BrandId int  NULL comment 'Brand ID',
  ClassificationId int  NULL comment 'Classification ID',
  ImgUrl  varchar(512) NULL comment 'ImgUrl',
  Img1Url varchar(512) NULL comment 'Img1Url',
  Img2Url varchar(512) NULL comment 'Img2Url',
  Img3Url varchar(512) NULL comment 'Img3Url',
  Img4Url varchar(512) NULL comment 'Img4Url',
  Img5Url varchar(512) NULL comment 'Img5Url',
  Price   decimal(18,2)  DEFAULT 0 NOT NULL comment 'Price',
  SellCount  int DEFAULT 0  NOT NULL comment 'Sell Count',
  ProductDetailPath   varchar(512)  NULL comment 'Product Detail Path',
  ProductDetailMobilePath  varchar(512)  NULL comment 'Product Detail Mobile Path',
  OnSale  bit  DEFAULT 0 NOT NULL comment 'On Sale'
) comment='产品'DEFAULT CHARSET=utf8;

ALTER TABLE product ADD
    CONSTRAINT PK_product PRIMARY KEY (Id);
-- add auto increment column
ALTER TABLE  product  MODIFY  Id  int auto_increment;

DROP TABLE IF EXISTS `product_attr_value`;

CREATE TABLE product_attr_value (
  ProductId   int  NOT NULL comment 'Product Id',
  AttrId      int  NOT NULL comment 'Attr Id',
  Value       varchar(64) NULL comment 'Value'
) comment='产品属性值'DEFAULT CHARSET=utf8;

ALTER TABLE product_attr_value ADD
    CONSTRAINT PK_product_detail PRIMARY KEY (ProductId, AttrId);
    
DROP TABLE IF EXISTS `product_other_attr`;

CREATE TABLE product_other_attr (
  Id   int  NOT NULL comment 'ID',
  Name varchar(64)  NOT NULL comment 'Name',
  Value varchar(64) NULL comment 'Value',
  ProductId int  NOT NULL comment 'ProductId'
) comment='产品其他属性'DEFAULT CHARSET=utf8;

ALTER TABLE product_other_attr ADD
    CONSTRAINT PK_product_other_attr PRIMARY KEY (Id);
-- add auto increment column
ALTER TABLE  product_other_attr  MODIFY  Id  int auto_increment;

DROP TABLE IF EXISTS `product_detail`;

CREATE TABLE product_detail (
  Id   int  NOT NULL comment 'ID',
  Detail LongText NULL comment 'Detail'
) comment='产品详情'DEFAULT CHARSET=utf8;

ALTER TABLE product_detail ADD
    CONSTRAINT PK_product_detail PRIMARY KEY (Id);

DROP TABLE IF EXISTS `layout_group`;

CREATE TABLE layout_group (
  Id   int  NOT NULL comment 'ID',
  Name varchar(64)  NOT NULL comment 'Name',
  LinkType varchar(64)  NOT NULL comment 'Link Type',
  ImgUrl varchar(512)   NULL comment 'Img Url',
  Description  varchar(2000)  NULL comment 'Description'
) comment='布局分组'DEFAULT CHARSET=utf8;

ALTER TABLE layout_group ADD
    CONSTRAINT PK_layout_group PRIMARY KEY (Id);
-- add auto increment column
ALTER TABLE  layout_group  MODIFY  Id  int auto_increment;

DROP TABLE IF EXISTS `layout_group_item`;

CREATE TABLE layout_group_item (
  GroupId   int  NOT NULL comment 'Group ID',
  MemberId  int  NOT NULL comment 'Member ID',
  MemberType  varchar(64)  NOT NULL comment 'Member Type'
) comment='布局分组项'DEFAULT CHARSET=utf8;

ALTER TABLE layout_group_item ADD
    CONSTRAINT PK_layout_group_item PRIMARY KEY (GroupId, MemberId, MemberType);

DROP TABLE IF EXISTS `layout`;

CREATE TABLE layout (
  Id   int  NOT NULL comment 'ID',
  Name varchar(64)  NOT NULL comment 'Name',
  ShowType varchar(64)  NOT NULL comment 'Show Type',
  Description  varchar(2000)  NULL comment 'Description'
) comment='布局'DEFAULT CHARSET=utf8;

ALTER TABLE layout ADD
    CONSTRAINT PK_layout PRIMARY KEY (Id);
-- add auto increment column
ALTER TABLE  layout  MODIFY  Id  int auto_increment;

DROP TABLE IF EXISTS `layout_item`;
CREATE TABLE layout_item (
  LayoutId  int  NOT NULL comment 'Layout ID',
  GroupId  int  NOT NULL comment 'Group ID'
) comment='布局项'DEFAULT CHARSET=utf8;

ALTER TABLE layout_item ADD
    CONSTRAINT PK_layout_item PRIMARY KEY (LayoutId, GroupId);

DROP TABLE IF EXISTS `user`;
CREATE TABLE user (
  Id   int  NOT NULL comment 'ID',
  Name varchar(64)  NOT NULL comment 'Name',
  Passward varchar(64)  NOT NULL comment 'Passward',
  Phone   varchar(64)  NULL comment 'Phone',  
  Type varchar(64)  NOT NULL comment 'Type',
  Code varchar(64)  NOT NULL comment 'Code',
  Description  varchar(2000)  NULL comment 'Description'
) comment='用户'DEFAULT CHARSET=utf8;

ALTER TABLE user ADD
    CONSTRAINT PK_user PRIMARY KEY (Id);
-- add auto increment column
ALTER TABLE  user  MODIFY  Id  int auto_increment;

DROP TABLE IF EXISTS `user_profile`;
CREATE TABLE user_profile (
  Id   int  NOT NULL comment 'ID',
  Name varchar(64)  NOT NULL comment 'Name',
  ImgUrl varchar(512) NULL comment 'Img Url',
  Description varchar(512)  NULL comment 'Description',
  Introduction varchar(2000)  NULL comment 'Introduction',
  Phone varchar(64)  NULL comment 'Phone',  
  WechatNo varchar(64) NULL comment 'Wechat No',
  QrCodeUrl varchar(512) NULL comment 'Qr Code Url',
  Email varchar(64) NULL comment 'Email',
  Company varchar(64) NULL comment 'Company',
  Tag varchar(64) NULL comment 'Tag',
  Address varchar(512) NULL comment 'Address',
  ShareContent varchar(512) NULL comment 'Share Content'
) comment='个人简介'DEFAULT CHARSET=utf8;

ALTER TABLE user_profile ADD
    CONSTRAINT PK_user_profile PRIMARY KEY (Id);






