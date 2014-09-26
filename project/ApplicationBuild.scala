import sbt._

object ApplicationBuild extends Build {

  val appDependencies = Seq(
    "org.projectlombok" % "lombok-maven" % "1.14.8.0"
  )

}

