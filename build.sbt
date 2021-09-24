import Dependencies._

lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.7",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Tutrial"
  )

scalaJSUseMainModuleInitializer := true
