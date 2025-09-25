## Recap 

1.  distinct 
2. select 
3. where 
4. AND, OR, NOT 


how to find the employee whose name start with K
1. select * from EMPLOYEE where EMPLOYEE_NAME like 'K%'; 

how to find employee who is from Canada and Has salary greater than 50K
select * from EMPLOYEE where EMPLOYEE_ADDRESS = 'Canada' AND EMPLOYEE_SALARY > 50000;

how to find all the employees whose salary is greater than 20K and less than 30K.
select * from EMPLOYEE where EMPLOYEE_SALARY between 20K and 30K.

## Normalization ?
redundant data 
1NF
2NF
3NF
BCNF
4NF
5NF


## Primary key ?
Unique key identified in the table.


## queries 



show databases ;

use pragra;
show tables;

select *
from EMPLOYEE LIMIT 3;

-- create a database
create database Student;
use Student;
show tables;

-- create tables
create table Student (id int, name varchar(255), email varchar(255), course varchar(255));
select * from Student;

-- insert data into the student table
insert into Student(id, name, email, course) values (101, 'Divine', 'divine@gmail.com', 'Java');

-- update the column names ? Alter
alter table Student rename column id to student_id;

-- add another column
alter  table Student add student_address varchar(255);


-- update the column data
update Student set student_address = 'Mississauga' where Student.student_id = 101;


-- delete a table ?
drop table Student;

drop database Student;
show databases ;

use Bileesh;



-- truncate , removed all the data from the table
truncate table Student;




-- create table, add some records, update
-- 1.columns, update data inside.



-- constraints
-- unique, primary key, foreign key, check , null

show databases ;
use pragra;


create table Student (
id int ,
name varchar(255) NOT NULL,
age int NOT NULL,
course varchar(255) NOT NULL,
PRIMARY KEY (id)
);
select *
from Student;

desc Student;

insert into Student (id, name, age, course) values (101, 'Sunny', 100, 'Java');
insert into Student (id, name, age, course) values (102, 'Divine', 100, 'Java');
insert into Student (id, name, age, course) values (103, 'Bileesh', 100, 'Java');
insert into Student (id, name, age, course) values (104, 'Gurjit', 100, 'Java');
insert into Student (id, name, age, course) values (105, 'Gurjit', 100,'');


-- check
create table Voter (
id int ,
name varchar(255) NOT NULL,
age int NOT NULL,
course varchar(255) NOT NULL,
check(age > 18)
);

insert into Voter (id, name, age, course) values (101, 'Sunny', 19, 'Java');
select *
from Voter;




-- Functions
select *
from EMPLOYEE;

-- max salary ? min salary
select max(EMPLOYEE_SALARY) from EMPLOYEE;
select min(EMPLOYEE_SALARY) from EMPLOYEE;


-- how many employees with salary greater than 50K
select count(EMPLOYEE_SALARY) from EMPLOYEE where EMPLOYEE_SALARY > 50000;

-- how many employees from Japan and salary greater than 50K
select count(EMPLOYEE_SALARY) from EMPLOYEE where EMPLOYEE_SALARY > 50000 AND EMPLOYEE_ADDRESS = 'Japan';



-- Sum
select sum(EMPLOYEE_SALARY) from EMPLOYEE;

-- avg
select avg(EMPLOYEE_SALARY) from EMPLOYEE;



















