ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.5"

lazy val root = (project in file("."))
  .settings(
    name := "scala-pocs"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.17" % "test"