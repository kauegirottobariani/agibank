# Projeto Agibank

# Configuração e Execução do Projeto

## Branch

Utilizar a branch master

## Instalar o JDK

Link para download do JDK - https://www.oracle.com/java/technologies/downloads/#java11

## Instalando o Homebrew 

### Linux e Windows

1. Usando o Windows Subsystem for Linux (WSL):
Siga as instruções para instalar o WSL e, em seguida, instale o Homebrew dentro do WSL como no macOS.

### Instalando o Homebrew no macOS:
Executando o Comando de Instalação:
`/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"`

### Windows
1. Baixe o instalador do JDK no site da Oracle.
2. Execute o instalador e siga as instruções na tela.

### Linux
1. Abra o terminal.
2. Execute o comando `sudo apt-get install default-jdk` para instalar o JDK padrão do Ubuntu.

### MacOS
1. Baixe o instalador do JDK no site da Oracle.
2. Execute o instalador e siga as instruções na tela.

## Instalando o Maven

### Linux
1. Usando o Gerenciador de Pacotes:
`sudo apt-get install maven`

2. Baixando do Site Oficial:
Baixe manualmente do site oficial e siga as instruções de instalação.
https://maven.apache.org/download.cgi
- Para Windows, você pode baixar o arquivo zip.
- Para Linux ou macOS, você pode baixar o arquivo tar.gz.

Para Linux e macOS, você pode adicionar o caminho ao Maven no arquivo de perfil do shell, como `~/.bash_profile`, `~/.bashrc` ou `~/.zshrc`. Adicione uma linha como:
`export PATH=/caminho/para/o/Maven/bin:$PATH`

Salve o arquivo e reinicie o terminal ou execute source` ~/.bash_profile` (ou `source ~/.bashrc` e `source ~/.zshrc`) para aplicar as alterações imediatamente.

### Windows
1. Baixando o Arquivo ZIP:
Baixe o arquivo ZIP do Maven do site oficial e extraia em um diretório.
- Para Windows, você pode baixar o arquivo zip.
- Para Linux ou macOS, você pode baixar o arquivo tar.gz.

3. Configurando as Variáveis de Ambiente:
Adicione o diretório bin do Maven ao PATH do sistema.

Para configurar as variáveis de ambiente no Windows, siga estes passos:

1. Abra o "Painel de Controle" e acesse "Sistema e Segurança" -> "Sistema" -> "Configurações avançadas do sistema".
2. Na janela "Propriedades do Sistema", clique na guia "Avançado" e depois no botão "Variáveis de Ambiente".
3. Na seção "Variáveis do Sistema", encontre a variável "Path" e clique em "Editar".
4. Na janela de "Editar variável de sistema", clique em "Novo" e adicione o caminho para o diretório bin do Maven. Por exemplo, se o Maven estiver instalado em "C:\Program Files\Apache\Maven\bin", adicione este caminho.
5. Clique em "OK" em todas as janelas para salvar as alterações.
6. Para verificar se a configuração foi feita corretamente, abra o prompt de comando e digite mvn -version. Se o Maven estiver configurado corretamente, você verá informações sobre a versão do Maven instalada.

### macOS:
1. Usando o Homebrew:
`brew install maven`

2. Baixando o Arquivo TAR:
Baixe manualmente do site oficial e siga as instruções de instalação.

Para Linux e macOS, você pode adicionar o caminho ao Maven no arquivo de perfil do shell, como `~/.bash_profile`, `~/.bashrc` ou `~/.zshrc`. Adicione uma linha como:
`export PATH=/caminho/para/o/Maven/bin:$PATH`

Salve o arquivo e reinicie o terminal ou execute source` ~/.bash_profile` (ou `source ~/.bashrc` e `source ~/.zshrc`) para aplicar as alterações imediatamente.

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

1. url=https://blogdoagi.com.br/
2. browser=firefox

## Executar os Testes

Para rodar os testes no Google Chrome, é necessário ter a versão 11 ou inferior instalada.

### Comando para Linux, MacOS e Windows

mvn test
