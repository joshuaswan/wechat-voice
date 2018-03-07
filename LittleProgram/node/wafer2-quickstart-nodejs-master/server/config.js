const CONF = {
    port: '5757',
    rootPathname: '',

    // 微信小程序 App ID
    appId: 'wx71aafc68f6c46172',

    // 微信小程序 App Secret
    appSecret: 'b1c36aeec83b253e988b3112cad06650',

    // 是否使用腾讯云代理登录小程序
    useQcloudLogin: true,

    /**
     * MySQL 配置，用来存储 session 和用户信息
     * 若使用了腾讯云微信小程序解决方案
     * 开发环境下，MySQL 的初始密码为您的微信小程序 appid
     */
    mysql: {
      host: '172.21.0.11',
      port: 3306,
        user: 'root',
        db: 'theVoice',
        pass: '134679852lyy',
        char: 'utf8mb4'
    },

    cos: {
        /**
         * 地区简称
         * @查看 https://cloud.tencent.com/document/product/436/6224
         */
        region: 'ap-beijing',
        // Bucket 名称
        fileBucket: 'qcloudtest',
        // 文件夹
        uploadFolder: ''
    },

    // 微信登录态有效期
    wxLoginExpires: 7200,
    wxMessageToken: 'abcdefgh',
    serverHost: 'https://joshuaswan.club',
    // tunnelServerUrl: 'http://tunnel.ws.qcloud.la',
    // tunnelSignatureKey: '27fb7d1c161b7ca52d73cce0f1d833f9f5b5ec89',
    // 腾讯云相关配置可以查看云 API 秘钥控制台：https://console.cloud.tencent.com/capi
    qcloudAppId: '1256106843',
    qcloudSecretId: 'AKIDeCsdKrrOPFoKsObujZPIDBGldR6h4Zqx',
    qcloudSecretKey: 'X7cKwTp5FF9DMXmt3EMNa8pPn7bklcJS',
    // wxMessageToken: 'weixinmsgtoken',
    networkTimeout: 30000
}

module.exports = CONF
