# Write your MySQL query statement below
select MAX(num) AS num
from (
    select num
    from MyNumbers
    Group By num
    having COUNT(num) = 1
) AS unique_numbers;