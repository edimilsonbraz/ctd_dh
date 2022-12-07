import NavBar from "../../components/Navbar"

function ProductsTemplate({children}) {
  return (
    <div>
      <NavBar />
      {children}
    </div>
  )
}

export default ProductsTemplate;