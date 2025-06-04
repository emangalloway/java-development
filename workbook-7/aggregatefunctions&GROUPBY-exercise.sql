USE Northwind;
-- Question 1
SELECT COUNT(*) NumOfSuppliers
FROM suppliers;

-- Question 2
SELECT SUM(salary)TotalAmountPaidForSalaries
FROM employees;

-- Question 3
SELECT MIN(UnitPrice)CheapestProduct
FROM products
ORDER BY ProductName,UnitPrice;

-- Question 4
SELECT AVG(UnitPrice)AvgPriceOfAllProducts
FROM products;

-- Question 5
SELECT MAX(UnitPrice)MostExpensiveProduct
FROM products;

-- Question 6
SELECT SupplierID,COUNT(*) NumOfProducts
FROM products
GROUP BY SupplierID;

-- Question 7
SELECT CategoryID, AVG(UnitPrice) AvgPricePerCategoryID
FROM products
GROUP BY CategoryID;

-- Question 8
SELECT SupplierID, COUNT(*) NumOfProducts
FROM products
GROUP BY SupplierID
HAVING COUNT(*) >= 5;

-- Question 9
SELECT 
