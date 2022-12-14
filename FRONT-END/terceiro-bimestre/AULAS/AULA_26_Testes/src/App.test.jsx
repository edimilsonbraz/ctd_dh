import { render, screen, fireEvent } from "@testing-library/react";
import App from "./App";

describe("<App/>", () => {
  test("Testar se o tema inicial é o tema light", () => {
    render(<App />);

    const tema = screen.getByTestId("app");

    expect(tema).toHaveClass("light");

    const button = screen.getByRole("button", { name: /alterar tema/i });

    fireEvent.click(button);

    expect(tema).toHaveClass("dark");
  });

  test("verificar se a quantidade de dentistas esta aparecendo corretamente", () => {
    render(<App />);

    const nomes = screen.getAllByRole("heading", { level: 2 });

    expect(nomes.length).toBe(3);
  });
});
