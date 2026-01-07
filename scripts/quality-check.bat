@echo off
echo Running comprehensive quality checks...

echo 1. Compiling code...
call mvn clean compile
if %errorlevel% neq 0 (
    echo Compilation failed!
    exit /b 1
)

echo 2. Running tests...
call mvn test
if %errorlevel% neq 0 (
    echo Tests failed!
    exit /b 1
)

echo 3. Checking code style...
call mvn checkstyle:check
if %errorlevel% neq 0 (
    echo Checkstyle violations found!
    exit /b 1
)

echo 4. Running SpotBugs analysis...
call mvn spotbugs:check
if %errorlevel% neq 0 (
    echo SpotBugs issues found!
    exit /b 1
)

echo 5. Generating coverage report...
call mvn jacoco:report

echo All quality checks passed!
echo Coverage report available at: target/site/jacoco/index.html

pause