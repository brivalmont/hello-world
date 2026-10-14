plugins {
  java
  jacoco
  alias(libs.plugins.sonarqube)
}

repositories {
  mavenCentral()
}

java {
  sourceCompatibility = JavaVersion.VERSION_17
  targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
  testImplementation(platform("org.junit:junit-bom:5.10.2"))
  testImplementation("org.junit.jupiter:junit-jupiter")
  testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

jacoco {
  toolVersion = "0.8.12"
}

tasks.test {
  useJUnitPlatform()
  finalizedBy(tasks.jacocoTestReport)
}

tasks.jacocoTestReport {
  dependsOn(tasks.test)
  reports {
    xml.required.set(true)
    html.required.set(true)
  }
}

tasks.named("sonar") {
  dependsOn(tasks.classes, tasks.test, tasks.jacocoTestReport)
}

sonar {
  properties {
    property("sonar.projectKey", "brivalmont_hello-world")
    property("sonar.organization", "brivalmont")
    property("sonar.scanner.sonarcloudUrl", "https://dev9.sc-dev9.io")
    property("sonar.scanner.apiBaseUrl", "https://api.sc-dev9.io")
    property("sonar.coverage.jacoco.xmlReportPaths", "build/reports/jacoco/test/jacocoTestReport.xml")
  }
}
