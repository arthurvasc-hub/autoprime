# AutoPrime 🚗

Marketplace de carros premium com autenticação JWT e controle de acesso por tipo de usuário.

## 📌 Objetivo do projeto

Criar uma API RESTful para compra e venda de carros, com diferentes tipos de usuários (normal, premium e deluxe), cada um com regras de negócio específicas, como descontos e permissões.

O projeto foi pensado para aplicar conceitos de **Clean Architecture**, **Spring Boot**, **autenticação com JWT**, e práticas profissionais de desenvolvimento back-end com Java.

---

## 📚 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Security
- Spring Data JPA
- JWT (Json Web Token)
- H2 / PostgreSQL
- Maven
- JUnit 5 + Mockito
- Lombok

---

## 🏛️ Arquitetura

Este projeto segue os princípios da **Clean Architecture**:
src
└── main
├── domain -> Entidades e regras de negócio
├── application -> Casos de uso (Use Cases)
├── infrastructure -> Persistência, JWT, segurança, etc.
└── interface -> Controladores REST, DTOs
---

## ✅ Funcionalidades do MVP

- [ ] Cadastro de usuário
- [ ] Login com JWT
- [ ] Cadastro e listagem de carros
- [ ] Compra de carro (com regras por tipo de usuário)
- [ ] Listagem de histórico do usuário

---

## 🚧 Funcionalidades futuras (Backlog)

- [ ] Simulação de compra com desconto
- [ ] Comentários e avaliações em carros
- [ ] Painel administrativo
- [ ] Logs e auditoria
- [ ] Integração com cache ou mensageria

---

## 🛠️ Como rodar o projeto

```bash
git clone https://github.com/arthurvasc-hub/autoprime.git
cd autoprime
./mvnw spring-boot:run
```
Acesse: http://localhost:8080

🤝 Contribuição
Esse projeto foi criado com fins de estudo e evolução como desenvolvedor Java back-end. Feedbacks são bem-vindos!

🧠 Autor
Arthur Vasconcelos
Desenvolvedor Java em formação
Contato: [arthurvasc2@gmail.com] • GitHub: [arthurvasc-hub] • LinkedIn: [https://www.linkedin.com/in/arthurvasc/]
