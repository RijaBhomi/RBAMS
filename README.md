# 🌾 Rural Bank Account Management System (RBAMS)

## 📘 Overview

The **Rural Bank Account Management System (RBAMS)** is a console-based Java application developed to support the Rural Bank of Nepal (RBN) in managing basic banking operations for rural customers. It demonstrates key Object-Oriented Programming (OOP) concepts, custom exception handling, and a simple menu-driven interface to handle savings and current accounts.

---

## 🧩 Class Design & Structure

### 🔷 1. BankAccount (Abstract Class)
- Common attributes:
  - `accountHolderName`
  - `accountNumber`
  - `balance`
- Abstract methods:
  - `deposit(double amount)`
  - `withdraw(double amount)`
  - `displayAccountDetails()`

### 🔷 2. SavingsAccount (Inherits from BankAccount)
- Restricts withdrawal beyond balance.
- Adds `addInterest()` method to apply interest to the balance.

### 🔷 3. CurrentAccount (Inherits from BankAccount)
- Allows overdraft up to a predefined limit.
- Restricts withdrawal beyond overdraft limit.

### 🔷 4. Transaction (Interface)
- Contains method declarations like:
  - `deposit()`
  - `withdraw()`
  - `displayAccountDetails()`

### 🔷 5. Customer
- Attributes:
  - `customerName`
  - A list of `BankAccount` objects (Aggregation)
- Methods to:
  - Add and retrieve multiple accounts
  - Display customer account information

### 🔷 6. InsufficientBalance (Custom Exception)
- Thrown when a withdrawal amount exceeds the allowed balance or overdraft limit.
- Caught in the main app with a meaningful message.

### 🔷 7. RBAMS (Main Application Class)
- Handles:
  - Menu interaction
  - Input/output
  - Account selection
  - Transaction routing

---

## 💡 OOP Concepts Used

| Concept         | Description |
|----------------|-------------|
| **Abstraction**     | `BankAccount` is an abstract class with abstract methods. |
| **Encapsulation**   | All class fields are `private` and accessed via getters/setters. |
| **Inheritance**     | `SavingsAccount` and `CurrentAccount` extend `BankAccount`. |
| **Polymorphism**    | Both account types are handled using `BankAccount` references. |
| **Aggregation**     | A `Customer` can have multiple `BankAccount` instances. |
| **Interface**       | `Transaction` interface defines a contract for all account types. |

---

## ⚙️ Features Implemented

- ✅ Deposit money into any account
- ✅ Withdraw money with proper validation
- ✅ Apply interest on savings account
- ✅ Enforce overdraft limit on current account
- ✅ Display account details
- ✅ Link multiple accounts to a single customer
- ✅ Exception handling with `InsufficientBalance` exception

---

## 📸 Screenshots

![deposit](https://github.com/user-attachments/assets/9b3c3d27-da61-4e54-a678-50d1cfee762b)

![accountType](https://github.com/user-attachments/assets/6f001547-622d-422f-a6ce-72414904413a)

![Exception](https://github.com/user-attachments/assets/868ee43f-5323-4c7f-bfa3-2136ebc2ac8e)

![interest](https://github.com/user-attachments/assets/14816c6c-0643-46c5-861c-7ac3c97079e3)



