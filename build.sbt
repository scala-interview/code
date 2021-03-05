scalaVersion := "2.13.5"
name := "sse-interview"
organization := "com.bofa"
version := "1.0"
libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "org.slf4j" % "slf4j-api" % "1.7.30",
  "org.scalatest" %% "scalatest" % "3.2.5" % "test",
  "org.scalatestplus" %% "scalacheck-1-15" % "3.2.5.0" % "test"
)
