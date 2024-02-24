CREATE TABLE IF NOT EXISTS FUNCIONARIO(
  IdFun INT UNIQUE,
  CPF VARCHAR(15) UNIQUE,
  MATRICULA INT UNIQUE,
  NOME VARCHAR(30) NOT NULL,
  EMAIL VARCHAR(40) NOT NULL,
  TELEFONE VARCHAR(20) NOT NULL,

  CONSTRAINT IdFunPkey PRIMARY KEY (IdFun)
);