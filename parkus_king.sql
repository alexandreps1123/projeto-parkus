CREATE TABLE `usuario` (
	`id` int NOT NULL,
	`nome` TEXT NOT NULL,
	`email` TEXT NOT NULL UNIQUE,
	PRIMARY KEY (`id`)
);


