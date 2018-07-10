//index.js
//获取应用实例
const app = getApp()

Page({

  onLoad: function () {
    console.log('index onload.......');
    //wx.request({
   //   url: 'http://193.112.93.23:8080/mall/center/getCenterMenus', //仅为示例，并非真实的接口地址
   //   header: {
      // 'content-type': 'application/json' // 默认值
    //  },
   //   success: function (res) {
     //  console.log(res.data)
     // }
   // });
  },
  saveContact:function() {
    wx.addPhoneContact({
      firstName:'笨笨的育儿笔记',
      title:'努力做一个合格的爸爸',
      email:'247952521@qq.com',
      weChatNumber:'woshiwuyimin',
      mobilePhoneNumber:'13560253314'
    });
  },
  makePhoneCall:function() {
    wx.makePhoneCall({
      phoneNumber:'13560257063'
    });
  }

  
  
})
