// Copyright (c) 2018-2019  Egon Willighagen <egon.willighagen@gmail.com>
//
// GPL v3

input = args[0]
project = args[1]
grant = args[2]

lines = new File(input).readLines()
lines.each { String line ->
  while (line.contains("<project/>")) {
    line = line.replace("<project/>", project)
  }
  while (line.contains("<grant/>")) {
    line = line.replace("<grant/>", grant)
  }
  println line
}
