package exemplosFuntinalInterfaces;
import java.util.Arrays;
import java.util.List;
//import java.util.function.Function;

/*
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizado para transformar ou mapear os elementos do Stream em outros valores ou tipos.
 */

public class FunctionExample {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Function<Integer, Integer> dobrar = numero -> numero * 2;

        // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
            .map(n -> n * 2)
            .toList();

        numerosDobrados.forEach(n -> System.out.println(n)); // ou numerosDobrados.forEach(System.out::println) tem a mesma função.
        
    }

}
