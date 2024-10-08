package exemplosFuntinalInterfaces;
import java.util.Arrays;
import java.util.List;

/*
 * Representa uma funçao que aceita um argumento do tipo T e retorna um valor booleano.
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */

public class PredicateExample {
    public static void main(String[] args) {
        
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "go", "ruby");

        //Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream()
            .filter(p -> p.length() < 5)
            .forEach(p -> System.out.println(p));
    }
}
