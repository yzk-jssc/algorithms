function howLongIsFlying (firstTime,secondTime,thirdNumber) {
  const firstTimeInMinutes = +firstTime.split(':')[0] * 60 + +firstTime.split(':')[1]
  const secondTimeInMinutes = +secondTime.split(':')[0] * 60 + +secondTime.split(':')[1]
  let hours,
      minutes;
  if(firstTimeInMinutes < secondTimeInMinutes) {
    hours = Math.floor((secondTimeInMinutes - firstTimeInMinutes) / 60)
    minutes = +firstTime.split(':')[1] <= +secondTime.split(':')[1] ? (secondTimeInMinutes - firstTimeInMinutes) - 60 : firstTime.split(':')[1] - secondTime.split(':')[1]

  }else if(firstTimeInMinutes > secondTimeInMinutes){
    hours = Math.floor((firstTimeInMinutes - secondTimeInMinutes) / 60)
    minutes = +firstTime.split(':')[1] >= +secondTime.split(':')[1] ? (firstTimeInMinutes - secondTimeInMinutes) - 60 : secondTime.split(':')[1] - firstTime.split(':')[1]

  }else {
    return '00:00'
  }
  return hours + ':' + ((minutes).toString().length > 1 ? minutes.toString().split('').at(-2) + minutes.toString().split('').at(-1) : '0' + minutes)
  //c минутами костыль)))
}

console.log(howLongIsFlying('12:00','13:05'))
console.log(howLongIsFlying('12:00','13:00'))
console.log(howLongIsFlying('00:00','6:25'))
console.log(howLongIsFlying('01:50','12:50'))
console.log(howLongIsFlying('6:59','00:26'))
console.log(howLongIsFlying('6:59','00:26'))
console.log(howLongIsFlying('15:15','3:00'))
