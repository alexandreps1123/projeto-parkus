USE `parkus_king`;
CREATE DATABASE	`parkus_king`;

CREATE TABLE `usuario` (
	`id` INTEGER NOT NULL PRIMARY KEY,
	`nome` VARCHAR(100) NOT NULL,
	`email` VARCHAR(80) NULL UNIQUE
);
