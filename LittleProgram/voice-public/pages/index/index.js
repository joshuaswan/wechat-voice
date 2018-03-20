// pages/index/index.js
//获取应用实例
const app = getApp()
var config = require('../../config')

Page({

  /**
   * 页面的初始数据
   */
  data: {

  },

  onLogin: function (res) {
    var that = this;
    wx.login({
      success: function (res) {
        if (res.code) {
          wx.request({
            url: config.service.loginUrl,
            data: {
              code: res.code
            },
            success: function (res) {
              if (res.statusCode == 200) {
                console.log(res)
                wx.setStorageSync("openid", res.data.openId)
                wx.setStorageSync("sessionKey", res.data.sessionKey)
                that.createUser(res.data)
              }
            }
          })
        }
        else {
          console.log("登陆失败！" + res.errMsg);
        }
      }
    })
  },

  createUser: function (res) {
    var userInfo = this.data.userInfo;
    userInfo.openid = res.openId;
    wx.request({
      url: config.service.createUserUrl,
      header: {
        "Content-Type": "application/x-www-form-urlencoded"
      },
      method: "POST",
      data: this.data.userInfo,
      success: function (res) {

      }
    })
  },

  onGetUserInfo: function (res) {
    wx.getUserInfo({
      success: res => {
        wx.setStorageSync("userInfo", res.userInfo);
        wx.setStorageSync("hasUserInfo", true)
        this.setData({
          userInfo: res.userInfo,
          hasUserInfo: true
        })
      }
    })
  },

  onGetMenuList: function(res){
    var that = this;
    wx.request({
      url: config.service.getMenuListUrl,
      success:function(res){
        console.log(res.data);
        that.setData({
          menuList:res.data
        })
      }
    })
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.onGetUserInfo();
    this.onLogin();
    this.onGetMenuList();
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})