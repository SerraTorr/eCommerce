CREATE TABLE IF NOT EXISTS product (
    productid SERIAL PRIMARY KEY,
    price int,
    productname varchar(255)
);
CREATE TABLE IF NOT EXISTS cart (
    productid int;
);

-- Examples
-- Add Array: INSERT INTO users (cart) VALUES (array[3,4]);
-- Append Array: UPDATE users SET cart = cart || 4 WHERE userid=1;

-- Add User with empty array: INSERT INTO users (cart) VALUES (array[]::int[]);