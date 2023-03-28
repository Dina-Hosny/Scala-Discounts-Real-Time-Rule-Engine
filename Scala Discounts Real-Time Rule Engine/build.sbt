ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "Scala_Rule_Engine"
  )
libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.27"