<template>
<!--  导航栏颜色深浅-->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
<!--    导航栏-->
    <div class="container">
<!--      首页名字-->
<!--      <a class="navbar-brand" href="/">King Of Bots</a>-->
<!--      点对战、对局列表等不用刷新-->
      <router-link class="navbar-brand" :to="{name: 'home'}">King Of Bots</router-link>
      <div class="collapse navbar-collapse" id="navbarText">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <router-link class="nav-link" :to="{name: 'pk_index'}">对战</router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link" :to="{name: 'record_index'}">对局列表</router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link" :to="{name: 'ranklist_index'}">排行榜</router-link>
          </li>
        </ul>
        <ul class="navbar-nav">
<!--          下拉菜单-->
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
              xiawenfei
            </a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
              <li>
                <router-link class="dropdown-item" :to="{name: 'user_bot_index'}">我的Bot</router-link>
              </li>
              <li><hr class="dropdown-divider"></li>
              <li><a class="dropdown-item" href="#">退出</a></li>
            </ul>
          </li>
        </ul>
      </div>
    </div>
  </nav>
</template>

<script>

</script>

<style scoped>

</style>