// Esta é a base de dados de nossos usuarios
const baseDeDados = {
  usuarios: [
    {
      id: 1,
      name: "Steve Jobs",
      email: "steve@jobs.com",
      password: "Steve123",
    },
    {
      id: 2,
      name: "Ervin Howell",
      email: "shanna@melissa.tv",
      password: "Ervin345",
    },
    {
      id: 3,
      name: "Clementine Bauch",
      email: "nathan@yesenia.net",
      password: "Floppy39876",
    },
    {
      id: 4,
      name: "Patricia Lebsack",
      email: "julianne.oconner@kory.org",
      password: "MysuperPassword345",
    },
  ],
};
//Emails do usuario separados em um array
const emailsUsuarios = [];
baseDeDados.usuarios.forEach(item => {
  emailsUsuarios.push(item.email)
})
//Nome do usuario separados em um array
const nomesUsuarios = [];
baseDeDados.usuarios.forEach(item => {
  nomesUsuarios.push(item.name)
})



let emailInput = document.getElementById('email-input');
let botaoSessao = document.querySelector('.login-btn')

//FAZENDO VALIDAÇÃO DO EMAIL
emailInput.addEventListener('blur', () => {
  let emailVerificacao = document.getElementById('emailVerificacao'); 
  
  //Expressão regular utilizando RegEx
  if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(emailInput.value)) {
    emailVerificacao.innerText = ""
    botaoSessao.removeAttribute('disabled');

  } else {
    emailVerificacao.style.color = "#E41414"
    emailVerificacao.innerText = "E-mail inválido"
    botaoSessao.setAttribute('disabled', true)
  }

})

botaoSessao.addEventListener('click', () => {
  let emailDoBodyInput = emailInput.value

   //Comparar os emails
  if(emailsUsuarios.includes(emailDoBodyInput)) {
    const index = emailsUsuarios.indexOf(emailDoBodyInput)
    const nomeUsuarioLogado = nomesUsuarios[index]
    //Salva o objeto no Storage
    const statusLoader = document.getElementById('loader')
    localStorage.setItem("email", emailDoBodyInput );
    statusLoader.classList.remove('hidden')
    setTimeout(bemVindo, 4000)

    function bemVindo() {
      const form = document.querySelector('form');
      const title = document.getElementById('title');
      const sessaoUsuario = document.getElementById('bem-vindo');
      const titleSessao = document.getElementById('title-sessao');

      form.classList.add('hidden');
      title.classList.add('hidden');
      sessaoUsuario.classList.remove('hidden');
      titleSessao.innerText = `Bem-vindo ao site ${nomeUsuarioLogado} 🤓🖖`

      sessionStorage.setItem("email", emailDoBodyInput)
    }
  }else{
    const statusError = document.getElementById('error-container')
    statusError.classList.remove('hidden')
  }

  if(sessionStorage.getItem("email") == emailDoBodyInput) {
    bemVindo()
  }else{
    console.log("Algo errado")
  }
   
})


//// ATIVIDADE

/// Passo a passo:

// 1) Quando a pessoa faz o login, se as validações que já temos no local tiverem sido bem sucedidas,
// devemos armazenar a informação do utilizador no LocalStorage.OK

// 2) Na mensagem de boas-vindas que já tínhamos implementado, teremos de acrescentar
// o nome da pessoa e um botão "Logout". OK

// 3) Uma vez iniciada a sessão, a sessão deve ser mantida nesse estado no caso de a pessoa recarregar a página. 
// Para fazer isso, terá de validar se a informação do utilizador existe neste momento em
// quando a página é carregada, e com base nessa condição decidir quais os elementos mostrar.

// 4) No caso de a pessoa clicar no botão "Logout", deverá ser eliminada
// a informação do utilizador, exibir uma mensagem indicando que a sessão foi encerrada, e recarregar
// a página para voltar a exibir o formulário de login.

/* 
DICAS:
  - Para alcançar os objetivos deste exercício, você terá de recorrer a alguns dos eventos e métodos que vimos em aulas anteriores.
    Te convidamos a verificar esses recursos caso tenha alguma dúvida, pois neles encontrará todas as respostas  necessárias para completar a actividade.

  - Lembre-se que pode selecionar e manipular os elementos do arquivo index.html, utilizando os recursos que o Javascript lhe oferece. Além disso, no arquivo styles.css tem algumas classes predefinidas e estilos pré-definidos para o ajudar a completar a actividade.

  - Ao guardar informação do utilizador no browser, lembre-se que devemos guardar apenas a informação necessária, e NÃO DEVEMOS GUARDAR A SENHA. 
    Desta maneira, você deve selecionar e separar as informações que tem de armazenar, a partir do objeto que contém a informação do utilizador. 

   Mão à obra! Bora pro código!

 */
