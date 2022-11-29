import { render, screen } from "@testing-library/react";
import App from "./App";

test("Verifica se o App.js esta renderizando corretamente", () => {
  render(<App />)

  const text = screen.getByText("Hello App")

  expect(text).toBeInTheDocument();
})