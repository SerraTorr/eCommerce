CREATE TABLE IF NOT EXISTS product (
    productid SERIAL PRIMARY KEY,
    price int,
    productname varchar(255)
);
CREATE TABLE IF NOT EXISTS users (
    userid SERIAL PRIMARY KEY,
    cart int []
);