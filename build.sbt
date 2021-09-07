scalaVersion := "2.13.5"
name := "scala-interview"
organization := "scalainterview"
version := "1.0"

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.2.5",
  "org.slf4j" % "slf4j-api" % "1.7.32",
  "org.scalatest" %% "scalatest" % "3.2.9" % Test,
  "org.scalacheck" %% "scalacheck" % "1.15.4" % Test,
  "org.scalatestplus" %% "scalacheck-1-15" % "3.2.9.0" % Test,
  "org.specs2" %% "specs2-core" % "4.12.10" % Test
)
