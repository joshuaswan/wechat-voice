/**
 * 小程序配置文件
 */

var host = 'http://localhost:8080';

var config = {

  service: {
    host,

    loginUrl: `${host}/wechat/login`,

    createUserUrl: `${host}/userinfo/create`
  }
};

module.exports = config;