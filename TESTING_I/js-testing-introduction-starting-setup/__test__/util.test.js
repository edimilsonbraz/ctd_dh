const { generateText } = require('../util.js');

describe('Grupo de saida de dados', () => {
  test('Saida de nome e idade', () => {
    const text = generateText('Edimilson', 30);
    expect(text).toBe('Edimilson (30 years old)');
    const text2 = generateText('Lucas', 25);
    expect(text2).toBe('Lucas (25 years old)');
  });
  it('Saida com dados vazios', () => {
    const text = generateText('', null);
    expect(text).toBe(' (null years old)');
  });
  test('Saida sem dados', () => {
    const text = generateText();
    expect(text).toBe('undefined (undefined years old)');
  })
});