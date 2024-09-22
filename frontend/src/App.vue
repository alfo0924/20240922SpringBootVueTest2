<template>
  <div id="app" :class="{ 'dark-mode': isDarkMode }">
    <router-view></router-view>
  </div>
</template>

<script>
import { ref, provide } from 'vue'

export default {
  name: 'App',
  setup() {
    const isDarkMode = ref(true)
    provide('isDarkMode', isDarkMode)

    return {
      isDarkMode
    }
  }
}
</script>

<style>
#app {
  font-family: Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: white;
  background-color: black;
  min-height: 100vh;
  padding: 20px;
}

#app.dark-mode {
  color: white;
  background-color: black;
}

#app:not(.dark-mode) {
  color: black;
  background-color: white;
}

button {
  margin: 10px;
  padding: 10px 20px;
  font-size: 16px;
  cursor: pointer;
  background-color: #333;
  color: white;
  border: none;
  border-radius: 5px;
}

button:hover {
  background-color: #555;
}
</style>
