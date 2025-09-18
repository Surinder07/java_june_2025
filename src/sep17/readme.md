
        
remote  *  * *  *  *  # # # #    - remote

feature *  * *  *  *  # # # # & & & &   - local

rebase --- 

git pull --rebase 




## Recap 

RDS - Relation Database Service 


relational- 
mysql , oracle, postgres, SqlServer, Sqlite 


SQL                 vs              NOSQL   - MongoDB, Redis, Dynamo DB
                                    document form - JSON 


## database 

collection of data store electronically / digitally 

DBMS ? Database management System 

Mysql , Postgres

tabular form 
rows and columns 

User                                    Info 
ID | NAME | AGE |                   id    ADDRESS | SALARY |
+----+----------+----- 
| 1 | Rocky | 32 |                   1    Toronto | 20000.00 |
| 2 | Daniel | 25 |                  2    Austin | 15000.00 |
| 3 | Kristy | 23 |                  3    Paris | 20000.00


NOSQL : document type : K-V

schema -    Tables
pragra -   EMPLOYEE, SALARY, 


## Queries 

show databases ;
use pragra;


show tables ;

-- all the records from employee table
select * from EMPLOYEE;

select EMPLOYEE_ID, EMPLOYEE_NAME, EMPLOYEE_ADDRESS from EMPLOYEE;

select *
from EMPLOYEE where EMPLOYEE_ADDRESS = 'Canada';

-- name is John or they are from Canada

select *
from EMPLOYEE where EMPLOYEE_ADDRESS = 'Canada' OR EMPLOYEE_NAME = 'John';


-- fetch all the employees who are from canada and asalary greater than 50000
select *
from EMPLOYEE where EMPLOYEE_ADDRESS = 'Canada' OR EMPLOYEE_SALARY > 50000;

-- fetch all the people except those who are from Canada
select *
from EMPLOYEE where NOT EMPLOYEE_ADDRESS = 'Canada';



















