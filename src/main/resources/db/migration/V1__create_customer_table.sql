CREATE TABLE IF NOT EXISTS customer (
                                        id SERIAL PRIMARY KEY,          -- El id es de tipo SERIAL, lo que genera un valor único y autoincrementable
                                        name VARCHAR(255) NOT NULL,      -- El nombre del cliente, que no puede ser nulo
    email VARCHAR(255),              -- El email del cliente, que puede ser nulo
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP  -- Fecha y hora de creación, con valor predeterminado de la hora actual
    );

-- Inserción de un cliente
INSERT INTO customer (name, email)
VALUES ('John Doe', 'john.doe@example.com');
