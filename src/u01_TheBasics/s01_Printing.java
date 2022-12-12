package u01_TheBasics;

public class s01_Printing {
    //The below line needs to be included in every new java class that you create.
    public static void main(String[] args){

        //Two basic print commands
        System.out.println("Hello world");
        System.out.print("testing");
        System.out.print("testing");

        //Experiment?
        //Tried running in a different order

    }
    public boolean twoTwo(int[] nums) {
        for(int i = 1; i<nums.length-1; i++){

            if(nums[i] == 2 && nums[i+1] == 2){
                return true;
            }else if((nums[i+1] <= 2) && (nums[i-1] >= 2)){
                return false;
            }
            //}else((nums[i+1] <= 2) && (nums[i-1] >= 2)){

        }

        return true;
    }

}
