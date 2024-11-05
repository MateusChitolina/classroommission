CREATE SEQUENCE IF NOT EXISTS teste_seq;

CREATE TABLE IF NOT EXISTS teste (
  id int8 NOT NULL,
  teste VARCHAR(255) NULL,
  criado_em timestamp NOT NULL,
  atualizado_em timestamp NOT NULL,
  PRIMARY KEY(id)
);
