scalaVersion := "2.12.7"

val root = project
  .in(file("."))
  .dependsOn(
    RootProject(uri("https://github.com/Feuermurmel/test-sbt-library.git#1.0.0")))
