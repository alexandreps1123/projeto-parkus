# projeto-parkus

Projeto Parkus v0.0.1 
"Hello World"

A aplicação consiste na impressão de uma mensagem "Hello World!" no terminal do computador.

Para compilar a aplicação foi gerado um shellscript para automatizar o processo de execução.

Os comandos que são executados pelo script:
```
javac ProjetoParkus.java

java ProjetoParkus
```
Para criar o arquivo .sh

Em algum editor de texto basta digitar esses comandos e salvar o arquivo com a extensão .sh

```
#!/bin/bash

#compila
javac ProjetoParkus.java

#executa
java ProjetoParkus
```

Nome do arquivo: exec.sh

Para dar permissão de execução ao arquivo
```
$ chmod +x exec.sh
```
Para executar utilizando o ubuntu, basta navegar até o diretório que contenha o arquivo .sh
```
$ ./exec.sh
```
Se tudo correr bem no terminal será impresso: "Hello World!".

## Referências
[Introducao-ao-Shell-Script](https://canaltech.com.br/linux/Introducao-ao-Shell-Script/) fonte que ajudou a escrever o arquivo .sh. Data de acesso:25ago2022

