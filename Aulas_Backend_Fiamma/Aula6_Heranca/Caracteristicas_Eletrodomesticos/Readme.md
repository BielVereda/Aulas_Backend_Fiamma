# 🌳 Aula: Herança em Java

## 📖 O que é Herança?
Herança é um dos pilares da **Programação Orientada a Objetos (POO)**.  
Ela permite que uma classe **herde atributos e métodos de outra classe**, promovendo **reutilização de código** e hierarquias de relacionamento.

- A classe que **herda** é chamada de **subclasse** (ou classe filha).  
- A classe que **fornece** os atributos e métodos é chamada de **superclasse** (ou classe pai).

---

## 🔹 Benefícios da Herança
- ♻️ **Reuso de código:** não é preciso reescrever métodos já existentes.  
- 🔄 **Extensibilidade:** subclasses podem adicionar novos métodos ou atributos.  
- 🔒 **Organização:** cria hierarquias claras entre classes relacionadas.

---

## 🛠 Estrutura Básica

### Superclasse `Animal`
```java
public class Animal {
    public String nome;

    public void comer() {
        System.out.println(nome + " está comendo.");
    }
}
Subclasse Cachorro
java
Copiar
Editar
public class Cachorro extends Animal {
    public void latir() {
        System.out.println(nome + " está latindo.");
    }
}
🔄 Utilizando Herança
java
Copiar
Editar
public class Main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.nome = "Rex";

        dog.comer(); // método herdado da superclasse
        dog.latir(); // método da própria subclasse
    }
}
⚡ Conceitos Importantes
extends: palavra-chave usada para indicar herança.

Subclasse: herda atributos e métodos da superclasse.

Sobrescrita de métodos (Override): a subclasse pode redefinir métodos da superclasse para alterar seu comportamento.

super: referência à superclasse, usada para chamar métodos ou construtores da classe pai.

📌 Boas Práticas
Use herança quando houver uma relação “é-um” entre classes (ex.: Cachorro é um Animal).

Evite herança excessiva; prefira composição quando a relação for “tem-um”.

Sempre que possível, encapsule atributos (private) e forneça métodos public para acesso.

💡 Resumo:
Herança permite reutilização de código e organização hierárquica, tornando projetos Java mais limpos, flexíveis e fáceis de manter.