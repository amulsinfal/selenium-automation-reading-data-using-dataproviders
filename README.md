## 🚀 Selenium Automation – Data-Driven Testing with TestNG DataProviders
Data-driven testing is a crucial part of robust automation frameworks. As part of my continuous learning and hands-on practice with Selenium and TestNG, I recently implemented TestNG DataProviders to streamline data-driven testing across multiple scenarios in my framework.

---

### 🔍 What I’ve Achieved:
1. Separated test logic from test data for better maintainability
2. Used DataProviders for multiple scenarios (valid, invalid, and edge cases)
3. Made test scripts cleaner, reusable, and scalable

---

### 📂 Project Structure:
<img width="362" height="782" alt="01_ProjectStructure" src="https://github.com/user-attachments/assets/63d96b70-e77e-4f56-b5fc-58b35288b4a8" />

---

### 🔧 Implementation Steps:
1. Created a TestDataProviders utility class
   - Centralized test data using @DataProvider methods: validLoginData, lockedUserData, and invalidUserData
   - <img width="1497" height="633" alt="eclipse_USYs1lHNed" src="https://github.com/user-attachments/assets/3398f5da-b266-4aa6-be8e-dd2b07687cf1" />


2. Parameterized Test Methods using @Test(dataProvider = ...)
   - Injected combinations of inputs and expected outputs
   - <img width="1497" height="689" alt="eclipse_HjuJi7D9Hs" src="https://github.com/user-attachments/assets/46070055-f82f-4487-83f4-1c680680d02b" />

3. Implemented tests in the @Test class e.g. (LoginTest)
   - Verified successful paths and validated error handling using different user data

---

### ▶️ Steps to Run This Project:
1. Create and Clone the project to selenium-automation-reading-data-using-dataproviders folder
```
git clone https://github.com/amulsinfal/selenium-automation-reading-data-using-dataproviders.git
```
2. Go to the folder selenium-automation-reading-data-using-dataproviders containing the testng.xml file
```
cd selenium-automation-reading-data-using-dataproviders
```
3. Open command prompt from this location and Run maven command in command prompt.
```
mvn test
```

<img width="1080" height="1872" alt="WindowsTerminal_N0MQ7sdIGk" src="https://github.com/user-attachments/assets/cc849684-5733-4be3-8f35-94ad6e9aa103" />

---

### ✅ Benefits:
1. Reduced code duplication with centralized test data
2. Easier updates when test scenarios change
3. Seamless scaling for larger datasets and test conditions

---

Integrating TestNG DataProviders has made tests more dynamic, scalable, and easier to maintain.
