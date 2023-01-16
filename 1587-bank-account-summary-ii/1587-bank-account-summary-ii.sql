# Write your MySQL query statement below
select u.name as NAME,sum(amount)as BALANCE
from users u
join transactions t on u.account=t.account
group by u.account
having sum(amount)>10000