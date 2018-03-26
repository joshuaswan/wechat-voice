<template>
  <div id="app">
    <div>
      <button v-on:click="test"></button>
    </div>

  </div>
</template>

<script>
export default {
  name: 'App',
  data(){
      return {
          message:"hello Vue!"
      }
  },
  methods:{
    test: function (res) {
      console.log("test");
    }
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
