name := "websocket-akka-http"

version := "1.0"

scalaVersion := "2.11.12"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.0.0"
resolvers += "Bintray" at "http://dl.bintray.com/websudos/oss-releases"
libraryDependencies += "org.java-websocket" % "Java-WebSocket" % "1.3.0"