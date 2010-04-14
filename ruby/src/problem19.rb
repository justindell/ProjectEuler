require 'date'

numSundays = 0
Date.parse("1 jan 1901").upto(Date.parse("31 dec 2000")) { |day|
  numSundays += 1 if day.wday == 0 && day.mday == 1
}
puts numSundays