package classwork;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        //for
        //System.out.println("1\n2\n3");

        // 1 2 3 4 5

        /*for (int i = 1; i <= 5; i++) {
            //System.out.println(i);
            System.out.print(i + " ");
        }*/
        // инкремент i++
        // декремент i--

        // 5 4 3 2 1

        // 3 * 1 = 3
        // 3 * 2 = 6 ==> 3*2
        // 3 * 3 = 9 ==> 3*3
        // ...
        // 3 * 10 = 30 ==> 3*10

        /*for (int i = 1; i <= 10; i++) {
            System.out.println("3 * " + i + " = " + 3 * i);
        }*/

        // 2 4 6 8 10 12 14 16 18 20
        /*for (int i = 2; i <= 20; i+=2) {
            System.out.print(i);
        }*/

        // факториал
        // 3! = 1*2*3
        // 10! = 1*2*3*4*..*9*10
        // 100! = 1*2*3*4*..*99*100

        // 5! = 1*2*3*4*5
        // resultFactorial * 1 = iter1
        // iter1 * 2 = iter2 = 2
        // iter2 * 3 =iter3  = 2*3 = 6
        // 6 * 4=24
        // .. iter2 * 5 =iter5 = 24 * 5 = 120

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:");
        int userNumber = scanner.nextInt();
        int resultFactorial = 1;

        for (int i = 1; i <= userNumber; i++) {
            resultFactorial *= i;
        }
        System.out.println(userNumber + "! = " + resultFactorial);


    }
}

/*
for ([инициализация счетчика]; [условие]; [изменение счетчика - шаг])
        {
        // действия
        }
*/
