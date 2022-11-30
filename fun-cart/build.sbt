import Dependencies._

ThisBuild / scalaVersion := "2.13.8"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "misis"
ThisBuild / organizationName := "misis"

val akkaVersion = "2.6.18"
val akkaHttpVersion = "10.2.7"
val circeVersion = "0.14.1"
val AkkaHttpJsonVersion = "1.39.2"

lazy val root = (project in file("."))
    .settings(
        name := "fun-cart",
        libraryDependencies ++= Seq(
            "com.typesafe.akka" %% "akka-actor" % akkaVersion,
            "com.typesafe.akka" %% "akka-stream" % akkaVersion,
            "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
            "de.heikoseeberger" %% "akka-http-circe" % AkkaHttpJsonVersion,

            "io.circe" %% "circe-core" % circeVersion,
            "io.circe" %% "circe-generic" % circeVersion,
            "io.circe" %% "circe-parser" % circeVersion,

            scalaTest % Test
        )
    )

