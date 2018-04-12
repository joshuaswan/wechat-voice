// pages/createTheme/createTheme.js

//获取应用实例
const app = getApp()
var config = require('../../config')
Page({

  /**
   * 页面的初始数据
   */
  data: {
  
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
  
  },

  /**
   * 上传主题图片
   */
  onUploadImage:function(res){
    wx.chooseImage({
      success: function(res) {
        var tempFilePaths = res.tempFilePaths
        wx.uploadFile({
          url: config.service.uploadThemeImage,
          filePath: tempFilePaths[0],
          name: 'file',
          formData : {
            'user':'test'
          },
          success:function(res){
            var data= res.data;
            console.log("upload image success" + res.data)
          },
          fail:function(res){
            var data = res.data;
            console.log("upload image fail" + res.data)
          },
          complete:function(res){
            var data = res.data;
            console.log("upload image complete" + res.data)
          }
        })
      },
    })
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