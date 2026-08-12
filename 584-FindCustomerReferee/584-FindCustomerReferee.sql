-- Last updated: 12/08/2026, 21:32:40
# Write your MySQL query statement below
SELECT name
FROM Customer
WHERE referee_id IS NULL
   OR referee_id != 2;