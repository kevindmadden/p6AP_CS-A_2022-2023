package u04_IterationAndArrays;

public class s02_Arrays {
    public static void main(String[] args){
        /*
            Arrays
         */
        //                       0      1       2        3             4
        String[] sampleArray1 = {"pig", "fish", "arrow", "green eggs", "ribs"};
        System.out.println(sampleArray1[1]);

        String[] sampleArray2 = new String[5];
        sampleArray2[0] = "pig";
        sampleArray2[1] = "fish";
        sampleArray2[2] = "arrow";
        sampleArray2[3] = "green eggs";
        sampleArray2[4] = "ribs";

        //Store in nums, the #s 0 thru 200 but only the evens
        int[] nums = new int[100];
        for(int i=0; i<100; i++){
            nums[i] = i*2;
        }

        //Option A
        for(int i=0; i<100; i++){
            System.out.println(nums[i]);
        }

        //Option B - For each loop - READ ONLY
        for(int num : nums){ //num = nums[0]
            System.out.println(num);
        }







    }
}
