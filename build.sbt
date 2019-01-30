scalaVersion := "2.12.8"

name := "jenkins-pipeline-build-time"
organization := "com.mlin6436"
version := "0.1"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "1.4.0",
  "org.scala-lang.modules" %% "scala-xml" % "1.1.1"
)
