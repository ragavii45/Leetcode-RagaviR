-- Last updated: 12/08/2026, 21:36:21
# Write your MySQL query statement below
SELECT
    email AS Email
FROM
    Person
GROUP BY
    email
HAVING
    COUNT(*) > 1;