-- Last updated: 7/9/2026, 10:14:51 AM
WITH RankedEmployees AS (
    SELECT 
        departmentId,
        name AS Employee,
        salary AS Salary,
        DENSE_RANK() OVER (PARTITION BY departmentId ORDER BY salary DESC) AS rnk
    FROM 
        Employee
)
SELECT 
    d.name AS Department,
    e.Employee,
    e.Salary
FROM 
    RankedEmployees e
JOIN 
    Department d ON e.departmentId = d.id
WHERE 
    e.rnk <= 3;