let p = document.createElement('p');
let texto = document.createTextNode('Bom dia');
p.appendChild(texto);

let div = document.querySelector('div').appendChild(p);
document.body.appendChild(div);

