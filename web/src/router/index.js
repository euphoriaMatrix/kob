import { createRouter, createWebHistory } from 'vue-router'
import PkIndexView from '../views/pk/PkIndexView'
import RecordIndexView from '../views/record/RecordIndexView'
import RanklistIndexView from '../views/ranklist/RankListIndexView'
import UserBotIndexView from '../views/user/UserBotIndexView'
import NotFound from '../views/error/NotFound'

const routes = [
    // 根目录映射到pk页面
  {
    path: "/",
    name: "home",
    redirect: "/pk/", // 重定向
  },
  {
    path: "/pk/",
    name: "pk_index",
    component: PkIndexView,
  },
  {
    path: "/record/",
    name: "record_index",
    component: RecordIndexView,
  },
  {
    path: "/ranklist/",
    name: "ranklist_index",
    component: RanklistIndexView,
  },
  {
    path: "/user/bot",
    name: "user_bot_index",
    component: UserBotIndexView,
  },
  {
    path: "/404",
    name: "404",
    component: NotFound,
  },
  {
    path: "/:catchAll(.*)",
    redirect: "/404/",
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
