--CREATE SEQUENCE VitalMe
 --MINVALUE 1
 --MAXVALUE 9999999999999999999999999999
 --INCREMENT BY 1
 --START WITH 1;

create table Member
(
Member_ID char(13) not null unique,
Member_Name varchar(30),
Member_Surname varchar(30),
Member_RewardsNumber number(8),
Member_Miles number(8,2),
Member_Current_Plays int,
Member_JoinDate date,
constraint pk_Member primary key (Member_ID));

create table Discovery_Administrator
(
Administrator_EmployeeNumber char(9) not null unique,
Administrator_Name varchar(30),
Administrator_Surname varchar(30),
constraint pk_Discovery_Administrator primary key (Administrator_EmployeeNumber));

create table Rewards_Partner
(
Partner_CodeNumber Varchar(12) not null unique,
Partner_Name varchar(30),
Transaction_Amount number(8,2),
Number_of_Miles_Used number(8,2),
Transaction_Date date,
constraint pk_Rewards_Partner primary key (Partner_CodeNumber));