lazy val root = (project in file(".")).settings(
  inThisBuild(
    List(
      scalaVersion := "2.12.7",
    )),
  name := "http-server",
  scalafmtOnCompile := true,
  libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-http" % "10.1.5",
    "com.typesafe.akka" %% "akka-stream" % "2.5.12",
  ),
)
