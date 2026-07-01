# CSE 131 Java Intro Coursework Archive

This repository is a Java coursework archive for an introductory computer science class. It contains many independent labs, studios, exercises, extensions, exam templates, data files, course-support libraries, and textbook examples. The code was not originally organized as one production application; it is closer to a semester workspace where each folder represents a separate assignment or practice area.

The current automated build focuses on the packaged calculator extension in `extensions/calculator`, because that folder already has a runnable Java package, a Swing UI, and meaningful JUnit tests for the computation logic. The rest of the repository remains available as historical coursework material.

## What Is In This Repo

| Path | Purpose |
| --- | --- |
| `book/` | Textbook/example Java programs, including algorithms, data structures, graphics, simulations, and small command-line examples. |
| `coursesupport/` | Shared support code used by assignments, including Sedgewick-style utilities, drawing/audio helpers, timing utilities, image helpers, business examples, and BioJava-related support. |
| `datafiles/` | CSV and lookup data used by exercises and examples. |
| `exams/` | Exam starter templates. |
| `exercises/` | Smaller practice problems for early Java syntax, arrays, recursion, objects, collections, and CodingBat-style work. |
| `extensions/` | Larger optional or extension assignments, including calculator, matrix operations, Tic-Tac-Toe, Conway, image processing, Fibonacci timing, trees/maps, music/chords, and bioinformatics exercises. |
| `genomes/` | FASTA and GenBank files used by bioinformatics assignments. |
| `images/` | Images and icons used by graphics, robot, and UI exercises. |
| `labs/` | Main lab assignments, including robot control, Nim, dice games, polynomial/list work, and a small project folder. |
| `labsupport/` | Lab-specific support libraries and visualizers. |
| `studios/` | In-class studio exercises for Java basics, objects, methods, linked lists, and other intro topics. |

At the time this README was written, the archive contains roughly 388 Java source files and 33 historical `*Test.java` files.

## Tested Code

The repeatable test target is the calculator extension:

- Source package: `extensions/calculator`
- Tested logic: `calculator.Computations`
- Historical UI: `calculator.Calculator`, a Swing calculator for double, integer, string, and boolean operations
- Test class: `calculator.ComputationsTest`
- Test framework: JUnit 4
- Coverage tool: JaCoCo
- Quality check: Checkstyle

The calculator computation class covers:

- Double arithmetic: add, subtract, multiply, divide
- Integer arithmetic: add, subtract, multiply, divide
- String concatenation
- Boolean `AND` and `OR`
- Simple type conversion helpers
- Unsupported conversions that intentionally throw `UnsupportedOperationException`

The Maven build excludes the Swing UI from coverage enforcement because the meaningful unit-test surface is the deterministic computation logic. The UI still compiles as part of the calculator package.

## Local Setup

Install Java 17 and Maven, then run:

```bash
mvn verify
```

That command compiles the calculator package, runs the JUnit tests, generates a JaCoCo report, enforces at least 90% line coverage for the tested computation logic, and runs Checkstyle.

Useful commands:

```bash
mvn test
mvn verify
mvn -DskipTests checkstyle:check
```

JaCoCo writes the HTML coverage report to:

```text
target/site/jacoco/index.html
```

## GitHub Actions Pipeline

The workflow is defined in `.github/workflows/ci.yml` and runs on pushes and pull requests targeting `main` and `dev`. It also runs weekly on a schedule so the repository gets periodic scanning even when code is quiet.

### Unit Tests

The `Unit Tests` job:

- Checks out the repository
- Installs Temurin Java 17
- Enables Maven dependency caching
- Runs `mvn -B verify`
- Uploads the JaCoCo HTML report as a workflow artifact

### Code Scanning: Quality

The `Code Scanning / Quality` job:

- Runs Checkstyle through Maven
- Checks for basic Java quality issues such as star imports, redundant imports, and unused imports
- Keeps quality scanning separate from unit testing so style/static-analysis failures are easy to identify

### Code Scanning: Security

The `Code Scanning / Security` job:

- Uses GitHub CodeQL for Java/Kotlin
- Runs the `security-extended` and `security-and-quality` query suites
- Builds the Maven project before analysis so CodeQL can inspect compiled Java code
- Uses least-privilege workflow permissions with `security-events: write` only on the security scanning job

GitHub documents CodeQL support for Java/Kotlin and recommends `java-kotlin` as the language selector for Java or mixed Java/Kotlin projects. GitHub also supports uploading code scanning results through the CodeQL action/SARIF flow for repositories where code scanning is enabled.

### Dependency Review

The `Dependency Review` job runs on pull requests and uses GitHub's dependency review action. It fails on newly introduced dependencies with vulnerabilities of `moderate` severity or higher.

Dependency review is available for public repositories and for organization-owned repositories with GitHub Code Security enabled. If this repository is private and not covered by GitHub Code Security, that job may need to be disabled or GitHub Code Security enabled in repository settings.

### Dependency Automation

Dependabot is configured in `.github/dependabot.yml` for:

- Maven dependencies in `pom.xml`
- GitHub Actions versions in `.github/workflows`

Dependabot opens weekly pull requests when dependency or action updates are available.

## Notes About The Course Archive

Many folders were likely meant to be opened and submitted independently in an IDE, not compiled together from the repository root. Some assignments use duplicate class names in the default package, some are starter templates with `FIXME` placeholders, and some depend on course-specific runtime assumptions. The Maven build therefore treats `extensions/calculator` as the modernized testable module instead of forcing every historical exercise into one build.

Future modernization work could add additional Maven modules for other packaged assignments, especially folders that already have focused tests such as matrix, Tic-Tac-Toe, Conway, Fibonacci, trees/maps, and polynomial exercises.
