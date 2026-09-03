j# 🏦 JavaBank2026

![Java](https://img.shields.io/badge/Java-8%2B-orange)
![Status](https://img.shields.io/badge/Status-Em%20desenvolvimento-yellow)
![License](https://img.shields.io/badge/License-MIT-green)

---

## 🎯 Sobre

O **JavaBank2026** é um sistema bancário desenvolvido em Java como projeto acadêmico.
O sistema simula operações bancárias básicas através de um menu interativo no console,
demonstrando conceitos de Programação Orientada a Objetos e organização em camadas.

---

## ✨ Funcionalidades

| Funcionalidade | Status |
|----------------|--------|
| Cadastro de clientes (CPF, nome, saldo) | ✅ Implementado |
| Listagem de usuários | ✅ Implementado |
| Consulta de saldo por CPF | ✅ Implementado |
| Seleção de usuário atual (sessão) | ✅ Implementado |
| Validação de saldo negativo | ✅ Implementado |
| Depósito em conta | ✅ Implementado |
| Saque | ✅ Implementado |
| Transferência entre contas | ✅ Implementado |
| Persistência de dados | 🔄 Planejado |

---

## 🏗️ Arquitetura

O projeto segue o padrão **em camadas**, separando responsabilidades:

```
┌─────────────────────────────────────────────┐
│        Camada de Apresentação               │
│     (App.java → ClientMenu → UserMenu)      │
├─────────────────────────────────────────────┤
│        Camada de Serviço                    │
│    (UserService.java, BankService.java)     │
├─────────────────────────────────────────────┤
│        Camada de Modelo                     │
│       (UserData.java, Session.java)         │
├─────────────────────────────────────────────┤
│        Camada de Utilitários                │
│            (Utils.java)                     │
└─────────────────────────────────────────────┘
```

- **Apresentação**: Interface com o usuário via console (menu interativo)
- **Serviço**: Lógica de negócio (criar usuários, login, depósito, saque, transferência)
- **Modelo**: Estrutura de dados (conta, nome, saldo) e gerenciamento de sessão
- **Utilitários**: Funções auxiliares (limpeza de tela)

---

## 📁 Estrutura do Projeto

```
src/
├── App.java                          # Ponto de entrada
├── components/
│   ├── ClientMenu.java               # Menu principal do cliente
│   └── UserMenu.java                 # Menu do usuário logado
├── modules/
│   └── UserData/
│       ├── UserData.java             # Modelo de dados
│       └── Session.java              # Gerenciamento de sessão
├── service/
│   ├── UserService.java              # Gerenciamento de usuários
│   └── BankService.java              # Operações bancárias
└── utils/
    └── Utils.java                    # Utilitários gerais
```

---

## 🚀 Como Executar

### Pré-requisitos
- Java 8 ou superior instalado

### Passos

```bash
# 1. Navegar até o diretório src
cd src

# 2. Compilar os arquivos
javac *.java modules/UserData/*.java service/*.java components/*.java utils/*.java

# 3. Executar
java App
```

### Menu Interativo

```
        ===HELCOME TO ULTRABANK===
        What would you like to do?
        Current User: No user logged in

1. Create Account   2. Access Account   

3. Exit
```

---

## 🛠️ Tech Stack

| Tecnologia | Uso |
|------------|-----|
| Java 8+ | Linguagem principal |
| ArrayList | Armazenamento em memória |
| Scanner | Entrada de dados no console |
| Switch-Case | Controle de fluxo do menu |
| Classes e Objetos | Modelo de dados (UserData) |
| Métodos Estáticos | Utilitários e sessão (Utils, Session) |

---

## 📈 Roadmap

### ✅ Concluído
- [x] Estrutura do projeto em camadas
- [x] Cadastro de usuários (CPF, nome, saldo)
- [x] Consulta de saldo por CPF
- [x] Sistema de sessão (usuário atual)
- [x] Validação de saldo negativo
- [x] Menu interativo com opções
- [x] Depósito em conta
- [x] Saque
- [x] Transferência entre contas

### 🔄 Em desenvolvimento
- [ ] Listagem de usuários
- [ ] Persistência de dados

### 🔧 Refatoração e Qualidade de Código
- [x] Constructor injection nas dependências (ClientMenu, UserMenu, UserService)
- [ ] Compartilhar uma única instância de Scanner entre as classes
- [ ] Padronizar métodos em camelCase (showMenu, newUser, checkBalance)
- [ ] Encapsulamento dos campos de UserData (private + getters/setters)
- [ ] Tratamento de exceções (NumberFormatException no parseInt)
- [ ] Unificar idioma do código (PT ou EN em todo o projeto)
- [ ] Remover recursão circular no ClientMenu (stack overflow)

### 📋 Futuro
- [ ] Banco de dados (persistência)
- [ ] Validação de CPF
- [ ] Tratamento de exceções
- [ ] Testes unitários

---

## 💡 O que aprendi

- Organização de código em **pacotes e camadas**
- Uso de **coleções** (ArrayList) para armazenamento em memória
- Manipulação de **entrada/saída** de dados via console
- Importância da **validação** de dados (saldo negativo)
- Controle de fluxo com **switch-case** e loops
- Sistema de **sessão** para rastrear o usuário atual
- **Refatoração** de código para melhorar legibilidade e manutenção
- Separação de responsabilidades entre **componentes** (ClientMenu, UserMenu)
- Criação de **utilitários** reutilizáveis (Utils)
- **Injeção de dependência** via construtor para desacoplamento
- Separação de **camadas de serviço** (UserService vs BankService)

---

## 📬 Contato

- **GitHub**: [ErickDsBR](https://github.com/ErickDsBR)
- **Email**: erick.brsil2102@gmail.com
- **LinkedIn**: [Erick da Silva Brasil](https://www.linkedin.com/in/erick-da-silva-brasil/)

---

⚡ Feito com dedicação por Erick da Silva Brasil
