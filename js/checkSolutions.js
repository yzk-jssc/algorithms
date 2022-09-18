/*
проверка на плагиат. Если во второй строке будет повторяться символ, то это буква T, если полное совпадение индексов то P, если не совпадают и не найдено то N
Plagiat checkout. If second string includes symbol from first string we will return T letter, if index letter from second equals index letter from first string we'll return P, else we'll return N
*/

const firstString = prompt("Введите первую строку", '')
const secondString = prompt("Введите вторую строку, чтобы проверить ее на плагиат", '')
//PTNNPTN
//почему то не считает I(предпоследний)
function plagiatCheckout(first,second) {
  const firstSplitString = first.toLowerCase().split('').reverse()
  const secondSplitString = second.toLowerCase().split('').reverse()
  let result = [];
  let resultLetters = []
  for(let i = 1; i <= first.length; i++){
    const lastChild = secondSplitString.pop()
      if(firstSplitString[firstSplitString.length - i ] === lastChild && !resultLetters.includes(lastChild)){
        result.push('P')
      }else if(firstSplitString.includes(lastChild) && !resultLetters.includes(lastChild)){//i не видит
        result.push('T')
      }else{
        result.push('N')
      }
      resultLetters.push(lastChild)
    
  }
  return result
}

console.log(plagiatCheckout(firstString, secondString))