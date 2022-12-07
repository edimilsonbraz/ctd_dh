import React from 'react'
import { Outlet } from 'react-router-dom'
import Navbar from '../../components/Navbar'

function ProductsRouterTemplate() {
  return (
    <div>
      <Navbar />
      <Outlet />

    </div>
  )
}

export default ProductsRouterTemplate