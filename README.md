# Projeto Agibank

# Configuração e Execução do Projeto

## Branch

Utilizar a branch master

## Instalar o JDK

Link para download do JDK - https://www.oracle.com/java/technologies/downloads/#java11

### Windows
1. Baixe o instalador do JDK no site da Oracle.
2. Execute o instalador e siga as instruções na tela.

### Linux
1. Abra o terminal.
2. Execute o comando `sudo apt-get install default-jdk` para instalar o JDK padrão do Ubuntu.

### MacOS
1. Baixe o instalador do JDK no site da Oracle.
2. Execute o instalador e siga as instruções na tela.

## Configurar o JDK

### Windows
1. Abra o Painel de Controle.
2. Clique em "Sistema e Segurança" e depois em "Sistema".
3. Clique em "Configurações Avançadas do Sistema".
4. Clique em "Variáveis de Ambiente".
5. Na seção "Variáveis do Sistema", clique em "Novo".
6. Adicione `JAVA_HOME` como o nome da variável e o caminho para a pasta do JDK como o valor.

### Linux
1. Abra o arquivo `~/.bashrc`, `~/.bash_profile` ou `~/.zshrc` no editor de texto.
2. Adicione a linha `export JAVA_HOME=/usr/lib/jvm/default-java` (ou o caminho correto para o JDK) ao final do arquivo.
3. Salve e feche o arquivo.
4. Execute o comando `source ~/.bashrc` ou `source ~/.bash_profile` para atualizar as variáveis de ambiente.

### MacOS
1. Abra o terminal.
2. Execute o comando `sudo nano /etc/paths`.
3. Adicione o caminho para a pasta do JDK no final do arquivo.
4. Salve e feche o arquivo.

## Baixar e Configurar o Projeto

1. Clone o repositório do projeto.
2. Abra o terminal e navegue até o diretório do projeto.
3. Execute o comando `mvn clean install` para baixar e instalar as dependências do projeto.

## Setar o browser e URL que deseja

No arquivo config.properties dentro da pasta ENV insira a URL e o browser que deseja.

EX: 

url=https://blogdoagi.com.br/
browser=firefox

## Executar os Testes

Para rodar os testes no Google Chrome, é necessário ter a versão 11 ou inferior instalada.

### Comando para Linux e MacOS

mvn test
