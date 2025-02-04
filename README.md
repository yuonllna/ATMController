# ATM Controller 🏧
A simple ATM Controller implemented in Java

## 📌 Features
- **Card Insertion**: Insert a card with a card info
- **PIN Authentication**: Verify PIN for user authentication
- **Account Selection**: Choose an account linked to the card
- **Transactions**: (1) Check balance (2) Deposit money (3) Withdraw money

## 🛠️ Setup & Installation

### 1. Clone the Repository 
```bash
git clone https://github.com/yuonllna/ATMController.git
cd ATMController
```
### 2. Compile the Java Files
```bash
javac -d out src/main/controller/*.java src/test/*.java
```
### 3. Run the Tests
```bash
java -cp out test.ATMControllerTest
```

## 🧪 About Test Cases
The project includes *ATMControllerTest.java* to validate ATM functionalities.\n
Below are the test cases implemented in the project:
| **Test Case**                        | **Description** |
|--------------------------------------|---------------|
| **Card Insertion - Valid Card**      | Insert a valid card (`card1`) and expect success. |
| **Card Insertion - Invalid Card**    | Insert an unknown card and expect failure. |
| **PIN Verification - Correct PIN**   | Enter the correct PIN (`1234`) for `card1` and expect success. |
| **PIN Verification - Incorrect PIN** | Enter an incorrect PIN and expect failure. |
| **Account Selection - Valid Account** | Select an account (`acc1`) linked to `card1` and expect success. |
| **Account Selection - Invalid Account** | Attempt to select an unlinked or non-existent account and expect failure. |
| **Check Balance - After Account Selection** | Check balance after selecting `acc1`, should return `1000`. |
| **Deposit Money**                     | Deposit `1000` into `acc1` and expect the balance to increase. |
| **Withdraw Money - Sufficient Balance** | Withdraw `500` from `acc1` and expect success. |
| **Withdraw Money - Insufficient Balance** | Try to withdraw `5000` from `acc1` and expect failure due to insufficient balance. |

