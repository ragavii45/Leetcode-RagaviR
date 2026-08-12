-- Last updated: 12/08/2026, 21:32:19
# Write your MySQL query statement below
UPDATE Salary
SET sex =
    CASE
        WHEN sex = 'm' THEN 'f'
        ELSE 'm'
    END;