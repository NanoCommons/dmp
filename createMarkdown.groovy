// Copyright (c) 2018-2019  Egon Willighagen <egon.willighagen@gmail.com>
//
// GPL v3

input = args[0]
project = args[1]
grant = args[2]

lines = new File(input).readLines()
lines.each { String line ->
  if (line.contains("<project/>")) {
    println line.replace("<project/>", project)
  } else if (line.contains("<grant/>")) {
    println line.replace("<grant/>", grant)
  } else {
    println line
  }
}
