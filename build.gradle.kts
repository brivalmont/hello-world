import org.jfrog.gradle.plugin.artifactory.dsl.ArtifactoryPluginConvention

plugins {
  alias(libs.plugins.artifactory.gradle.plugin) apply false
  alias(libs.plugins.sonarqube)
  id("org.sonarqube") version "7.3.1.8318"
}

apply(plugin = "com.jfrog.artifactory")

sonar {
  properties {
    property("sonar.projectKey", "brivalmont_hello-world")
    property("sonar.organization", "brivalmont")
    property("sonar.scanner.sonarcloudUrl", "https://dev9.sc-dev9.io")
    property("sonar.scanner.apiBaseUrl", "https://api.sc-dev9.io")
  }
}
