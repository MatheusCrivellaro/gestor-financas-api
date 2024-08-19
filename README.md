# Financiator

Financiator é um sistema de gerenciamento de finanças pessoais que permite aos usuários controlar suas despesas e receitas, definir orçamentos, estabelecer metas financeiras e visualizar relatórios detalhados de suas finanças. Este projeto combina um backend robusto em Spring Boot com um frontend interativo desenvolvido em React, oferecendo uma experiência completa para gestão financeira.

## Funcionalidades

### 1. Cadastro e Autenticação de Usuários
- **Registro de Usuários:** Crie uma conta para começar a gerenciar suas finanças.
- **Autenticação Segura:** Login com segurança utilizando JWT (JSON Web Token).
- **Confirmação de E-mail:** (Opcional) Confirme seu e-mail para ativar a conta.

### 2. Gestão de Transações
- **Adicionar Transações:** Registre suas despesas e receitas, incluindo informações como valor, categoria, data e descrição.
- **Editar/Excluir Transações:** Modifique ou remova transações existentes.
- **Filtragem e Ordenação:** Filtre suas transações por categoria ou período e organize-as por data ou valor.

### 3. Categorias Personalizadas
- **Criação de Categorias:** Crie suas próprias categorias para melhor organizar suas finanças.
- **Edição e Exclusão:** Renomeie, modifique ícones ou cores, e exclua categorias desnecessárias.
- **Visualização por Categoria:** Veja suas transações agrupadas por categoria.

### 4. Orçamentos e Metas
- **Definição de Orçamentos:** Estabeleça limites de gastos por categoria e acompanhe seu orçamento.
- **Alertas de Orçamento:** Receba notificações quando estiver próximo de exceder seu orçamento.
- **Metas Financeiras:** Defina metas financeiras e acompanhe seu progresso.

### 5. Relatórios e Visualizações
- **Dashboard Financeiro:** Visualize um resumo de suas finanças, incluindo saldo atual e progresso das metas.
- **Gráficos Interativos:** Explore gráficos que mostram suas despesas por categoria e evolução do saldo ao longo do tempo.
- **Relatórios Mensais:** Gere relatórios mensais detalhados de suas finanças.

### 6. Exportação de Dados
- **Exportação para CSV/Excel:** Exporte suas transações, orçamentos e relatórios para análise externa.
- **Automatização:** Configure o envio automático de relatórios mensais por e-mail.

## Tecnologias Utilizadas

### Backend
- **Spring Boot:** Framework principal para criação da API RESTful.
- **Spring Security:** Implementação de autenticação e autorização.
- **Spring Data JPA:** Gerenciamento de persistência de dados com integração ao banco de dados.
- **JWT (JSON Web Token):** Segurança para autenticação de usuários.
- **Spring Mail:** Envio de notificações por e-mail.

## Como Executar o Projeto

### Pré-requisitos
- **Java 21:** Necessário para executar o backend em Spring Boot.
- **Node.js e npm/yarn:** Necessários para executar o frontend em React.
- **MySQL/PostgreSQL:** Banco de dados relacional para armazenar as informações financeiras.

### Passos para Execução

#### Backend (Spring Boot)
1. Clone este repositório:
   ```bash
   git clone https://github.com/MatheusCrivellaro/gestor-financas-api.git
   cd financiator/backend
