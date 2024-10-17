/*
 * FizzBuzz:

1 Imprime los números del 1 al 100.
2 Para los múltiplos de 3, imprime "Fizz" en lugar del número.
3 Para los múltiplos de 5, imprime "Buzz" en lugar del número.
4 Para los números que son múltiplos de ambos 3 y 5, imprime "FizzBuzz".

Inténtalo y, si necesitas ayuda o una guía, aquí estoy. ¡Manos a la obra! 🛠️
*/

public class FizzBuzz {

    public static void fizzBuzz() {
        for (int i = 0; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.printf("%d = FizzBuzz\n",i);
            }
            else if (i % 3 == 0) {
                System.out.printf("%d = Fizz\n",i);;
            }
            else if (i % 5 == 0) {
                System.out.printf("%d = Buzz\n",i);
            }
        }
    }
    public static void main(String[] args) {
        fizzBuzz();
    }
}
