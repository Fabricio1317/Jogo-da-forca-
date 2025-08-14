package jogoDaForca;

import java.util.*;

class PalavraSecreta {
    private String palavra;
    private Set<Character> letrasCorretas;
    private Set<Character> letrasErradas;

    public PalavraSecreta(String palavra) {
        this.palavra = palavra.toUpperCase();
        this.letrasCorretas = new HashSet<>();
        this.letrasErradas = new HashSet<>();
    }

    public boolean tentarLetra(char letra) {
        letra = Character.toUpperCase(letra);
        if (palavra.indexOf(letra) >= 0) {
            letrasCorretas.add(letra);
            return true;
        } else {
            letrasErradas.add(letra);
            return false;
        }
    }

    public boolean palavraCompleta() {
        for (char c : palavra.toCharArray()) {
            if (!letrasCorretas.contains(c)) {
                return false;
            }
        }
        return true;
    }

    public String exibirProgresso() {
        StringBuilder progresso = new StringBuilder();
        for (char c : palavra.toCharArray()) {
            if (letrasCorretas.contains(c)) {
                progresso.append(c).append(" ");
            } else {
                progresso.append("_ ");
            }
        }
        return progresso.toString().trim();
    }

    public Set<Character> getLetrasErradas() {
        return letrasErradas;
    }

    public String getPalavra() {
        return palavra;
    }
}

class JogoForca {
    private PalavraSecreta palavraSecreta;
    private int tentativasMaximas;

    public JogoForca(String palavra, int tentativasMaximas) {
        this.palavraSecreta = new PalavraSecreta(palavra);
        this.tentativasMaximas = tentativasMaximas;
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Jogo da Forca ===");
        while (palavraSecreta.getLetrasErradas().size() < tentativasMaximas && !palavraSecreta.palavraCompleta()) {
            System.out.println("\nPalavra: " + palavraSecreta.exibirProgresso());
            System.out.println("Letras erradas: " + palavraSecreta.getLetrasErradas());
            System.out.print("Digite uma letra: ");
            char letra = scanner.next().charAt(0);

            if (!palavraSecreta.tentarLetra(letra)) {
                System.out.println("Letra incorreta!");
            } else {
                System.out.println("Boa! Letra correta!");
            }
        }
        if (palavraSecreta.palavraCompleta()) {
            System.out.println("\nParabéns! Você adivinhou a palavra: " + palavraSecreta.getPalavra());
        } else {
            System.out.println("\nVocê perdeu! A palavra era: " + palavraSecreta.getPalavra());
        }
        scanner.close();
    }
}

public class Main {
    public static void main(String[] args) {
        JogoForca jogo = new JogoForca("PROGRAMACAO", 6);
        jogo.iniciar();
    }
}
