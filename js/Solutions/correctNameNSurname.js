function correctNameNSurname(firstCouple, secondCouple) {
  const firstNames = firstCouple.split(', ')
  const secondNames = secondCouple.split(', ')
  const helpingHandler = (string) => secondNames.includes(string)
  const firstNameFromNames = firstNames[0]
  const SecondNameFromNames = firstNames[1]
  if((helpingHandler(firstNameFromNames) ||  helpingHandler(firstNameFromNames.split(' ').reverse().join(' '))) && helpingHandler(SecondNameFromNames) ||  helpingHandler(SecondNameFromNames.split(' ').reverse().join(' '))){
    return 'YES'
  }else{
    return 'NO'
  }
}

console.log(correctNameNSurname('Иван Петров, Иванов Петр',
                                'Петр Иванов, Иван Петров'))// тру
console.log(correctNameNSurname('Иван Петров, Иванов Петр',
                                'Иван Петров, Максим Сидоров'))// фолс