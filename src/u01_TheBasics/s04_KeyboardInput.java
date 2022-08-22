package u01_TheBasics;


import java.util.Scanner;

public class s04_KeyboardInput {
    public static void main(String[] args){
        //Create new Scanner to read keyboard input
        Scanner kb = new Scanner(System.in);

        /*
            Retrieve Entire Line (String)
         */
        System.out.println("Enter message: "); //Ask for user input from keyboard
        String message = kb.nextLine();  //Store message in variable
        System.out.println("Retreived message: "+message); //Print out retreived message

        /*
            Retrieve next int.
         */
        System.out.println("Enter int: "); //Ask for user input from keyboard
        int aNum = kb.nextInt();
        System.out.println("Retrieved number: "+aNum*5);

        /*
            Retrieve next double.
         */
        System.out.println("Enter double: "); //Ask for user input from keyboard
        double aNum2 = kb.nextDouble();
        System.out.println("Retrieved number: "+aNum2*5);

        /*
            Retrieve Entire Line (String)

            Dummy kb.nextLine()
            You need to have a dummy kb.nextLine() whenever you are switching from
            pulling in an int/double to pulling in a String (whenever you go from
            kb.nextInt() to kb.nextLine())
         */
        kb.nextLine();

        System.out.println("Enter second string message: "); //Ask for user input from keyboard
        message = kb.nextLine();  //Store message in variable
        System.out.println("Retrieved message: "+message); //Print out retreived message


    }
}
