-- Last updated: 12/08/2026, 21:32:38
# Write your MySQL query statement below
SELECT name, population, area
FROM World
WHERE area >= 3000000
   OR population >= 25000000;