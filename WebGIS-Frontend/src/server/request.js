import Taro from '@tarojs/taro'

// const HOST = 'http://146.56.250.230:8888/' //服务器IP地址
// const HOST = 'http://10.25.7.102:8888/' //本机IP地址
const HOST = "http://124.221.22.144:8888/"

const http = (params) => new Promise((resolve, reject) => {
  Taro.request({
    url: `${HOST}${params.url}`,
    data: params.data,
    method: params.method, // "OPTIONS" | "GET" | "HEAD" | "POST" | "PUT" | "DELETE" | "TRACE" | "CONNECT"
    header: {
      'content-type': 'application/json'
    },
    timeout: 60000,
    success: (res) => { resolve(res.data) },
    fail: (err) => { reject(err) },
    complete: () => { }
  })
})

export { http, HOST }