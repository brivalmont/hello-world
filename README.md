# Sonar branch samples

A small Java 17 project with JUnit tests and JaCoCo coverage. GitHub Actions
compiles and tests the project, then runs SonarScanner for Gradle on every branch
push. It also analyzes pull requests from this repository and supports manual runs.
On `main`, the scan waits for the quality gate, so a rejected gate fails the
workflow. Other branches submit analysis without quality-gate polling: the
current Sonar organization rejects access to non-main branch results. A green
branch workflow confirms submission, not a passed quality gate.

## Run locally

```sh
./gradlew clean build jacocoTestReport
SONAR_TOKEN=<your-token> ./gradlew sonar -Dsonar.qualitygate.wait=true
```

Coverage is generated at `build/reports/jacoco/test/jacocoTestReport.xml`.
Keep tokens out of source control. CI uses the repository secret `SONAR_TOKEN`.
Gradle verifies dependency checksums against `gradle/verification-metadata.xml`.
When intentionally updating dependencies, regenerate and review those checksums
with `./gradlew --write-verification-metadata sha256 build jacocoTestReport sonarResolver`.

## Sonar configuration

The build retains the existing project key `brivalmont_hello-world`, organization
`brivalmont`, and development environment URLs (`https://dev9.sc-dev9.io` and
`https://api.sc-dev9.io`). The token must have analysis permission for this project.
The Sonar plan must support branch results to view them or enforce branch quality
gates. Automatic Analysis has been disabled for this project so that this
repository's CI-based analysis can run.

## Sample branches

- `codex/dummy-discounts`: discount calculation with tests.
- `codex/dummy-delivery`: delivery fee calculation with tests.
- `codex/dummy-receipts`: receipt formatting with tests.

Each branch starts from the shared build and scan setup and adds a separate
sample. Push a branch to trigger its scan, for example:

```sh
git push -u origin codex/dummy-discounts
```

Fork pull requests run the build and tests; their Sonar step is skipped because
GitHub does not provide repository secrets to them.
