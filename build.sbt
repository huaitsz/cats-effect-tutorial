name := "cats-effect-tutorial"

version := "1.3.0"

scalaVersion := "2.12.7"

libraryDependencies += "org.typelevel" %% "cats-effect" % "1.3.0" withSources() withJavadoc()

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:postfixOps",
  "-language:higherKinds",
  "-Ypartial-unification")
