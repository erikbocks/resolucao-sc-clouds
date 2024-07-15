package NumerosPrimos;

import java.util.ArrayList;
import java.util.List;

public class RecursivePrimeNumbers {
    static List<Integer> primes = new ArrayList<>();

    static List<Integer> calculatePrimes(int targetNumber) {
        if (targetNumber <= 1) {
            System.out.println("O valor mínimo é 2.");
            return null;
        }

        for (int i = 2; i <= targetNumber; i ++) {
            findPrime(i, 2);
        }

        return primes;
    }

    private static void findPrime(int num, int divider) {
        if (num / 2 < divider) {
            primes.add(num);
        } else {
            if (num % divider != 0) {
                findPrime(num, divider + 1);
            }
        }
    }

    public static void main(String[] args) {
        // mude aqui para definir o número da sequência
        int number = 10;
        System.out.println(calculatePrimes(number));
    }
}
