<template>
  <div>
    <page-header></page-header>
    <hello></hello>
    <img src="assets/logo.png">
    <router-view></router-view>
  </div>
</template>

<script>
  import PageHeader from './components/common/PageHeader.vue'
  import Hello from './components/Hello.vue'
  export default {
    name: 'app',
    components: {
      Hello, PageHeader
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
