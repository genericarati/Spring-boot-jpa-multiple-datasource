CREATE TABLE tbl_customer
(id INTEGER NOT NULL,
name CHAR(25),
price DOUBLE,
PRIMARY KEY (ID));

INSERT INTO tbl_customer (id, name, price) VALUES (2, 'SECOND CUSTOMER', 0.0);


CREATE TABLE tbl_book
(id INTEGER NOT NULL,
name CHAR(25),
price DOUBLE,
PRIMARY KEY (ID));


INSERT INTO tbl_book(id, name, price) VALUES (2, 'SECOND book', 0.0);