# Write your MySQL query statement below
select user_id, CONCAT(UPPER(LEFT(name, 1)), LOWER(RIGHT(name, LENGTH(name) - 1))) AS name
FROM Users
ORDER BY user_id ASC