# Exploratory Testing of a Money Management Application

## 1. Charter:

To explore Expense and income calculator with the 4 mathematical operators to discover the circumstances where miscalculation occurs.

**Areas**

Expense Calculator, Income Calculator

**Findings:**

All the calculations are working perfectly fine

**BUGS:**

**Overview**

When two large numbers are multiplied then the calculator incorrectly displays '0' in the results

**Steps to Reproduce**

1. On the app
2. Click on the income button
3. Enter '999999999' amount and multiply it with '999999999'
4. Verify the results

**Expected Result**

The correct result of the calculation should get displayed

**Actual Result**

Incorrect result of calculation ('0') gets displayed

**Priority**

High

**User Type**

Free User

**Tester**

Junaid Amjad

**Time Duration:**

15 min (short)

## 2. Charter:

To explore the income functionality to discover the circumstances where the income does not get added under any category

**Areas**

Income Add, Deposits Category, Salary Category, and Savings Category

**Findings:**

The income gets added under all 4 categories including Deposits Category, Salary Category, and Savings Category.

**BUGS:**

None

**Priority**

High

**Tester**

Junaid Amjad

**User Type**

Free User

**Time Duration:**

7 min (short)

## 3. Charter

To explore all categories of expenses with different expense amounts to discover that the amount gets added to the respective category

**Areas**

Income Add, Deposits Category, Salary Category, and Savings Category

**Findings:**

The expense amount gets added under each selected category

**BUGS:**

None

**Priority**

High

**Tester**

Junaid Amjad

**User Type**

Free User

**Time Duration:**

20 min (short)

## 4. Charter

To explore the expense deduction from the income to discover that the correct amount of expense gets deducted from the total income.

**Areas**

Expense deduction from income

**Findings:**

The correct expense amount  gets deducted from the total income

**BUGS:**

None

**Priority**

High

**Tester**

Junaid Amjad

**User Type**

Free User

**Time Duration:**

5 min (short)

## 5. Charter

To explore the backup and restore functionalities to discover the circumstances where the backup or restore functionality does not work

**Areas**

Backup, restore

**Findings:**

The backup and restore functionality is working fine

**BUGS:**

None

**Priority**

Medium

**Tester**

Junaid Amjad

**User Type**

Free User

**Time Duration:**

10 min (short)

## 6. Charter

To explore the functionality that is only accessible to the pro users with the list of available options to discover that the pro functionality is not accessible to the basic user.

**Areas**

Add new income category,  Add new expense category, Dark Theme, Passcode protection, Dropbox and google drive synchronization

**Findings:**

The pro functionalities are not accessible to the free user

**BUGS:**

None

**Priority**

High

**Tester**

Junaid Amjad

**User Type**

Free User

**Time Duration:**

15 min (short)

## Priority of Charters(Execution)

I will execute Charter 1 first as if the calculator is malfunctioning then the correct amount won't get reflected in the budget. 

I will the execute charter 4 because if the expense is not correctly getting deducted from the income then the app won't serve the purpose.

I will then execute Charter 6, the pro functionality should not be useable by a free user as it will result in financial loss of business

I will then execute charter 3 as the correct expense amount should get reflected in each category of expense to keep track of the expenses.

I will then execute charter 5 followed by charter 2.

**What kind of risks you need to mitigate for this type of application?**

•	Poor Encryption
Encryption is the process of converting data (details of the budget) into an encrypted form that is only readable after it has been translated back using a secret decryption key. If devices and data are not encrypted properly, then attackers can much more readily access the data.

•	Lack of Input Validation
Input validation is the process of assessing input data to ensure that it is properly formed, preventing malformed data that might consist of harmful code or may trigger malfunction in the mobile app.

•	Insecure Communication
Attackers might exploit mobile security vulnerabilities to intercept sensitive information or user data while it is traversing across the network.

