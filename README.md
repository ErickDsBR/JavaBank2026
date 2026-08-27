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
| Cadastro de clientes | ✅ Implementado |
| Listagem de usuários | ✅ Implementado |
| Consulta de saldos | ✅ Implementado |
| Depósito/Transferência | 🔄 Planejado |
| Saque | 🔄 Planejado |
| Persistência de dados | 🔄 Planejado |

---

## 🏗️ Arquitetura

O projeto segue o padrão **em camadas**, separando responsabilidades:

```
┌─────────────────────────────────────┐
│        Camada de Apresentação       │
│            (Menu.java)              │
├─────────────────────────────────────┤
│        Camada de Serviço            │
│         (UserService.java)          │
├─────────────────────────────────────┤
│        Camada de Modelo             │
│          (UserData.java)            │
└─────────────────────────────────────┘
```

- **Apresentação**: Interface com o usuário (console)
- **Serviço**: Lógica de negócio e regras
- **Modelo**: Estrutura de dados

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
javac *.java modules/*.java service/*.java components/*.java

# 3. Executar
java App
```

---

## 🛠️ Tech Stack

| Tecnologia | Uso |
|------------|-----|
| Java 8+ | Linguagem principal |
| ArrayList | Armazenamento em memória |
| Scanner | Entrada de dados |
| Switch-Case | Controle de fluxo |

---

## 📈 Roadmap

### ✅ Concluído
- [x] Estrutura do projeto
- [x] Cadastro de usuários
- [x] Listagem de usuários
- [x] Menu interativo

### 🔄 Em desenvolvimento
- [ ] Implementar depósito
- [ ] Implementar saque
- [ ] Implementar transferência

### 📋 Futuro
- [ ] Banco de dados (persistência)
- [ ] Validação de CPF
- [ ] Tratamento de exceções
- [ ] Testes unitários

---

## 💡 O que aprendi

- Organização de código em **pacotes e camadas**
- Uso de **coleções** (ArrayList) para armazenamento
- Manipulação de **entrada/saída** de dados
- Importância da **validação** de dados
- Planejamento de **funcionalidades** antes de codar

---

## 📬 Contato

- **GitHub**: [ErickDsBR](https://github.com/ErickDsBR)
- **Email**: erick.brsil2102@gmail.com
- **LinkedIn**: [Erick da Silva Brasil](https://www.linkedin.com/in/erick-da-silva-brasil/)

---

⚡ Feito com dedicação por Erick da Silva Brasil
