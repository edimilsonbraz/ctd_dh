const superHeroes = [
  { name: 'Homem Aranha',
    poder: "Golpear com chicote",
    cumprimentar: function() {
      return "Olá, sou" + this.name;
    }
  },
  {
    name: "Iron man",
    poder: "Disparar raios",
    cumprimentar: function() {
      return "Olá, sou" + this.name;
    }
  }
]

module.exports = superHeroes;