const { generateText } = require('../util.js');

describe('Validação de texto de saída', () => {

  test('Saída de nome e idade', () => {
    const text = generateText('Edimilson Braz', 28);
    expect(text).toBe('Edimilson Braz (28 anos)');
  })
})