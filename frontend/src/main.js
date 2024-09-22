import { createApp } from 'vue'
import { createRouter, createWebHistory } from 'vue-router'
import App from './App.vue'
import PageA from './views/PageA.vue'
import PageB from './views/PageB.vue'

const routes = [
    { path: '/', component: PageA },
    { path: '/b', component: PageB }
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

const app = createApp(App)
app.use(router)
app.mount('#app')
