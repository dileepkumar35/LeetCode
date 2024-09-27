# Write your MySQL query statement below
select contest_id, ROUND(COUNT(DISTINCT user_id ) * 100 / (select COUNT(user_id) from Users), 2) AS percentage 
from Register
group by contest_id
ORDER BY percentage desc, contest_id
