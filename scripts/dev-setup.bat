@echo off
echo Setting up development environment...

echo Installing Maven dependencies...
call mvn clean install -DskipTests

echo Running initial code quality checks...
call mvn checkstyle:check

echo Setup complete! You can now:
echo - Run the application: mvn spring-boot:run
echo - Run tests: mvn test
echo - Open VS Code and start developing

pause