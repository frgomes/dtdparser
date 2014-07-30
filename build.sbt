import SonatypeKeys._

sonatypeSettings

organization := "com.github.frgomes" 

//profileName := organization.toString

// Project version. Only release version (w/o SNAPSHOT suffix) can be promoted.
version := "2.0" 



crossPaths := false

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}



// To sync with Maven central, you need to supply the following information:
pomExtra := {
  <url>http://github.com/frgomes/dtdparser</url>
  <licenses>
    <license>
      <name>BSD-2-Clause </name>
      <url>http://opensource.org/licenses/BSD-2-Clause</url>
    </license>
  </licenses>
  <scm>
    <connection>scm:git:github.com/frgomes/dtdparser.git</connection>
    <developerConnection>scm:git:git@github.com:frgomes/dtdparser.git</developerConnection>
    <url>http://github.com/frgomes/dtdparser</url>
  </scm>
  <developers>
    <developer>
      <id>frgomes</id>
      <name>Richard Gomes</name>
      <url>http://rgomes-info.blogspot.com</url>
    </developer>
  </developers>
}
