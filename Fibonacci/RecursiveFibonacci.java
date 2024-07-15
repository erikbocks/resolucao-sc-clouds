package Fibonacci;

public class RecursiveFibonacci {
    static long[] sequence;

    private static long fibonacci(int number) {
        if (number < 0) {
            System.out.println("O número deve ser maior ou igual a zero.");
            return 0;
        }
        if (number < 2) {
            return number;
        }

        if (sequence[number] != 0) {
            return sequence[number];
        }

        long newNumber = fibonacci(number - 1) + fibonacci(number - 2);

        sequence[number] = newNumber;

        return newNumber;
    }

    public static void main(String[] args) {
        // mude aqui para definir o número da sequência
        int number = 6;
        sequence = new long[number + 1];
        System.out.println(fibonacci(number));
    }
}
