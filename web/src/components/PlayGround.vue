<template>
  <div class="playground">
      <GameMap/>
  </div>
</template>

<script>
import GameMap from "./GameMap.vue";

export default {
  components: {
    GameMap
  }
}
</script>

<style scoped>
div.playground {
  width: 60vw;
  height: 70vh;
  /*auto 浏览器页面放缩, 页面等比例放缩*/
  margin: 40px auto;
  /*background: lightblue;*/
}
</style>