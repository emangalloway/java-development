-- Question 1
USE northwind;

SELECT ProductId, ProductName, UnitPrice
FROM products
WHERE UnitPrice = (SELECT MAX(UnitPrice)
					FROM products);

-- Question 2
SELECT OrderID,ShipName,ShipAddress
FROM orders
WHERE ShipVia = (SELECT ShipperID
FROM Shippers
WHERE CompanyName = "Federal Shipping");

-- Question 3
SELECT OrderID
FROM `Order Details`
WHERE ProductID = (SELECT ProductID
				FROM products
				WHERE ProductName LIKE "Sasquatch Ale");
                
-- Question 4
SELECT FirstName,LastName
FROM employees
WHERE EmployeeID = (SELECT EmployeeID
					FROM orders
                    WHERE OrderID = "10266");

-- Question 5
SELECT CompanyName
FROM customers
WHERE CompanyName = (SELECT CustomerID
					FROM orders
                    WHERE OrderID = "10266");
