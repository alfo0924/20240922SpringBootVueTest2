<template>
  <div class="page-a">
    <h1>Page A</h1>
    <button @click="goToPageB">Go to Page B</button>
    <button @click="saveAndSubmit">Save and Submit</button>
  </div>
</template>

<script>
import { ref } from 'vue'
import { useRouter } from 'vue-router'

export default {
  name: 'PageA',
  setup() {
    const router = useRouter()

    const goToPageB = () => {
      router.push('/b')
    }

    const saveAndSubmit = async () => {
      const randomData = Math.random().toString(36).substring(7)
      try {
        const response = await fetch('/api/data', {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json',
          },
          body: JSON.stringify({ content: randomData }),
        })
        if (response.ok) {
          alert('Data saved successfully!')
        } else {
          alert('Failed to save data')
        }
      } catch (error) {
        console.error('Error:', error)
        alert('An error occurred while saving data')
      }
    }

    return {
      goToPageB,
      saveAndSubmit
    }
  }
}
</script>
