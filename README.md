# AI Demo Application

A professional Spring Boot REST API application demonstrating best practices for Java development.

## Features

- Spring Boot 3.x with Java 17
- RESTful API endpoints
- OpenAPI/Swagger documentation
- H2 in-memory database for development
- Spring Boot Actuator for monitoring
- Comprehensive testing setup
- Code quality tools (Checkstyle, SpotBugs, JaCoCo)
- Professional development environment configuration

## Prerequisites

- Java 17 or higher
- Maven 3.6+
- VS Code with Java extensions (recommended)

## Quick Start

### 1. Clone and Setup
```bash
git clone <repository-url>
cd AI_Demo
```

### 2. Run the Application
```bash
mvn spring-boot:run
```

### 3. Access the Application
- API Base URL: http://localhost:8080/api/v1
- Swagger UI: http://localhost:8080/swagger-ui.html
- H2 Console: http://localhost:8080/h2-console (dev profile only)
- Health Check: http://localhost:8080/actuator/health

## Development

### VS Code Setup
1. Install the recommended extensions:
   - Extension Pack for Java
   - Spring Boot Extension Pack
   - SonarLint
   - GitLens

2. The project includes pre-configured:
   - Debug configurations
   - Build tasks
   - Code formatting rules
   - Checkstyle configuration

### Available Maven Commands
```bash
# Clean and compile
mvn clean compile

# Run tests
mvn test

# Run with coverage
mvn clean test jacoco:report

# Check code style
mvn checkstyle:check

# Run SpotBugs analysis
mvn spotbugs:check

# Package application
mvn package

# Run application
mvn spring-boot:run
```

### Profiles
- `dev` (default): Development profile with H2 database
- `prod`: Production profile (configure external database)

## API Documentation

Once the application is running, visit:
- Swagger UI: http://localhost:8080/swagger-ui.html
- OpenAPI JSON: http://localhost:8080/v3/api-docs

## Project Structure

```
src/
├── main/
│   ├── java/org/example/
│   │   ├── config/          # Configuration classes
│   │   ├── controller/      # REST controllers
│   │   ├── dto/            # Data Transfer Objects
│   │   ├── exception/      # Exception handling
│   │   ├── service/        # Business logic
│   │   └── util/           # Utility classes
│   └── resources/
│       └── application.yml # Application configuration
└── test/                   # Test classes
```

## Code Quality

The project includes several code quality tools:

- **Checkstyle**: Enforces coding standards
- **SpotBugs**: Static analysis for bug detection
- **JaCoCo**: Code coverage reporting
- **SonarLint**: Real-time code quality feedback (VS Code extension)

## Contributing

1. Follow the established code style (enforced by Checkstyle)
2. Write tests for new functionality
3. Ensure all quality checks pass before committing
4. Use meaningful commit messages

## License

This project is licensed under the MIT License.