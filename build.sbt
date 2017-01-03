name := "scalastic"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

/*
lazy val core = project dependsOn(
  ProjectRef(uri("https://github.com/fpinscala/fpinscala.git"), "fpinscala")
  )
*/