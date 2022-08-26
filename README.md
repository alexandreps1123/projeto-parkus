# projeto-parkus

Projeto Parkus v0.0.1 
"Hello World"

A aplicação consiste na impressão de uma mensagem "Hello World!" no terminal do computar.

Para compilar a aplicação foi gerado um shellscript para aumotizar esse processo.

Os comando executar pelo script:
javac Main.java

java Main

Para criar o arquivo .sh

Em algum editor de texto basta digitar esses comandos e salvar o arquivo com a extensão .sh

#!/bin/bash

#compila
javac Main.java

#executa
java Main

----------nome do arquivo
>exec.sh

Para dar permissão de execução
$ chmod +x exec.sh

Para executar utilizando o ubuntu, basta navegar até o diretório que contenha o arquivo .sh
$ sh exec.sh

Se tudo correr bem no terminal será impresso: "Hello World!".
