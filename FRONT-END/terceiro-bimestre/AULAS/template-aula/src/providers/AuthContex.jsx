import { createContext, useEffect, useState } from 'react'
import { useLocation, useNavigate } from 'react-router-dom';

export const AuthContext = createContext({})

export function AuthProvider({ children }) {
  const [userData, setUserData] = useState({})

  const navigate = useNavigate();
  const location = useLocation();

  function fillUserDataState({ name, token, user }) {
    //Salvando em localStorage
    localStorage.setItem(
      "@system_product",
      JSON.stringify({ name, token, user })
    );

    setUserData({ ...userData, name, token, user })
  }

  function emptyUserData() {
    setUserData({name:"", email:"", token:""})
  }

  useEffect(() => {
    const response = localStorage.getItem("@system_product");

    let user;

    if (response) {
      user = JSON.parse(response)

      fillUserDataState({ 
        name: user.name, 
        token: user.token, 
        user: user.user,
      });
      // navigate("/products")
      navigate(location?.pathname);
    }
  }, []);

  return (
    <AuthContext.Provider
      value={{
        userData,
        fillUserDataState,
        emptyUserData,
      }}
    >
      {children}
    </AuthContext.Provider>
  )
}
