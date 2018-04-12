/**
 * Created by joshua on 2018/4/10.
 */
import axios from 'axios'
import Cookies from 'js-cookie'
import Router from './router'
import CONFIG from './store/config'

axios.interceptors.request.use(
  config => {
    const token = Cookies.get('token')
    const subAcctName = Cookies.get('subAcctName')
    Cookies.set('token', token, {expires: 1})
    Cookies.set('subAcctName', subAcctName, {expires: 1})
    if (token) {
      config.headers.Authorization = `Bearer ` + token
    }
    return config
  },
  err => {
    return Promise.reject(err)
  }
)

// http response 拦截器
axios.interceptors.response.use(
  response => {
    return response
  },
  error => {
    if (error.response) {
      switch (error.response.status) {
        case 401:
          // 401 清除token信息并跳转到登录页面
          Cookies.remove('token')
          Router.replace({
            path: '/v/401',
            query: {redirect: Router.currentRoute.fullPath}
          })
      }
    }
    return Promise.reject(error.response.data)
  }
)

export default {
  get (url, options) {
    return new Promise((resolve, reject) => {
      axios.get(CONFIG.apiRoot + url, options).then((response) => {
        resolve(response.data)
      }).catch(function (error) {
        reject(error)
      })
    })
  },

  post (url, options) {
    return new Promise((resolve, reject) => {
      axios.post(CONFIG.apiRoot + url, options).then((response) => {
        resolve(response.data)
      }).catch(function (error) {
        reject(error)
      })
    })
  }
}
