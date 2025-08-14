# 🏗️ Aula: Construtores em Java

## 📖 O que é um Construtor?
No **Java**, um **construtor** é um **método especial** que é executado automaticamente **quando um objeto é criado**.  
Ele serve para **inicializar atributos** e preparar o objeto para uso.

---

## 🔹 Características dos Construtores
- ✅ **Mesmo nome da classe**  
- ✅ **Não possui tipo de retorno** (nem `void`)  
- ✅ Executado **automaticamente** na criação do objeto (`new`)  
- ✅ Pode ser **sobrecarga** (vários construtores na mesma classe)

---

## 🛠️ Sintaxe básica
```java
public class Pessoa {
    String nome;
    int idade;

    // Construtor padrão (sem parâmetros)
    public Pessoa() {
        System.out.println("Objeto Pessoa criado!");
    }

    // Construtor com parâmetros
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
📦 Criando Objetos
java
Copiar
Editar
public class Main {
    public static void main(String[] args) {
        // Usando construtor padrão
        Pessoa p1 = new Pessoa();

        // Usando construtor com parâmetros
        Pessoa p2 = new Pessoa("Gabriel", 20);

        System.out.println(p2.nome + " - " + p2.idade + " anos");
    }
}
📌 Saída:

nginx
Copiar
Editar
Objeto Pessoa criado!
Gabriel - 20 anos
🔄 Sobrecarga de Construtores
Você pode ter vários construtores na mesma classe, com assinaturas diferentes:

java
Copiar
Editar
public class Produto {
    String nome;
    double preco;

    // Construtor 1
    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0.0; // valor padrão
    }

    // Construtor 2
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
⚡ Boas Práticas
📝 Use nomes de parâmetros iguais aos atributos e o this para diferenciá-los.

🎯 Evite lógica complexa no construtor — apenas inicialize valores.

🧱 Crie construtor padrão se também houver construtores com parâmetros (facilita testes e frameworks).

📌 Exercício Proposto
Crie uma classe Livro com:

Atributos: titulo, autor, paginas

Dois construtores:

Um padrão que define valores "desconhecidos"

Um com todos os atributos como parâmetros

Teste a criação de objetos em uma classe Main.

📚 Mais sobre Construtores
Documentação Oficial Oracle

Guia de Programação Java - DevMedia

💡 Resumo: Construtores são essenciais para garantir que todo objeto Java comece sua vida com valores iniciais definidos e pronto para uso.