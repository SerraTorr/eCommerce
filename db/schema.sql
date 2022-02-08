CREATE DATABASE ecommStore;
CREATE TABLE Product (
    id int PRIMARY KEY,
    price int,
    productName varchar(255)
);
CREATE TABLE User (
    user_id int,
    cart int []
);