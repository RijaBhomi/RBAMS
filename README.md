# Rural Bank Account Management System (RBAMS)

## Overview

The **Rural Bank Account Management System (RBAMS)** is a console-based Java application developed to support the Rural Bank of Nepal in managing basic banking operations for rural customers. It demonstrates key Object-Oriented Programming concepts, custom exception handling, and a simple menu-driven interface to handle savings and current accounts.

---
## Class Design and Structure

### 1. BankAccount (Abstract Class)
- Common attributes:
    - `accountHolderName`
    - `accountNumber`
    - `balance`

- Abstract methods:
    - `deposit(double amount)`
    - `withdraw(double amount)`
    - `displayAccountDetails()`
  
### 2. SavingsAccount (Inherits from BankAccount)
- Restricts withdrawal beyond balance.
- Adds `addInterest()` method to apply interest to the balance.

### 3. CurrentAccount (Inherits from Bank)
- Allows overdraft up to a predefined limit.
- Restricts withdrawal beyond overdraft limit.

### 4. Transaction (Interface)
- Contains method declarations like:
    - `deposit()`
    - `withdraw()`
    - `displayAccountDetails()`

### 5. Customer
- Attributes:
    - `customerName`
    - A list of `BankAccount` objects (Aggregation)
- Methods to:
    - Add and retrieve multiple accounts
    - Display customer account information

### 6. InsufficientBalance (Custom Exception)
- Thrown when a withdrawal amount exceeds the allowed balance or overdraft limit.
- Caught in the main app with a meaningful message.

### 7. RBAMS (Main Application Class)
- Handles:
    - Menu interaction
    - Input/output
    - Account selection
    - Transaction routing

---

## OOP Concepts Used

| Concept         | Description |
|----------------|-------------|
| **Abstraction**     | `BankAccount` is an abstract class with abstract methods. |
| **Encapsulation**   | All class fields are `private` and accessed via getters/setters. |
| **Inheritance**     | `SavingsAccount` and `CurrentAccount` extend `BankAccount`. |
| **Polymorphism**    | Both account types are handled using `BankAccount` references. |
| **Aggregation**     | A `Customer` can have multiple `BankAccount` instances. |
| **Interface**       | `Transaction` interface defines a contract for all account types. |

---

## Features Implemented

- Deposit money into any account
- Withdraw money with proper validation
- Apply interest on savings account
- Enforce overdraft limit on current account
- Display account details
- Link multiple accounts to a single customer
- Exception handling with `InsufficientBalance` exception

---

## Screenshots

### Successful Deposit
![Deposit](screenshots/deposit.png)

### Withdrawal Exception
![Exception](screenshots/Exception.png)

### Interest Added
![Interest](screenshots/interest.png)

### View Account Types
![AccountTypes](screenshots/accountType.png)
