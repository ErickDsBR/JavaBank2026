# 🏦 JavaBank2026

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
| Depósito/Transferência | 🔄 Planejado |
| Saque | 🔄 Planejado |
| Persistência de dados | 🔄 Planejado |

---

## 🏗️ Arquitetura

O projeto segue o padrão **em camadas**, separando responsabilidades:

```
┌─────────────────────────────────────────────┐
│        Camada de Apresentação               │
│            (App.java → Menu.java)           │
├─────────────────────────────────────────────┤
│        Camada de Serviço                    │
│         (UserService.java)                  │
├─────────────────────────────────────────────┤
│        Camada de Modelo                     │
│          (UserData.java)                    │
└─────────────────────────────────────────────┘
```

- **Apresentação**: Interface com o usuário via console (menu interativo)
- **Serviço**: Lógica de negócio (criar usuários, listar, consultar saldo, sessão)
- **Modelo**: Estrutura de dados (conta, nome, saldo)

---

## 📁 Estrutura do Projeto

```
src/
├── App.java                          # Ponto de entrada
├── components/
│   └── Menu.java                     # Menu interativo
├── modules/
│   └── UserData/
│       └── UserData.java             # Modelo de dados
└── service/
    └── UserService.java              # Lógica de negócio
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
javac *.java modules/UserData/*.java service/*.java components/*.java

# 3. Executar
java App
```

### Menu Interativo

```
===MENU===
Usuário atual: Nenhum usuário selecionado
Chose An Option

1 - Criar/Abrir Conta do Cliente
2 - Consultar Saldo
3 - Depositar/Transferir
4 - Realizar Saque
5 - Sair
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

---

## 📈 Roadmap

### ✅ Concluído
- [x] Estrutura do projeto em camadas
- [x] Cadastro de usuários (CPF, nome, saldo)
- [x] Listagem de usuários
- [x] Consulta de saldo por CPF
- [x] Sistema de sessão (usuário atual)
- [x] Validação de saldo negativo
- [x] Menu interativo com opções

### 🔄 Em desenvolvimento
- [ ] Depósito em conta
- [ ] Saque
- [ ] Transferência entre contas

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

---

## 📬 Contato

- **GitHub**: [ErickDsBR](https://github.com/ErickDsBR)
- **Email**: erick.brsil2102@gmail.com
- **LinkedIn**: [Erick da Silva Brasil](https://www.linkedin.com/in/erick-da-silva-brasil/)

---

⚡ Feito com dedicação por Erick da Silva Brasil
