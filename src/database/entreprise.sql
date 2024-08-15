DROP TABLE IF EXISTS client, clients, employees, transactions, products;

CREATE TABLE client(
    cno SERIAL,
    name CHAR(100),
    surname CHAR(100),
    email CHAR(100),
    phone CHAR(100),
    address CHAR(100),
    type VARCHAR(20)
);

ALTER TABLE client ADD PRIMARY KEY(cno);

CREATE TABLE employees(
      eno SERIAL,
      name VARCHAR(100),
      surname VARCHAR(100),
      email VARCHAR(100),
      phone VARCHAR(20),
      address TEXT,
      wage DECIMAL(10, 2),
      type VARCHAR(20)
);

ALTER TABLE employees ADD PRIMARY KEY(eno);

CREATE TABLE products (
      pno SERIAL,
      name VARCHAR(100),
      description TEXT,
      price DECIMAL,
      quantity INTEGER
);

ALTER TABLE products ADD PRIMARY KEY(pno);

CREATE TABLE transactions (
      tno SERIAL,
      cno INTEGER,
      pno INTEGER,
      quantity INTEGER,
      date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
      total_price DECIMAL,
      eno INTEGER REFERENCES employees(eno),
      commission DECIMAL
);

ALTER TABLE transactions ADD PRIMARY KEY(tno);
ALTER TABLE transactions ADD FOREIGN KEY(cno) REFERENCES client(cno) ON DELETE CASCADE;
ALTER TABLE transactions ADD FOREIGN KEY(eno) REFERENCES employees(eno) ON DELETE CASCADE;