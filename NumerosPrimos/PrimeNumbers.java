package NumerosPrimos;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    static List<Integer> primes = new ArrayList<>();

    private static List<Integer> calculatePrimes(Integer targetNumber) {
        if (targetNumber <= 1) {
            System.out.println("O valor mínimo é 2.");
            return null;
        }

        for (int num = 2; num <= targetNumber; num++) {
            int divider;

            for (divider = 2; divider < targetNumber; divider++) {
                if (num % divider == 0) {
                    break;
                }
            }

            if (divider > Math.sqrt(num)) {
                primes.add(num);
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        // mude aqui para definir o número da sequência
        Integer number = 10;
        System.out.println(calculatePrimes(number));
    }
}
