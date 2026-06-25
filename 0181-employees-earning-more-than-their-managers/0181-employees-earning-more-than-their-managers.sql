# Write your MySQL query statement below
select e.name as 'Employee'
from employee as e
join employee as f on e.managerId = f.id
where e.salary > f.salary;