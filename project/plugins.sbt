resolvers += Resolver.sonatypeRepo("releases")

//-- resolvers += Resolver.sonatypeRepo("snapshots")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "0.2.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-pgp" % "0.8.3")

//-- addSbtPlugin("com.lihaoyi" % "utest-js-plugin" % "0.1.7")
