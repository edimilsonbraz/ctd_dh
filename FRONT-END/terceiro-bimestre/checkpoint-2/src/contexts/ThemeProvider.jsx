import { createContext, useState } from "react"

export const themeContext = createContext({});

export function ThemeProvider({children}) {
  const [theme, setTheme] = useState('light');

  function handleTheme() {
    if(theme === 'light') {
      setTheme('dark')
    }else{
      setTheme('light')
    }
  }

  return (
    <themeContext.Provider value={{theme, handleTheme }}>
      {children}
    </themeContext.Provider>
  )
}
