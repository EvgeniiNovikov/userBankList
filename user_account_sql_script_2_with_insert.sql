create database userbanklist;
use userbanklist;

create table user(
userId int,
name varchar(45),
surName varchar(45)
);

create table account(
accountId int,
account int,
userId int
);

insert into user(userId, name, surName) values (1, 'Eugene', 'Novikov');
insert into user(userId, name, surName) values (2, 'Alexandr', 'Babaevich');
insert into user(userId, name, surName) values (3, 'Victory', 'Ivanova');
insert into user(userId, name, surName) values (4, 'Ivan', 'Bydko');
insert into user(userId, name, surName) values (5, 'Oleg', 'Mahno');
insert into user(userId, name, surName) values (6, 'Kate', 'Kabaeva');
insert into user(userId, name, surName) values (7, 'Andrei', 'Baranov');
insert into user(userId, name, surName) values (8, 'Jorik', 'Vartanov');
insert into user(userId, name, surName) values (9, 'Buldog', 'Harlamov');
insert into user(userId, name, surName) values (10, 'Petr', 'Petrov');

insert into account(accountId, account, userId) values (1, 15000, 1);
insert into account(accountId, account, userId) values (2, 200000, 2);
insert into account(accountId, account, userId) values (3, 350000, 3);
insert into account(accountId, account, userId) values (4, 400000, 4);
insert into account(accountId, account, userId) values (5, 100000, 5);
insert into account(accountId, account, userId) values (6, 90000, 6);
insert into account(accountId, account, userId) values (7, 75600, 7);
insert into account(accountId, account, userId) values (8, 96000, 8);
insert into account(accountId, account, userId) values (9, 2000, 9);
insert into account(accountId, account, userId) values (10, 555000, 10);

select * from user;
select * from account;



