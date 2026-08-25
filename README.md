# JavaBank2026

## Descrição
Sistema bancário em console desenvolvido em Java para gerenciamento de contas cliente. O aplicativo permite criar/contas, consultar saldos, depositar/sacar e listar usuários através de um menu interativo.

## Funcionalidades
- Criar/abrir conta de cliente
- Consultar saldo de usuários
- Depositar/transferir valores
- Realizar saques
- Listar todos os usuários cadastrados

## Estrutura do Projeto

```
src/
├── App.java          -- Ponto de entrada da aplicação
├── components/
│   └── Menu.java     -- Menu interativo do sistema
├── modules/
│   └── UserData.java -- Modelo de dados do usuário (conta, nome, saldo)
└── service/
    └── UserService.java -- Lógica de negócio para cadastro e listagem de usuários
```

## Como Executar

### Pré-requisitos
- Java 8 ou superior instalado

### Compilação e execução
```bash
# Navegar até o diretório src
cd src

# Compilar todos os arquivos
javac *.java modules/*.java service/*.java components/*.java

# Executar a aplicação
java App
```

## Tecnologias Utilizadas
- Java (JDK 8+)
- Estruturas de dados: ArrayList
- Entrada de usuário: Scanner

## Autor
Projeto desenvolvido como atividade acadêmica para Java faculdade 2026.