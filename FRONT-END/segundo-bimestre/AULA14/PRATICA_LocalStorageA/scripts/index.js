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

  
})

//Persistindo os Dados
window.onload = () => {
  sessionUsuario()
}


function sessionUsuario() {
  let objetoUsuarioCapturado = sessionStorage.getItem("email")
  if(objetoUsuarioCapturado != null) {
    const form = document.querySelector('form');
    const title = document.getElementById('title');
    const sessaoUsuario = document.getElementById('bem-vindo');
    const titleSessao = document.getElementById('title-sessao');

    form.classList.add('hidden');
    title.classList.add('hidden');
    sessaoUsuario.classList.remove('hidden');
    titleSessao.innerText = `Bem-vindo ao site 🤓🖖`
  }else{
    console.log("Algo errado")
  }
}
 const botaoFinishSession = document.getElementById('btn-sessao')
 botaoFinishSession.addEventListener('click', finisheSession)

function finisheSession() {
  sessionStorage.clear();
  document.location.reload(true);
}


