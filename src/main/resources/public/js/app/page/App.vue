<template>
  <header class="header" id="app">

    <el-menu theme="dark">
      <el-menu-item index="1" route="/front" disabled="false">首页</el-menu-item>
      <el-submenu index="2">
        <template slot="title">分类</template>
        <el-menu-item index="2-1" route="/language" disabled="false">语言</el-menu-item>
        <el-menu-item index="2-2" route="/framework" disabled="false">框架</el-menu-item>
        <el-menu-item index="2-3" route="/tools" disabled="false">工具</el-menu-item>
      </el-submenu>
    </el-menu>

  </header>
</template>

<script>
  export default {
    name: 'App'
  }
</script>
