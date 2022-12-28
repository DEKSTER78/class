package classwork;

public class Class3 {
    public static void main(String[] args) {
        int[] arrayInt = {1, 2, 3};
        //System.out.println(arrayInt[1]);

        String[] namesOfStudents = {
                "Masha",
                "Aliona",
                "Rostislav",
                "Anton"
        };
        //System.out.println(Arrays.toString(namesOfStudents));

        int[] myArray;

        myArray = new int[3]; // length = 3
        myArray[0] = 100;
        myArray[1] = 200;
        myArray[2] = 300;

        //System.out.println("Element at index 0: " + myArray[0]);

        String myString = "Ivan Ivanovich Ivanov";
        String[] words = myString.split(" "); // [Ivan, Ivanovich, Ivanov]
        //System.out.println(Arrays.toString(words));

        char[] charArray = "Ivan".toCharArray();
        //System.out.println(charArray[0]);

        char c1 = 'A';
        //System.out.println(c1);
        char c2 = 63;
        //System.out.println(c2);

        String[][] names = {
                {"Mr.", "Mrs.", "Ms.", "Miss."},
                {"Ivanov", "Jones", "Sidorov"}
        };
        // Ms.Jones
        System.out.println(names[0][2] + names[1][1]);
        // Hello, Mr. Sidorov!


    }

}
