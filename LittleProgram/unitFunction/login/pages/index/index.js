// pages/index/index.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
  
  },

  onLogin: function(res){
    console.log("start login");
    wx.login({
      success: function(res){
        if(res.code){
          wx.request({
            url: 'http://localhost:8080/wechat/login',
            data:{
              code: res.code
            }
          })
        }
        else{
          console.log("登陆失败！" + res.errMsg);
        }
        console.log(res.code);
      }
    })
  },

  onGetUserInfo:function(res){
    console.log("start get user info");
    wx.getUserInfo({
      success: res=>{
        console.log("start system getUserInfo,and res is " + res)
        this.setData({
          userInfo: res.userInfo,
          hasUserInfo: true
        })
      }
    })
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
  
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