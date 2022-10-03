<template>
  <NavBar />
  <router-view></router-view>
</template>

<script>
import NavBar from './components/NavBar'
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/dist/js/bootstrap"

export default {
  components: {
    NavBar
  },
  setup() {
    // $.ajax({
    //   url: "http://127.0.0.1:3000/user/account/token/",
    //   type: "post",
    //   data: {
    //     username: "lulu",
    //     password: "123",
    //   },
    //   success(resp) {
    //     if (resp.error_message === "success") console.log(resp);
    //   },
    //   error(resp) {
    //     console.log(resp);
    //   }
    // });
    //
    // $.ajax({
    //   url: "http://127.0.0.1:3000/user/account/register/",
    //   type: "post",
    //   data: {
    //     username: "yxc",
    //     password: "123",
    //     confirmedPassword: "123"
    //   },
    //   success(resp) {
    //     console.log(resp);
    //   },
    //   error(resp) {
    //     console.log(resp);
    //   }
    // });
  }
}
</script>

<style>
body {
  /*@为src目录*/
  background-image: url("@/assets/images/background.png");
  background-size: cover;
}
</style>
