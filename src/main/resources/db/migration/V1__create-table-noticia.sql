CREATE TABLE noticia (
    id SERIAL  PRIMARY KEY,
    codigo VARCHAR(4),
    titulo VARCHAR(100),
    descricao VARCHAR(300),
    autor VARCHAR(40)
);