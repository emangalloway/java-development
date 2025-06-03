-- Question 1
SELECT * FROM northwind.orders;

-- Question 2
USE northwind;

SELECT ProductID,ProductName,UnitPrice
FROM Products;

-- Question 3
SELECT ProductID,ProductName,UnitPrice
FROM Products
ORDER BY UnitPrice ASC;

-- Question 4
SELECT *
FROM Products
WHERE UnitPrice <= 7.50;

-- Question 5
SELECT *
FROM Products
WHERE UnitsInSTock >= 100
ORDER BY UnitPrice DESC;

-- QUestion 6
SELECT ProductName, UnitPrice, UnitsInSTock
FROM Products
WHERE UnitsInSTock >= 100
ORDER BY UnitPrice DESC,ProductName ASC;

-- Question 7
SELECT *
FROM Products
WHERE UnitsInStock = 0 AND UnitsOnORDER > 0
ORDER BY ProductName;

-- Question 8
SELECT *
FROM northwind.categories;

-- Question 9
SELECT *
FROM categories
WHERE CategoryName = "seafood"
ORDER BY CategoryID;

-- Question 10
SELECT *
FROM Products
WHERE CategoryID = 8;

-- Question 11
SELECT FirstName,LastName
FROM employees;

-- Question 12
SELECT *
FROM employees
WHERE Title like "%manager%";

-- Question 13
SELECT DISTINCT (Title)
FROM employees;

-- Question 14
SELECT *
FROM employees
WHERE Salary BETWEEN 2000 AND 2500;

-- Question 15
SELECT *
FROM suppliers;

-- Question 16
SELECT *
FROM products
WHERE SupplierID = 4;