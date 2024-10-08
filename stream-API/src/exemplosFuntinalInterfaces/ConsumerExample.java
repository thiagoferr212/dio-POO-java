package exemplosFuntinalInterfaces;
import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;

/**
* A Interface Funcional "Costumer" pode representar uma operação que aceita 
* um argumento do tipo T (tipo generico) e não retornar nenhum resultado. 
* É utilizada principalmente para realizar ações, ou efeitos colaterais 
* nos elementos do Stream sem modificar, ou retornar um valor.
*/

public class ConsumerExample {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // Consumer<Integer> imprimirNumeroPar = numero -> {
        //     if(numero % 2 == 0){
        //         System.out.println(numero);
        //     }
        // };

        // Utilizando o Costumer com expressão Lambda sem precisar estanciá-lo
        numeros.stream().filter(n -> n % 2 == 0)
            .forEach(n -> System.out.println(n)); // ou .forEach(System.out::println); tem a mesma função
    }
}
