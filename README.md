# ☕ Java API Automation

API test automation framework built with Java, REST Assured, TestNG and Maven.

The project demonstrates automated REST API testing including positive and negative scenarios, response validation, status code verification and reusable test configuration.

## 🧪 Testing Scope

- GET requests
- POST requests
- PUT requests
- DELETE requests
- Positive testing
- Negative testing
- Status code validation
- Response body validation
- JSON validation
- Response time validation
- Request validation

## 🛠️ Tech Stack

- Java 17
- REST Assured
- TestNG
- Maven
- JSON
- GitHub Actions

## 🏗️ Framework Structure

```text
java-api-automation/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── config/
│   │           └── ApiConfig.java
│   │
│   └── test/
│       └── java/
│           └── tests/
│               ├── UsersApiTest.java
│               └── PostsApiTest.java
│
├── pom.xml
├── testng.xml
└── README.md
🔍 Automated Validations

The framework validates:

HTTP status codes
Response body
Required JSON fields
Response data
Response time
API behavior for invalid requests

🚀 Run Tests
mvn clean test

👩‍💻 Author

Lamunat Ramaldanova

QA Engineer | Manual QA | AQA Engineer
