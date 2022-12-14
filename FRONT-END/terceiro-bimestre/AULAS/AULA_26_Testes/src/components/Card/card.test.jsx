import { render, screen } from "@testing-library/react";

import Card from ".";

describe("<Card/>", () => {
  test("Testar se card esta sendo renderizado corretamente", () => {
    render(<Card title="title de teste" description="description de teste" />);

    const title = screen.getByRole("heading", { name: "title de teste" });

    const description = screen.getByText("description de teste");

    expect(title).toBeInTheDocument();
    expect(description).toBeInTheDocument();
  });

  test("Testar card se nao for passado props", () => {
    render(<Card />);

    const title = screen.getByRole("heading", { level: 1 });

    expect(title.value).toBe(undefined);
  });
});
