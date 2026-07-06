# 🛒 SauceDemo Automation Framework

A Selenium WebDriver automation framework built with Java to automate the core user workflows of the Sauce Demo e-commerce application.

The framework is designed using the **Page Object Model (POM)** to improve code maintainability and reusability. It also includes automated reporting, screenshot capture for failed tests, and a GitHub Actions CI pipeline for continuous integration.

---

## 🚀 Automated Test Scenarios

The framework automates the following user flows:

* ✅ User Login
* ✅ Add Product to Cart
* ✅ Shopping Cart Validation
* ✅ Checkout Process
* ✅ User Logout

---

## 🛠️ Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* Page Object Model (POM)
* Extent Reports
* TestNG Listeners
* GitHub Actions (CI/CD)
* YAML

---

## 📂 Project Structure

```text
## 📂 Project Structure

```text
.
├── src
│   └── main
│       └── java
│           ├── base         
│           ├── listeners     
│           ├── pages        
│           ├── tests         
│           └── utils         
├── .github
│   └── workflows
│       └── ci.yml           
├── pom.xml                 
├── testng.xml             
└── README.md
```

## Framework Features

* Page Object Model (POM) architecture
* Reusable utility classes
* TestNG test execution
* Maven dependency management
* Extent Reports for execution reports
* Automatic screenshots on test failures using TestNG Listeners
* Easy-to-maintain project structure
* GitHub Actions workflow for Continuous Integration

---

## Prerequisites

* Java JDK 17 (or compatible version)
* Maven
* Google Chrome
* ChromeDriver (or WebDriverManager if configured)

---

## Run the Project

Clone the repository:

```bash
git clone https://github.com/<your-username>/<repository-name>.git
```

Navigate to the project:

```bash
cd <repository-name>
```

Install dependencies:

```bash
mvn clean install
```

Run the test suite:

```bash
mvn test
```

---

## 📊 Test Reports

After execution, the framework automatically generates:

* Extent Report
* Screenshots for failed test cases

---

## 🔄 Continuous Integration

A GitHub Actions workflow is configured to automatically:

* Build the project
* Install Maven dependencies
* Execute the TestNG test suite
* Verify the project on every push or pull request

---


---

## 👨‍💻 Author

**Your Name**

If you found this project useful, feel free to fork it or leave a ⭐ on the repository.
