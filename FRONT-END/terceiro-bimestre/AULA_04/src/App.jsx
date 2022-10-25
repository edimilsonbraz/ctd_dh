import { Pessoa } from "./Pessoa";

export function App() {
  return (
    <>
      <Pessoa nome="Weslei" idade={40} peso={78}/>
      <Pessoa nome="João" idade={26}/>
      <Pessoa nome="Anna" idade={24} peso={69}/>
      <Pessoa nome="Carlos" idade={17}/>
    </>
  )
}

