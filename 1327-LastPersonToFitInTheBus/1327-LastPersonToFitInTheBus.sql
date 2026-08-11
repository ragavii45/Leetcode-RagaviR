-- Last updated: 11/08/2026, 14:17:28
# Write your MySQL query statement below
SELECT person_name
FROM Queue
WHERE turn = (
    SELECT MAX(turn)
    FROM (
        SELECT turn,
               SUM(weight) OVER (ORDER BY turn) AS total_weight
        FROM Queue
    ) t
    WHERE total_weight <= 1000
);
