function howLongIsFlying (firstTime,secondTime) {
  const firstTimeInMinutes = +firstTime.split(':')[0] * 60 + +firstTime.split(':')[1]
  const secondTimeInMinutes = +secondTime.split(':')[0] * 60 + +secondTime.split(':')[1]
  const hours = Math.floor((secondTimeInMinutes - firstTimeInMinutes) / 60)
  const minutes = (secondTimeInMinutes - firstTimeInMinutes) - 60 
  return hours + ':' + ((minutes).toString().length > 1 ? minutes.toString().split('').at(-2) + minutes.toString().split('').at(-1) : '0' + minutes)
  //c минутами костыль =)))
}

console.log(howLongIsFlying('12:00','13:05'))
console.log(howLongIsFlying('12:00','13:00'))
console.log(howLongIsFlying('00:00','6:25'))
console.log(howLongIsFlying('01:20','12:50'))
