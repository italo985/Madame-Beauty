USE Madame_Beauty;

-- 1. PROFISSIONAIS
INSERT INTO profissionais (nome, registro_profissional, especialidade, status)
VALUES 
('Dra. Amanda Rodrigues', 'CRBM-12345', 'Dermatologia Estética', 'ativo'),
('Mariana Costa', 'EST-98765', 'Cosmiatria e Drenagem', 'ativo');

-- 2. USUÁRIOS (OPERADORES DO SISTEMA)
-- Nota: A senha em texto puro seria "Senha123!". O hash abaixo é um exemplo gerado via bcrypt ($2a$12$...).
INSERT INTO usuarios (nome, login, senha_hash, perfil, status, tentativas_falhas, id_profissionais)
VALUES 
('Admin Sistema', 'admin', '$2a$12$e0MYzXyjpJS7Pd0RVvHwHe1qA9s.0C6/0/vLdGq1H.C6.k.b2A.mG', 'administrador', 'ativo', 0, NULL),
('Paula Recepção', 'paula.recepcao', '$2a$12$e0MYzXyjpJS7Pd0RVvHwHe1qA9s.0C6/0/vLdGq1H.C6.k.b2A.mG', 'recepcionista', 'ativo', 0, NULL),
('Dra. Amanda Rodrigues', 'amanda.estetica', '$2a$12$e0MYzXyjpJS7Pd0RVvHwHe1qA9s.0C6/0/vLdGq1H.C6.k.b2A.mG', 'recepcionista', 'ativo', 0, 1);

-- 3. SESSÕES
-- O token_hash é o hash SHA-256 de um token fictício.
INSERT INTO sessoes (token_hash, data_criacao, ultima_atividade, status, id_usuarios)
VALUES 
('e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855', NOW(), NOW(), 'ativa', 2);

-- 4. CLIENTES
-- Importante: Os campos com X'...' simulam dados binários cifrados (AES-GCM).
-- O cpf_hash possui 64 caracteres hexadecimais (resultado de um HMAC-SHA256).
INSERT INTO clientes (nome, cpf_hash, cpf_cifrado, nascimento_cif, endereco_cif, telefone_cif, email_cif, observacoes_cif, status)
VALUES 
(
  'Juliana Paes', 
'a8b9c7d6e5f4a3b2c1d0e9f8a7b6c5d4e3f2a1b0c9d8e7f6a5b4c3d2e1f0a9b8', 
  UNHEX('4145532d47434d2d454e435259505445442d4350462d4a554c49414e41'), 
  UNHEX('4145532d47434d2d454e435259505445442d44415441'), 
  UNHEX('4145532d47434d2d454e435259505445442d454e44455245434f'), 
  UNHEX('4145532d47434d2d454e435259505445442d54454c'), 
  UNHEX('4145532d47434d2d454e435259505445442d454d41494c'), 
  UNHEX('4145532d47434d2d454e435259505445442d4f425345525641434f4553'), 
  'ativo'
),
(
  'Carlos Eduardo', 
  'f0e9d8c7b6a5f4e3d2c1b0a9f8e7d6c5b4a3f2e1d0c9b8a7f6e5d4c3b2a1f0e9', 
  UNHEX('4145532d47434d2d454e435259505445442d4350462d4341524c4f53'), 
  UNHEX('4145532d47434d2d454e435259505445442d44415441'), 
  UNHEX('4145532d47434d2d454e435259505445442d454e44455245434f'), 
  UNHEX('4145532d47434d2d454e435259505445442d54454c'), 
  UNHEX('4145532d47434d2d454e435259505445442d454d41494c'), 
  NULL, 
  'ativo'
);

-- 5. PROCEDIMENTOS
INSERT INTO procedimentos (nome, descricao, duracao, valor, status)
VALUES 
('Limpeza de Pele Profunda', 'Higienização, esfoliação e extração de cravos', 60, 150.00, 'ativo'),
('Design de Sobrancelhas', 'Modelagem com pinça e acabamento', 30, 60.00, 'ativo'),
('Drenagem Linfática', 'Massagem corporal para redução de inchaço', 50, 180.00, 'ativo'),
('Bioestimulador de Colágeno', 'Aplicação injetável para firmeza da pele', 45, 1200.00, 'ativo');

-- 6. AGENDAMENTOS
INSERT INTO agendamentos (data, hora_inicio, hora_fim, valor_total, situacao, id_clientes, id_profissionais)
VALUES 
('2026-10-20', '09:00:00', '10:00:00', 210.00, 'agendado', 1, 2),
('2026-10-21', '14:00:00', '14:45:00', 1200.00, 'concluido', 2, 1);

-- 7. TABELA ASSOCIATIVA (PROCEDIMENTOS DO AGENDAMENTO)
-- Registra os procedimentos e congela o valor cobrado individualmente no momento do atendimento.
INSERT INTO agendamento_procedimento (id_agendamentos, id_procedimentos, valor_cobrado)
VALUES 
(1, 1, 150.00), -- Limpeza de Pele (Agendamento 1)
(1, 2, 60.00),  -- Design de Sobrancelhas (Agendamento 1)
(2, 4, 1200.00); -- Bioestimulador (Agendamento 2)