<template>
  <div class="quote-wrapper">
   <img alt="chuck-norris" @click="loadRandomQuote" src="../assets/chuck-norris.png" class="img"/> <!-- // on click = neuer spruch-->
    <h1 class="quote">"{{ randomQuote }}"</h1>
  </div>
</template>

<script>
export default {
  name: "ChuckNorrisQuote",
  data() {
    return {
      randomQuote:
          "Wenn alles funktioniert, steht hier ein Chuck Norris Spruch.",
    };
  },
  methods: {
    loadRandomQuote() {
      // ToDo: Rufen Sie hier den Rest-Endpunkt des Servers auf

      var index = this.getRandomInt(79)
      console.log(index)

      //aus postman geklaut
      const requestOptions = {
        method: 'GET',
        redirect: 'follow'
      }

      // der Client übermittelt den Index via Request-Parameter index, also z.B. /api/v1/quotes?index=53
      const endpoint = 'http://localhost:8080'+ '/api/v1/quotes?index=' + index
      console.log(endpoint) //just to be sure

      fetch(endpoint, requestOptions)
          .then(response => response.text()) //der Endpunkt soll dem Client ein JSON liefern
          .then(quote => this.randomQuote = quote)
          .catch(error => console.log('error', error));


    },
    getRandomInt(maxExclusive) {
      return Math.floor(Math.random() * maxExclusive);
    },
    mounted: async function () {
      this.loadRandomQuote()
    }
  },
};
</script>

<style>
.quote-wrapper {
  display: flex;
  justify-content: space-evenly;
  align-items: center;
  height: 100%;
  width: 95%;
  margin: auto;
}

h1 {
  font-size: 4vw;
  text-align: center;
  font-style: italic;
}

.img {
  width: 50%;
}

.quote {
  width: 50%;
}

@media screen and (max-width: 780px) {
  .quote-wrapper {
    display: flex;
    flex-direction: column;
  }

  .img {
    width: 100%;
  }

  .quote {
    width: 100%;
  }
}
</style>
