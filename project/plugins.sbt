addSbtPlugin("com.dwijnand"              % "sbt-dynver"       % "4.1.1")
addSbtPlugin("org.scalameta"             % "sbt-scalafmt"     % "2.4.2")
addSbtPlugin("ch.epfl.scala"             % "sbt-scalafix"     % "0.9.28")
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat"     % "0.1.17")
addSbtPlugin("de.heikoseeberger"         % "sbt-header"       % "5.6.0")
addSbtPlugin("com.geirsson"              % "sbt-ci-release"   % "1.5.7")
addSbtPlugin("io.github.zamblauskas"     % "sbt-examplestest" % "0.2.3")

resolvers += Resolver.bintrayIvyRepo("zamblauskas", "sbt-plugins")
