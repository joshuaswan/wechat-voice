<template>
  <div>
    <p>menu-list</p>
    <div>
      <span>Search:</span>
      <input name="query">
      <button class="btn" style="float: right;margin-right: 89px;" v-on:click="saveMenuList">保存</button>
      <button class="btn" style="float: right;margin-right: 5px;" v-on:click="newMenuList">新增</button>
    </div>
    <table class="table table-striped">
      <thead>
      <tr>
        <th>名称</th>
        <th>标题</th>
        <th>路径</th>
        <th>图标</th>
        <th>顺序</th>
      </tr>
      </thead>
      <tbody>
      <tr v-for="(item, index) in menuList">
        <td>
          <input type="text" v-model="menuList[index].name">
        </td>
        <td>
          <input type="text" v-model="menuList[index].title">
        </td>
        <td>
          <input type="text" v-model="menuList[index].pages">
        </td>
        <td>
          <button class="button"></button>
        </td>
        <td>
          <input type="text" v-model="menuList[index].orderNum">
        </td>
      </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
  import API from '../api'

  export default {
    name: '',
    data () {
      return {
        menuList: []
      }
    },
    components: {},
    methods: {
      newMenuList() {
        console.log("newMenuList");
        this.menuList.push({
          name: "",
          title: "",
          pages: "",
          icon: "",
          orderNum: ""
        })
      },
      saveMenuList(){

      }
    },
    created: function () {
        console.log("get all menu list");
        API.get("voice/api/menu/all")
    }
  }
</script>

<style>
</style>
