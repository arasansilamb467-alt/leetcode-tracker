-- Last updated: 7/9/2026, 10:15:04 AM
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  SET N = N - 1;
  RETURN (
      # Write your MySQL query statement below.
      SELECT DISTINCT salary 
      FROM Employee 
      ORDER BY salary DESC 
      LIMIT 1 OFFSET N
  );
END