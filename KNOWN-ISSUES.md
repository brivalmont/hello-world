# Intentional Sonar fixtures

Fixture branches: `codex/sonar-known-issues` and `codex/dummy-discounts`.

`src/main/java/example/KnownIssues.java` deliberately contains the following
examples for testing the existing Sonar project. Do not fix or suppress these
findings while using this branch as a scanner fixture.

- `missingCustomerNameLength`: definite null dereference, expected `java:S2259`.
- `normalizeCustomerName`: ignored result of `String.trim`, expected `java:S2201`.
- `formatOrderIds`: array `toString` returns its identity, expected `java:S2116`.
- `totalUnits`: integer multiplication can overflow before conversion to `long`,
  expected `java:S2184`.
- `weakFingerprint`: weak MD5 hashing, expected security hotspot `java:S4790`.

These helpers compile but are not called by the application or existing tests.
The branch also intentionally has uncovered new code. Exact findings depend on
the project's active quality profile and analyzer version.

Pushing this branch triggers the existing CI scanner against
`brivalmont_hello-world` in the `dev9.sc-dev9.io` environment. Its GitHub workflow
checks compilation, tests, and successful scan submission; it does not enforce
the branch quality gate because the current organization restricts non-main
branch result retrieval. View the Sonar Code Analysis check to see the findings.
