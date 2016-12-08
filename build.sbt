name := "blank"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.6"
 
resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq (
	"org.scalatest" %% "scalatest" % "3.0.1" % "test"
)
