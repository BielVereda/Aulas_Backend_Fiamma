# 🛡️ Aula: Encapsulation (Encapsulamento) em Java

## 📖 O que é Encapsulation?
**Encapsulation** é um dos pilares da **Programação Orientada a Objetos (POO)** em Java.  
Ele consiste em **proteger os dados de uma classe**, controlando o acesso aos seus atributos e métodos.

- Permite **ocultar detalhes internos** da implementação.
- Garante que os dados só sejam alterados de forma segura.
- Facilita a **manutenção e evolução do código**.

---

## 🔹 Como funciona

1. Declaramos os **atributos da classe como `private`**, tornando-os inacessíveis diretamente de fora da classe.
2. Criamos **métodos públicos (`getters` e `setters`)** para permitir a leitura e alteração dos valores de forma controlada.

---

## 🛠 Estrutura de Encapsulation

### Exemplo de classe `Pessoa`
```java
public class Pessoa {
    // Atributos privados
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para idade
    public int getIdade() {
        return idade;
    }

    // Setter para idade
    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade; // validação simples
        }
    }
}
🔄 Utilizando a classe com Encapsulation
java
Copiar
Editar
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Gabriel", 20);

        // Acesso controlado aos atributos
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        // Alterando valores com validação
        pessoa.setIdade(25);
        pessoa.setNome("Lucas");

        System.out.println("Nome atualizado: " + pessoa.getNome());
        System.out.println("Idade atualizada: " + pessoa.getIdade());
    }
}
⚡ Benefícios do Encapsulation
🔒 Segurança: protege os dados de alterações indevidas.

✅ Validação: permite verificar valores antes de alterar atributos.

🔄 Manutenção: mudanças internas na classe não afetam o código externo.

📦 Organização: separa claramente a interface pública dos detalhes internos.

📌 Resumo
Encapsulation é uma prática essencial em Java que permite criar classes seguras, organizadas e fáceis de manter.
Sempre que possível:

Use atributos private.

Forneça getters e setters para acesso controlado.

Adicione validações dentro dos setters para garantir integridade dos dados.