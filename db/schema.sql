CREATE DATABASE ecommStore;
CREATE TABLE  IF NOT EXISTS Product (
    id int PRIMARY KEY,
    price int,
    productName varchar(255)
);
CREATE TABLE  IF NOT EXISTS  Users (
    user_id int PRIMARY KEY,
    cart int []
);
