import { Route, Routes } from 'react-router-dom'
import { DefaultLayout } from './DefaultLayout'
import Home from './pages/Home'
import Contact from './pages/Contact'
import Beer from './pages/Beer'

export function Router() {
  return (
    <Routes>
      <Route path="/" element={<DefaultLayout />}>
        <Route path="/" element={<Home />} />
        <Route path="/beer/:id" element={<Beer />} />
        <Route path="/contact" element={<Contact />} />
      </Route>
    </Routes>
  )
}
