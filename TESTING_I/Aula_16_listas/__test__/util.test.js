const { generateText, createElement, validateInput } = require('../util.js');

describe('Validação de texto de saída', () => {
  test('Saída de nome e idade', () => {
    const text = generateText('Edimilson Braz', 28);
    expect(text).toBe('Edimilson Braz (28 anos)');
  })
})

describe('Validação de Inputs', () => {
  test('Cria elementos HTML', () => {
    const element = createElement('li', "outputText", 'user-item');
    expect(element.textContent).toMatch(/outputText/);
  });
  test('Create new element without data', () => {
    const element2 = createElement(null);
    expect(element2.textContent).toBe("");
  });
});

describe('Validação de função input', () => {
  test('Validação Input function text', () => {
    const text = validateInput('texto');
    expect(text).toBeTruthy;
  });
});