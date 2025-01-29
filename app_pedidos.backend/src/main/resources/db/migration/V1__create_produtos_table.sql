CREATE TABLE produtos (
    id SERIAL PRIMARY KEY,
    titulo TEXT NOT NULL,
    preco DECIMAL(10,2) NOT NULL
);

INSERT INTO produtos (titulo, preco)
VALUES
('Teclado Gamer', 566.99),
('Camiseta Básica', 119.99),
('Pasta de dente', 14.23),
('Conjunto com 10 copos plásticos', 79.99),
('Mouse Wireless', 344.99);