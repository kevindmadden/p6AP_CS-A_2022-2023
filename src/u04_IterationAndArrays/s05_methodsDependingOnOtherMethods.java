package u04_IterationAndArrays;

public class s05_methodsDependingOnOtherMethods {
    public static void main(String[] args){

    }

    //Replace all a's with e's
    public static String replaceAlle(String phrase){
        String temp = "";
        for(int i=0; i<phrase.length(); i++){
            if(phrase.substring(i,i+1).equals("e")){
                temp+= "a";
            }else{
                temp+=phrase.substring(i, i+1);
            }
        }
        return temp;
    }

    //If after replacing all a's with e's, return true if the word "bed" is anywhere in the string.
    public static boolean isBed(String phrase){
        String temp = replaceAlle(phrase);
        for(int i=0; i<temp.length()-2; i++){
            if(phrase.substring(i,i+3).equals("bed")) return true;
        }
        return false;
    }


}
