-- Last updated: 12/08/2026, 21:36:38
# Write your MySQL query statement below
SELECT p.firstName,
       p.lastName,
       a.city,
       a.state
FROM Person p
LEFT JOIN Address a
ON p.personId = a.personId;