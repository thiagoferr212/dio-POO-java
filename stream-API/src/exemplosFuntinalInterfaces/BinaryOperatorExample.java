package exemplosFuntinalInterfaces;
import java.util.Arrays;
import java.util.List;
/**
 * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado
 * do mesmo tipo T. 
 * É usada para realizar operações de adição em pares de elementos, como somar números 
 * ou combinar objetos.
 */

public class BinaryOperatorExample {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;
        
        //Usar o BinaryOperator com expressão lambda para somar dois números inteiros
        int resultado = numeros.stream()
             .reduce(0, (n1,n2) -> n1 + n2); // ou  .reduce(0, Integer::sum); tem o mesmo resultado.

        System.out.println(resultado);
    }

}
