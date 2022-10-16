function howLongIsFlying(firstTime, secondTime) {
  const firstString = firstTime.split(':')
  const secondString = secondTime.split(':')
  const firstDate = getDateFromParams(firstString)
  const secondDate = getDateFromParams(secondString)
  if(firstDate > secondDate){
    return getHours(firstDate,secondDate) + ':' + getMinutes(firstDate,secondDate)
  }else{
    return getHours(secondDate, firstDate) + ':' + getMinutes(secondDate, firstDate)
  }
}

function getDateFromParams(array) {
  const date = new Date()
  date.setHours(array[0])
  date.setMinutes(array[1])
  return date
}

function getHours(a,b) {
  const res = a - b
  return parseInt((res / (1000 * 60 * 60)) % 24)
}

function getMinutes(a,b){
  const minutes = (a - b)/1000/60
  if(minutes >= 120){

    if(((getHours(a,b) * 60) - minutes) === 0) {
      return '00'
    }else{
      const minsForA = parseInt((a / (1000 * 60)) % 60)
      const minsForB = parseInt((b / (1000 * 60)) % 60)
      const mins = (minsForA - minsForB > 0) ? minsForA - minsForB : minsForB - minsForA
      const minsResult = mins + ''
      if(minsResult.length === 1){
        return minsResult + '0'
      }else{
        return minsResult
      }
    }

  }else{
    return '0' +  (minutes - 60)
  }
}

console.log(howLongIsFlying('12:00','13:05'))
console.log(howLongIsFlying('12:00','13:00'))
console.log(howLongIsFlying('00:25','3:00'))
console.log(howLongIsFlying('01:50','12:50'))
console.log(howLongIsFlying('6:59','00:00'))
console.log(howLongIsFlying('6:59','00:26'))
console.log(howLongIsFlying('15:15','3:00'))