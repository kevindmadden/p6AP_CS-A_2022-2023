package u01_TheBasics;

public class s06_Strings {
    public static void main(String[] args){
        String longerWay = new String("the longer way to make a string that nobody has used in decades");
        String shorter = "the shorter way";

        //Prints length of String
        System.out.println(longerWay.length());

        //Substring
        //the shorte
        //0123456789
        System.out.println(shorter.substring(1,5)); //prints:he s

    }
}
