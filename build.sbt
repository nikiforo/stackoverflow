name := "stackoverflow"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.scalatest"     %% "scalatest"   % "2.2.4" % "test",
	"com.typesafe.akka" %% "akka-actor"  % "2.3.2",
  "com.typesafe.akka" %% "akka-remote" % "2.3.2"
)