-- Last updated: 12/08/2026, 21:30:35
# Write your MySQL query statement below
SELECT
    p.product_name,
    s.year,
    s.price
FROM Product p
JOIN Sales s
    ON p.product_id = s.product_id;