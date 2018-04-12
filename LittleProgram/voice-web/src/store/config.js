/**
 * Created by joshua on 2018/4/10.
 */

export default {
  apiRoot: process.env.NODE_ENV === 'production' ? (window.document.location.protocol + '//' + window.document.location.host + '/voice/api') : '',
  // apiRoot: process.env.NODE_ENV === 'production' ? (window.document.location.protocol + '//' + window.document.location.host + '/ssa') : '',
  mobile: false,
  sidebar: true
}

