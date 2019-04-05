<template lang="pug">
  #home
    formulario-aluno(tipo="aluno")
</template>

<script>
// @ is an alias to /src
import FormularioAluno from "../components/FormularioAluno";

export default {
  name: 'home',
  components: {
      FormularioAluno,
  }
}
</script>
