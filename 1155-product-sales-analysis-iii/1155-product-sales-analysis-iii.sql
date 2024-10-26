# Write your MySQL query statement below
select product_id, year AS first_year, quantity, price
from sales
where (product_id, year) IN (
    SELECT product_id, MIN(year) as year
    FROM sales
    GROUP BY product_id);
