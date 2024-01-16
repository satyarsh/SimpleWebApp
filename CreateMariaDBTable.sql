CREATE DATABASE IF NOT EXISTS TESTDB;

CREATE TABLE IF NOT EXISTS Users (
id int primary key auto_increment,
FirstName varchar(50) not null,
LastName varchar(65) not null,
Email varchar(255) not null,
Phone varchar(50) not null
);

USE TESTDB;

SHOW TABLES;

DESCRIBE Users;

--                              --
--  Some Dummy Data for testing --
--                              --

INSERT INTO Users (FirstName,LastName,Email,Phone) VALUES ('Aj' , 'Simpson' , 'ajsimpson123@email.com', '12312312355');