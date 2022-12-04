import { createContext, useEffect, useState } from "react";

// Criamos o contexto utilizando createContext()
export const UserContext = createContext();

//função para obter os dados do storage
function getUserFromStorage() {
  const localData = localStorage.getItem("user");

  return localData ? JSON.parse(localData) : [];
}

//funçao para armazenar dados no storage
function setUserInStorage(user) {
  localStorage.setItem("user", JSON.stringify(user));
}


// Criamos o provedor do contexto que nos permitirá compartilhar esse contexto
export function UserContextProvider({children}) {
 // Armazenamos as informações do usuário para podermos compartilhá-la 
 //com os nossos componentes. O valor inicial são as informações obtidas do LocalStorage
 const [user, setUser] = useState(getUserFromStorage)

 // Caso o usuário selecionado seja trocado atualizamos as informações que estão no
 // storage
 useEffect(() => {
  setUserInStorage(user);
 },[user])

 // Criamos uma função para atualizar o usuário
 function changeUser(user) {
  setUser(user)
 }

 // Compartilhamos o usuário e a função de atualização para podermos utilizá-la nos componentes dentro do contexto
  return (
    <UserContext.Provider value={{user, changeUser}}>
      {children}
    </UserContext.Provider>
  )

}