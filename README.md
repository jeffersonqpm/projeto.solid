# Princípios SOLID em Java

Os princípios **SOLID** são um conjunto de diretrizes para escrever código orientado a objetos mais **flexível**, **manutenível** e **escalável**. Criados por *Robert C. Martin (Uncle Bob)*, esses princípios ajudam a evitar código rígido, frágil e difícil de evoluir.

---

## 🧱 S — Single Responsibility Principle (SRP)
**Princípio da Responsabilidade Única**

> *"Uma classe deve ter apenas um motivo para mudar."*

Cada classe deve ser responsável por apenas uma parte da funcionalidade.  
Isso deixa o código mais simples, testável e modular.

### ❌ Exemplo ruim
```java
public class UsuarioService {
    public void salvarUsuario(Usuario u) {
        // lógica de persistência
    }

    public void enviarEmailBoasVindas(Usuario u) {
        // lógica de envio de e-mail
    }
}