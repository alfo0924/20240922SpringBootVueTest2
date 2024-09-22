import { createRouter, createWebHistory } from 'vue-router'
import PageA from '../views/PageA.vue'
import PageB from '../views/PageB.vue'

const routes = [
    {
        path: '/',
        name: 'PageA',
        component: PageA
    },
    {
        path: '/page-b',
        name: 'PageB',
        component: PageB
    }
]

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
})

export default router
