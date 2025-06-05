-- Question 1
USE northwind;

SELECT p.ProductID,p.ProductName,p.UnitPrice,c.CategoryName
FROM Products p 
JOIN Categories c ON c.CategoryID = p.CategoryID
ORDER BY CategoryName,ProductName;

-- Question 2
SELECT p.ProductID,p.ProductName,p.UnitPrice,s.CompanyName
FROM Products p
JOIN Suppliers s ON p.supplierID = s.SupplierID
WHERE p.UnitPrice > 75
ORDER BY p.ProductName;

-- Question 3
SELECT  p.ProductID,p.ProductName,p.UnitPrice,c.CategoryName,s.CompanyName
FROM Products p
JOIN Categories c ON p.CategoryID = c.CategoryID
JOIN Suppliers s ON p.SupplierID = s.SupplierID
ORDER BY p.ProductName;

-- Question 4
SELECT p.ProductName,c.CategoryName
FROM Products p
JOIN Categories c ON p.CategoryID = c.CategoryID
WHERE p.UnitPrice =(SELECT MAX(UnitPrice)
FROM Products p); 

