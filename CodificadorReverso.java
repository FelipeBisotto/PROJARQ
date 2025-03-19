import java.time.LocalDate;

public class CodificadorReverso implements Codificador {
    public String getNome() { return "Codificador Reverso"; }
    public LocalDate getDataCriacao() { return LocalDate.of(2025, 3, 13); }
    public int getNivelSeguranca() { return 10; }

    public String codifica(String str) { return new StringBuilder(str).reverse().toString(); }
    public String decodifica(String str) { return new StringBuilder(str).reverse().toString(); }
}
