import Dependencies._

val libs = Seq(
	"org.scalatest" %% "scalatest" % "3.0.8" % "test")

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.13.0",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "s99",
    libraryDependencies ++= libs
  )
