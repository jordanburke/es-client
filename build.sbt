name := "es-client"

organization := "com.github.piotr-kalanski"

version := "0.3.0.12"

scalaVersion := "2.12.7"

licenses := Seq("Apache License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

homepage := Some(url("https://github.com/piotr-kalanski/es-client"))

scmInfo := Some(
  ScmInfo(
    url("https://github.com/piotr-kalanski/es-client"),
    "scm:git:ssh://github.com/piotr-kalanski/es-client.git"
  )
)

developers := List(
  Developer(
    id    = "kalan",
    name  = "Piotr Kalanski",
    email = "piotr.kalanski@gmail.com",
    url   = url("https://github.com/piotr-kalanski")
  )
)

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % scalaVersion.value,
  "org.scalaj" %% "scalaj-http" % "2.3.0",
  "org.json4s" %% "json4s-native" % "3.2.11",
  "org.json4s" %% "json4s-jackson" % "3.2.11",
  "junit" % "junit" % "4.10" % "test",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)

coverageExcludedPackages := "com.datawizards.esclient.examples.*"

publishMavenStyle := true

/*
publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}
*/
