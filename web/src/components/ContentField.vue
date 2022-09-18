<template>
  <div class="container content-field">
    <div class="card">
      <div class="card-body">
<!--        容器里卡片填充的内容-->
          <slot></slot>
      </div>
    </div>
  </div>
</template>

<script>

</script>

<style scoped>
div.content-field {
  /*页面展示距离顶部20px*/
  margin-top: 20px;
}
</style>