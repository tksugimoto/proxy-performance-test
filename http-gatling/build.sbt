lazy val root = (project in file(".")).settings(
  inThisBuild(
    List(
      scalaVersion := "2.12.7",
    )),
  name := "http-gatling",
  scalafmtOnCompile := true,
)
