create database Madame_Beauty;
use Madame_Beauty;

create table profissionais(
id_profissionais int auto_increment primary key,
nome varchar(200) not null,
registro_profissional varchar(300) not null,
especialidade varchar(70) not null,
status enum('ativo' , 'inativo') not null
);

create table usuarios(
id_usuarios int auto_increment primary key,
nome varchar(200) not null,
login varchar(50) not null,
senha_hash varchar(255) not null,
perfil enum('administrador' , 'recepcionista') not null,
status enum('ativo' , 'inativo'),
tentativas_falhas int not null,
id_profissionais int null,
foreign key (id_profissionais) references profissionais(id_profissionais)
);

create table sessoes(
id_sessoes int auto_increment primary key,
id_usuarios int not null,
token_hash char(64) not null unique,
data_criacao datetime not null,
ultima_atividade datetime not null,
status enum('ativa' , 'encerrada' , 'expirada')
);

create table clientes(
id_clientes int auto_increment primary key,
nome varchar(200) not null,
cpf_hash char(14) not null,
cpf_cifrado varbinary(255) not null,
endereco_cif varbinary(255) null,
telefone_cif varbinary(255) null,
email_cif varbinary(255) null,
observacoes_cif varbinary(255) null,
status enum('ativo' , 'inativo'),
senha varchar(250) not null
);

create table procedimentos(
id_procedimentos int auto_increment primary key,
nome varchar(100) not null,
descricao text null,
duracao int not null,
valor decimal(8,2) not null,
status enum('ativo' , 'inativo') not null
);

create table agendamentos(
id_agendamentos int auto_increment primary key,
data date not null,
hora_inicio time not null,
hora_fim time not null,
valor_total decimal(8,2) not null,
situacao enum('agendado' , 'concluido' , 'cancelado'),
id_clientes int not null,
id_profissionais int not null,
foreign key (id_clientes) references clientes(id_clientes),
foreign key (id_profissionais) references profissionais(id_profissionais)
);

create table agendamento_procedimento(
id_agendamentos_procedimento int auto_increment primary key,
valor_cobrado DECIMAL(10, 2) NOT NULL, 
id_procedimentos int not null,
id_agendamentos int not null,
foreign key (id_procedimentos) references procedimentos(id_procedimentos),
foreign key (id_agendamentos) references agendamentos(id_agendamentos)
);

