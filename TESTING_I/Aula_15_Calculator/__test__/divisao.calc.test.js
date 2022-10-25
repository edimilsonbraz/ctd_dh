const { divisao } = require('../calc.js');

describe('Testes de divisão', () => {
  test('Divisão de dois numeros', () => {
    expect(divisao(10,2)).toBe(5);
  })
  test('Divisão de dois zeros', () => {
    expect(divisao(0,0)).toBe(NaN);
  })

});