🛡️ Aula: Modificadores de Acesso em Java

## 📖 O que são Modificadores de Acesso?
Modificadores de acesso definem **quem pode acessar** classes, métodos e atributos em Java.  
Eles permitem controlar a **visibilidade e segurança** dos dados dentro do programa.

Os principais modificadores de acesso são:

- `public`
- `private`
- `protected`
- default (sem modificador)

---

## 🔹 `public`
- Acesso **liberado para todas as classes**, mesmo de outros pacotes.
- Pode ser usado em **classes, métodos e atributos**.

```java
public class Pessoa {
    public String nome;

    public void falar() {
        System.out.println("Olá!");
    }
}
🔹 private
Acesso restrito à própria classe.

Normalmente usado para atributos e métodos internos.

Promove Encapsulation, obrigando o uso de getters e setters.

java
Copiar
Editar
public class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
🔹 protected
Acesso permitido:

Dentro da mesma classe

Classes do mesmo pacote

Subclasses (mesmo em pacotes diferentes)

Útil para herança e reutilização controlada.

java
Copiar
Editar
protected class Animal {
    protected void fazerSom() {
        System.out.println("Som do animal");
    }
}
🔹 Default (Pacote-Privado)
Sem modificador explícito.

Acesso permitido apenas dentro do mesmo pacote.

Também chamado de package-private.

java
Copiar
Editar
class Carro {
    void ligar() {
        System.out.println("Carro ligado");
    }
}
⚡ Resumo do Escopo
Modificador	Mesmo pacote	Subclasse	Outro pacote
public	✅	✅	✅
private	❌	❌	❌
protected	✅	✅	❌
default	✅	❌	❌

📌 Boas Práticas
Use private para atributos e métodos internos.

Use public para métodos que formam a interface da classe.

Use protected quando precisar de herança controlada.

Evite abusar de default, a menos que queira restringir acesso dentro do pacote.

💡 Resumo:
Modificadores de acesso são essenciais para criar código seguro, organizado e fácil de manter.