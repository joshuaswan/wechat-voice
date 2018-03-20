/**
 * 小程序配置文件
 */

// var host = 'https://joshuaswan.club';
var host = 'http://localhost:8080';

var config = {

  service: {
    host,

    loginUrl: `${host}/wechat/login`,

    createUserUrl: `${host}/userinfo/create`,

    getMenuListUrl: `${host}/menu/all`,
    uploadThemeImage:`${host}/images`
  }
};

module.exports = config;