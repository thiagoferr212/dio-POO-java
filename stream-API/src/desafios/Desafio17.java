package desafios;

import java.util.Arrays;
import java.util.List;

/*
 * Desafio 17 - Filtrar os números primos da lista:
 * Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
 */

public class Desafio17 {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream()
            .filter(n -> n > 1 && numeros.stream().noneMatch(i -> i > 1 && i < n && n % i == 0))
            .forEach(System.out::println);
    }
    
}
