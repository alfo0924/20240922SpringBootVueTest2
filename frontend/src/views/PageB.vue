<template>
  <div class="page-b">
    <h1>Page B</h1>
    <button @click="goToPageA">Go to Page A</button>
    <button @click="showData">Show Data</button>
    <button @click="toggleDarkMode">Toggle Dark/Light Mode</button>
    <div v-if="dataList.length > 0">
      <h2>Saved Data:</h2>
      <ul>
        <li v-for="item in dataList" :key="item.id">{{ item.content }}</li>
      </ul>
    </div>
  </div>
</template>

<script>
import { ref, inject } from 'vue'
import { useRouter } from 'vue-router'

export default {
  name: 'PageB',
  setup() {
    const router = useRouter()
    const isDarkMode = inject('isDarkMode')
    const dataList = ref([])

    const goToPageA = () => {
      router.push('/')
    }

    const showData = async () => {
      try {
        const response = await fetch('/api/data')
        if (response.ok) {
          dataList.value = await response.json()
        } else {
          alert('Failed to fetch data')
        }
      } catch (error) {
        console.error('Error:', error)
        alert('An error occurred while fetching data')
      }
    }

    const toggleDarkMode = () => {
      isDarkMode.value = !isDarkMode.value
    }

    return {
      goToPageA,
      showData,
      toggleDarkMode,
      dataList
    }
  }
}
</script>
