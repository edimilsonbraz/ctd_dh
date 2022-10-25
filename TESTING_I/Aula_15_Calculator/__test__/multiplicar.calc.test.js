const { multiplicacao } = require('../calc.js');

describe('Testes de multiplicacao', () => {
  test('multiplicação de dois numeros', () => {
    expect(multiplicacao(5,3)).toBe(15);
  })
  test('Multiplicação de dois zeros', () => {
    expect(multiplicacao(0,0)).toBe(0);
  })
  
});