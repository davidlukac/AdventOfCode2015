name := "Advert of Code 2015"

organization := "com.gaincore"

version := "v0.1.0"

scalaVersion := "2.11.2"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"

// set the main class for 'sbt run'
mainClass in (Compile, run) := Some("com.gaincore.adventofcode.AdventOfCode2015")
