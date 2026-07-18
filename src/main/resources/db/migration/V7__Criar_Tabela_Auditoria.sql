CREATE TABLE public.auditoria (
    id int4 NOT NULL,
    entidade varchar(50) NOT NULL,
    registro_id int4 NOT NULL,
    operacao varchar NOT NULL,
    data_operacao timestamp NULL,
    CONSTRAINT auditoria_pkey PRIMARY KEY (id)
);