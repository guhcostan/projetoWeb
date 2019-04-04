CREATE TABLE alunos
(
    id   bigserial    NOT NULL
        CONSTRAINT alunos_pkey PRIMARY key,
    nome VARCHAR(255) NOT NULL,
    tipo INTEGER      NOT NULL
);
ALTER TABLE alunos
    owner TO postgres;
CREATE TABLE aulas
(
    id   bigserial    NOT NULL
        CONSTRAINT aulas_pkey PRIMARY key,
    nome VARCHAR(255) NOT NULL,
    tipo INTEGER      NOT NULL
);
ALTER TABLE aulas
    owner TO postgres;
CREATE TABLE contato
(
    id       bigserial    NOT NULL
        CONSTRAINT contato_pkey PRIMARY key,
    sala     VARCHAR(255) NOT NULL,
    telefone VARCHAR(255) NOT NULL
);
ALTER TABLE contato
    owner TO postgres;
CREATE TABLE grupos_pesquisa
(
    id bigserial NOT NULL
        CONSTRAINT grupos_pesquisa_pkey PRIMARY key
);
ALTER TABLE grupos_pesquisa
    owner TO postgres;
CREATE TABLE projetos_pesquisa
(
    id          bigserial NOT NULL
        CONSTRAINT projetos_pesquisa_pkey PRIMARY key,
    ano_inicio  DATE      NOT NULL,
    ano_termino DATE,
    arquivo     bytea,
    dissertacao VARCHAR(255),
    nome        VARCHAR(255),
    resumo      VARCHAR(255),
    tese        VARCHAR(255)
);
ALTER TABLE projetos_pesquisa
    owner TO postgres;
CREATE TABLE publicacoes
(
    id        bigserial NOT NULL
        CONSTRAINT publicacoes_pkey PRIMARY key,
    metadados bytea     NOT NULL,
    tipo      INTEGER   NOT NULL
);
ALTER TABLE publicacoes
    owner TO postgres;
CREATE TABLE rel_aluno_grupo_pesquisa
(
    aluno_id BIGINT NOT NULL
        CONSTRAINT fkqq7x9cl6cmni3jb6e8xm5e4xv REFERENCES alunos,
    grupo_id BIGINT NOT NULL
        CONSTRAINT fk2nbv341to78hcbvhyfkpepsfy REFERENCES grupos_pesquisa
);
ALTER TABLE rel_aluno_grupo_pesquisa
    owner TO postgres;