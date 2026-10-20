-- Desativa a trava de segurança temporariamente
SET SQL_SAFE_UPDATES = 0;

-- 1. Apaga as relações de procedimentos dos agendamentos do cliente 2
DELETE FROM agendamento_procedimento 
WHERE id_agendamentos IN (
    SELECT id_agendamentos FROM agendamentos WHERE id_clientes = 2
);

-- 2. Apaga os agendamentos do cliente 2
DELETE FROM agendamentos 
WHERE id_clientes = 2;

-- 3. Apaga o cliente 2
DELETE FROM clientes 
WHERE id_clientes = 2;

-- Reativa a trava de segurança
SET SQL_SAFE_UPDATES = 1;