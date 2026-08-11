-- Last updated: 11/08/2026, 14:19:56
# Write your MySQL query statement below
SELECT DISTINCT s1.*
FROM Stadium s1
JOIN Stadium s2
ON s2.id BETWEEN s1.id - 2 AND s1.id + 2
AND s2.people >= 100
JOIN Stadium s3
ON s3.id BETWEEN s1.id - 2 AND s1.id + 2
AND s3.people >= 100
WHERE s1.people >= 100
AND (
    (s1.id = s2.id + 1 AND s1.id = s3.id + 2) OR
    (s1.id = s2.id - 1 AND s1.id = s3.id - 2) OR
    (s1.id = s2.id - 1 AND s1.id = s3.id + 1)
)
ORDER BY visit_date;