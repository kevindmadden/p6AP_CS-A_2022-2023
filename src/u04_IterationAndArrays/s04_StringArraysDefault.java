package u04_IterationAndArrays;

public class s04_StringArraysDefault {
    public static void main(String[] args){

        String arr[] = new String[10];

        for(int i=0; i<arr.length; i++){
            if(arr[i] == null){ //You have to use == to check for null
                System.out.println("null here!");
            }
            System.out.println(arr[i]);
        }


    }
}
