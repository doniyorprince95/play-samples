name := "play-scala-streaming-example"

version := "2.6.x"

scalaVersion := "2.12.10"

crossScalaVersions := Seq("2.11.12", "2.12.10")

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies += guice

libraryDependencies += ws % Test
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.3" % Test
