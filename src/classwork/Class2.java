package classwork;

public class Class2 {
    public static void main(String[] args) {
/*
        // 7 14 21 28 35 42 49 56 63 70 77 84 91 98
        int number = 7;
        while (number <= 98) {
            System.out.print(number + " ");
            number += 7;
        }
        System.out.println();
        // 1 2 4 8 16 32 64 128 256 512
        int number2 = 1;
        while (number2 <= 512) {
            System.out.print(number2 + " ");
            number2 *= 2;
        }
*/

        /*// 1 1 2 3 5 8 13 21 34 55 89..
        int firstNum = 1;
        int secondNum = 1;
        int currentNum;
        System.out.print(firstNum + " " + secondNum + " ");
        for (int i = 3; i <= 11; i++) {
            currentNum = firstNum + secondNum;
            System.out.print(currentNum + " ");
            firstNum = secondNum;
            secondNum = currentNum;
        }*/

        /*// 1 1 2 3 5 8 13 21 34 55 89..
        int firstNum = 1;
        int secondNum = 1;
        int currentNum = 0;
        System.out.print(firstNum + " " + secondNum + " ");
        while (currentNum != 89) {
            currentNum = firstNum + secondNum;
            System.out.print(currentNum + " ");
            firstNum = secondNum;
            secondNum = currentNum;
        }*/

        /*
         * * * * *
         * * * * *
         * * * * *
         */
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }

/*
while (условие){
    //действия
}
 */
}
