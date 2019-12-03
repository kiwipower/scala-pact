resolvers += Resolver.jcenterRepo

libraryDependencies ++= Seq(
  "com.sun.xml.bind" % "jaxb-impl" % "2.3.2"
)

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.6")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0")

addSbtPlugin("org.wartremover" % "sbt-wartremover" % "2.2.1")

addSbtPlugin("com.lightbend.paradox" % "sbt-paradox" % "0.3.0")

resolvers += "jgit-repo" at "http://download.eclipse.org/jgit/maven"

addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.6.2")

addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "1.3.1")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.6")

addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.9.0")

addSbtPlugin("ch.epfl.scala" % "sbt-bloop" % "1.0.0")

addSbtPlugin("com.dwijnand" % "sbt-travisci" % "1.2.0")

addSbtPlugin("ohnosequences" % "sbt-s3-resolver" % "0.19.0")
