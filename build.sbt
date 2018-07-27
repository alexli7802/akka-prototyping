import Dependencies._


lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.11.8",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "akka-prototyping",
    libraryDependencies ++= Seq(
      scalaTest % Test,
      "com.typesafe.akka" %% "akka-actor" % "2.5.14",
      "com.typesafe.akka" %% "akka-remote" % "2.5.14",
      "com.typesafe" % "config" % "1.3.2"
    )
  ).settings(
    assemblyJarName in assembly := "akka-prototyping.jar"
  )
