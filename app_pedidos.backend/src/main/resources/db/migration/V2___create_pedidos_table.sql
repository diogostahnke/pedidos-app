CREATE TABLE pedidos (
    id SERIAL PRIMARY KEY,
    valor DECIMAL(10,2) NOT NULL,
    criado_em timestamp default current_timestamp
);