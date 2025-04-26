import Vue from 'vue'
import Router from 'vue-router'
import SinglePageApplication from '@/components/SinglePageApplication'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'SinglePageApplication',
      component: SinglePageApplication
    }

  ]
})
