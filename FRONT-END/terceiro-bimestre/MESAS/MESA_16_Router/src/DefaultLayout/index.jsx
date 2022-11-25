import React from 'react'
import { Outlet } from 'react-router-dom'
import NavBar from '../components/NavBar'

export function DefaultLayout() {
  return (
    <div className="App">
      <NavBar />
      <div className='container'>
        <Outlet />
      </div>
    </div>
  )
}
