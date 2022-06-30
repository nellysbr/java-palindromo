import java.util.*;

public class Palindromo {

    class Solution {
        public boolean solve(int num) {

            // primeiro checa se o número é positivo ou não.
            //se for negativo, não pode ser um palindromo.
            if (num < 0) {
                return false;
            }
            int reverse = 0;
            int temp = num;

            while (num > 0) {
                reverse = reverse * 10 + (num % 10);
                num /= 10;
            }
            return reverse == temp;
        }
    }
}
