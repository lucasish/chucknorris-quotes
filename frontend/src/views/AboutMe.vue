<template>

    <!-- TODO:  -->
    <div>
      <AboutMeDetails title="Wie gehts?">
      </AboutMeDetails>
    </div>

</template>

<script>
import AboutMeDetails from "@/components/AboutMeDetails";

export default {
  name: "AboutMe",
  components: {
    AboutMeDetails,
  },
};
</script>

<style>

h1 {
  color: #056f05;
  text-align: center;
}
body {
  background-color: #96defc;
}
p {
  font-family: "Comic Sans MS";
  font-size: 20px;
  text-align: center;
}


</style>
