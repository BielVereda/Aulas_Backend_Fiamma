import java.util.ArrayList;
import java.util.List;

public class Cache {
    private List<Pessoa> cache;
    private int tamanhoMax;

    public Cache(int tamanhoMax) {
        this.cache = new ArrayList<>();
        this.tamanhoMax = tamanhoMax;
    }

    public void adicionar(Pessoa p) {
        if (cache.size() >= tamanhoMax) {
            Pessoa removida = cache.remove(0);
            System.out.println("Cache cheio! Pessoa removida: " + removida);
        }
        cache.add(p);
        System.out.println("Pessoa adicionada ao cache: " + p);
    }

    public Pessoa buscar(int id) {
        for (Pessoa p : cache) {
            if (p.getId() == id) return p;
        }
        return null;
    }
}
