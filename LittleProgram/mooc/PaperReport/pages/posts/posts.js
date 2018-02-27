// pages/posts/posts.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    // date:"Nov 18 2017",
    // title: "title in js"
  },

  process: function(){
    // var date = "Nov 18 2017";
    // var date_ele = document.getElementsById
  }
  ,

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    console.log("onload");
    var post_content1={
      date:"Sep 18 2017",
        title:"title 01",
        post_img:"/images/post/crab.png",
        content:"this is the first post content",
        view_num:"112",
        collect_num:"98",
        author_img:"/images/avatar/1.png"
    };
    this.setDate(post_content1);
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
    console.log("onReady");
  
  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {
    console.log("onShow");
  
  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {
    console.log("onHide");
  
  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {
    console.log("onUnload");
  
  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {
    console.log("onPullDownRefresh");
  
  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {
    console.log("onReachBottom");
  
  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {
    console.log("onShareAppMessage");
  
  }
})