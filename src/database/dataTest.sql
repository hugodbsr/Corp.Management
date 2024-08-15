INSERT INTO client (name, surname, email, phone, address, type) VALUES
    ('John', 'Doe', 'johndoe@example.com', '1234567890', '123 Elm Street, Springfield', 'Regular'),
    ('Jane', 'Smith', 'janesmith@example.com', '0987654321', '456 Oak Street, Springfield', 'Regular'),
    ('Michael', 'Johnson', 'michaeljohnson@example.com', '1122334455', '789 Pine Street, Springfield', 'VIP'),
    ('Emily', 'Davis', 'emilydavis@example.com', '5566778899', '101 Maple Street, Springfield', 'Regular'),
    ('David', 'Brown', 'davidbrown@example.com', '6677889900', '202 Birch Street, Springfield', 'VIP');

INSERT INTO employees (name, surname, email, phone, address, wage, type) VALUES
     ('Alice', 'Taylor', 'alicetaylor@example.com', '1234509876', '305 Cedar Street, Springfield', 3500.00, 'Sales'),
     ('Robert', 'Miller', 'robertmiller@example.com', '9876501234', '405 Walnut Street, Springfield', 4000.00, 'Sales'),
     ('Mary', 'Wilson', 'marywilson@example.com', '1122112233', '505 Ash Street, Springfield', 4200.00, 'Manager'),
     ('James', 'Moore', 'jamesmoore@example.com', '9988776655', '605 Cherry Street, Springfield', 3800.00, 'Sales'),
     ('Patricia', 'Taylor', 'patriciataylor@example.com', '4433221100', '705 Magnolia Street, Springfield', 3000.00, 'Assistant');

INSERT INTO products (name, description, price, quantity) VALUES
      ('Sofa', 'Comfortable three-seater sofa', 799.99, 10),
      ('Dining Table', 'Modern glass dining table', 499.99, 5),
      ('Bed Frame', 'Queen size wooden bed frame', 299.99, 7),
      ('Bookshelf', 'Five-tier wooden bookshelf', 199.99, 15),
      ('Office Chair', 'Ergonomic office chair', 149.99, 20);
