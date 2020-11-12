scalaVersion := "2.13.3"
name := "sse-interview"
organization := "com.bofa"
version := "1.0"
libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "org.slf4j" % "slf4j-api" % "1.7.30",
  "org.scalatest" %% "scalatest" % "3.2.2" % "test"
)
