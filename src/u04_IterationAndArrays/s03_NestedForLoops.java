package u04_IterationAndArrays;

public class s03_NestedForLoops{
    public static void main(String[] args){
        String[] desserts = {"ice cream","cookies","brownies","doughnuts","popsicles"};
        String[] fruits = {"strawberry", "cherry", "grape", "prune", "lemon"};

        for(int i=0; i<desserts.length; i++){

            for(int j=0; j<fruits.length; j++){
                System.out.println(fruits[j]+" "+desserts[i]);
            }

        }











        /*int[] nums = {10,20,30,40,50};
        for(int i=0; i<3; i++){
            for(int j=0; j<nums.length; j++){
                System.out.println(i+", "+nums[j]);
            }
        }

        System.out.println("---------");
        for(int j=0; j<nums.length; j++){
            for(int i=0; i<3; i++){
                System.out.println(i+", "+nums[j]);
            }
        }*/



    }
}
