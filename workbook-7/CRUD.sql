-- Question 1
USE northwind;
INSERT INTO suppliers(CompanyName,ContactName,ContactTitle,Address,City,Region,PostalCode,Country,Phone)
VALUES ("American Loiterers","Emanuel Galloway","Owner","1234 Loiter Ave","Loiter City","",12332,"America","919-212-2212");

-- Question 2 
INSERT INTO products(ProductName,SupplierID,CategoryID,UnitPrice,UnitsInStock)
VALUES ("Loiter Package",30,2,1500,16726);

-- Question 3 
SELECT p.ProductName,s.CompanyName
FROM Products p 
LEFT JOIN Suppliers s ON p.SupplerID = s.SupplierID