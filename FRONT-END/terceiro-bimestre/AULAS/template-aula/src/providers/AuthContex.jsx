import { createContext, useState } from 'react'

export const AuthContext = createContext({})

export function AuthProvider({ children }) {
  const [userData, setUserData] = useState({});

  function fillUserDataState({name, token, user}) {
    setUserData({...userData, name, token, user });
  }

  return (
    <AuthContext.Provider
      value={{
        userData,
        fillUserDataState,
      }}
    >
      {children}
    </AuthContext.Provider>
  )
}
