/**
 * 小程序配置文件
 */

var host = 'https://joshuaswan.club';

var config = {

  service: {
    host,

    loginUrl: `${host}/wechat/login`,

    createUserUrl: `${host}/userinfo/create`
  }
};

module.exports = config;