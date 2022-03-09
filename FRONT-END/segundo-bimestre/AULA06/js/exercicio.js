
const animal = [
{
  nome: 'Tigre',
  imagem: './imagens/tiger.jpg',
  descricao: `O tigre (Panthera tigris) é uma das espécies da subfamília Pantherinae (família Felidae)
  pertencente ao gênero Panthera. É encontrado de forma nativa apenas no continente asiático; é um predador
  carnívoro e
  é a maior espécie de felino do mundo junto com o leão.`
},
{
  nome: 'O leopardo',
  imagem: './imagens/leopardo.jpg',
  descricao: `O leopardo (Panthera pardus) é um mamífero carnívoro da família dos felinos. Como três dos outros
  felinos do gênero Panthera: o leão, o tigre e a onça-pintada, são caracterizados por uma modificação do osso
  hióide que lhes permite rugir.
  É também conhecido como pantera marrom e, quando tem a pelagem completamente escura, como pantera negra
  (melanista).`
},
{
  nome: 'A pantera negra',
  imagem: './imagens/pantera-negra.jpg',
  descricao: `A pantera negra é uma variação escura (melanismo) de várias espécies de felinos grandes, especialmente o
  leopardo (Panthera pardus) e a onça-pintada (Panthera onca).
  Mas deve-se ressaltar que não se trata de uma espécie nova, nem mesmo de uma subespécie, é simplesmente uma
  variação negra destes animais.`
 
},
{
  nome: 'O guepardo',
  imagem: "./imagens/chita.png",
  descricao: "O guepardo, ou chita (Acinonyx jubatus) é um membro atípico da família felina. É o único representante vivo do gênero Acinonyx. Ele caça graças à sua visão e grande velocidade. É o animal terrestre mais rápido do mundo, atingindo uma velocidade máxima de 115 km/h em corridas de até quinhentos metros."
}
]

window.onload = () => {
  
  animal.forEach((item) => {
    let cards = document.createElement('div');
    let h1 = document.createElement('h1');
    let textH1 = document.createTextNode(item.nome);
    

  })
}