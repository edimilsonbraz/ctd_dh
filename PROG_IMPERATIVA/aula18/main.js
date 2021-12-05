//Preparando o cérebro!

/*============================================= */
//1. Loop de Pares
function loopDePares(n1) {
  for(let i = 0; i <= 100; i++) {
    let par = n1 + i;
    if(par % 2 == 0) {
      console.log("O número " + i + " é par")
    }
  }
}

loopDePares(20)



/*============================================= */
//2. Loop ímpares com palavra
function loopDeImpares(n1, palavra) {
  for(let i = 0; i < 100; i++) {
    let impar = n1 + i;
    if(impar % 2 !== 0) {
      console.log("Esse numero " + impar + " " + palavra)
    }
  }
}
loopDeImpares(13, "impar")



/*============================================= */
//3. Soma
function soma(numero) {
  let somaNumeros = 0 ;
  for(let i = 1; i <= numero; i++) {
    somaNumeros += i;
  }
  return somaNumeros
}
console.log(soma(8))



/*============================================= */
//4. Novo Array
function newArray(numero) {
  let arrayNumeros = [];
  for(let i = 1; i <= numero; i++) {
    arrayNumeros.push(i)
  }
  return arrayNumeros
}
console.log(newArray(5))



/*============================================= */
//5. String.split()
function split(string) {
  let recebeString = [];
  for(let i = 0; i < string.length; i++) {
    recebeString.push(string[i]) 
  }
  return recebeString
}
console.log(split("tchal"))



/*============================================= */
//6. Mover os zeros para o final
function moverZeros(array) {
  
    let arrayRestante = array.filter((item) => item !== 0)
    
    array.forEach((item) => {
      if(item === 0) {
        arrayRestante.push(item)
      }
    })
   
    return arrayRestante
  }

console.log(moverZeros([false,1,0,1,2,0,1,3,"a",5,0,]))



/*============================================= */
//7. Lidando com dois arrays
function arrayHandler(arr1, arr2) {
  let fraseArray = '';
  // arr1.forEach((item) => {
  //   console.log("Eu sou " + arr1[item] + " e eu sou " + arr2[item])
  // })

  for(let i = 0; i < arr1.length; i++) {
    fraseArray = console.log("Eu sou " + arr1[i] + " e eu sou " + arr2[i])
  }
   return fraseArray
}
arrayHandler([1,2,3], ['O','L','Á'])



/*============================================= */
//8. Arrays de objetos
function arrayObjects(num) {
  let values = [];
  for(let i = 1; i <= num; i++) {
    values.push({valor: i})
  }
  return values 

}
console.log(arrayObjects(5))


/*============================================= */
//9. Arrays de objetos 2
function arrayObjectsTwo(num, palavra) {
  let Objects = [];
  for(let i = 1; i <= num; i++) {
    Objects.push(`${palavra}: ${i}`)
  }
  return Objects
}
console.log(arrayObjectsTwo(5, "Olá"))