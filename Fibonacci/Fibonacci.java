package Fibonacci;

public class Fibonacci {
    static long[] sequence;

    private static long fibonacci(int number) {
        if (number < 0) {
            System.out.println("O número deve ser maior ou igual a zero.");
            return 0;
        }

        if (number < 2) {
            return number;
        }

        sequence = new long[number + 1];
        sequence[0] = 0;
        sequence[1] = 1;

        for (int i = 0; i < (number - 1); i++) {
            sequence[i + 2] = sequence[i] + sequence[i + 1];
        }

        return sequence[number];
    }

    public static void main(String[] args) {
        // mude aqui para definir o número da sequência
        int number = 6;
        System.out.println(fibonacci(number));
    }
}
