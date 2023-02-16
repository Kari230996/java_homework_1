/*
 * 
 */


public class task_2 {
    public static void main(String[] args) {
        int m = 0;
        int num = 0;
        String primeNumbers = "";
        for (m = 1; m < 1001; m++) {
            int counter = 0;
            for (num = m; num >= 1; num--) {
                if (m % num == 0) {
                    counter++;

                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + m + " ";
            }
        }
        System.out.println("Простые числа от 1 до 1000:  \n");
        System.out.println(primeNumbers);

          
    }
}
