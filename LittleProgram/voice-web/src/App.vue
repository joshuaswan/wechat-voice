<template>
  <div>
    <ul>
      <li v-for="item in links"><a @click="$goRoute(item.route)">{{item.text}}</a></li>
    </ul>
    <router-view></router-view>
  </div>
</template>

<script>
  export default {
    name: 'app',
    data () {
      return {
        links: [
          {
            text: 'home',
            route: '/home'
          },
          {
            text: 'menu-list',
            route: '/menu-list'
          },
          {
            text: 'voice',
            route: '/voice'
          }
        ]
      }
    }
  }
</script>

<style>
  @import "style/css/bootstrap.css";

  .text-center {
    text-align: center;
  }
  .spacing {
    margin-top: 30px;
  }
  .red {
    color: darkred;
  }
  ul li {
    display: inline-block;
    margin-right: 10px;
  }
  ul li a{
    display: inherit;
    padding: 5px 10px;
    border: 1px solid #ccc;
  }
  ul li a:hover{
    cursor: pointer;
    color: #fff;
    background-color: #138bec;
    border: 1px solid #138bec;
  }
</style>
