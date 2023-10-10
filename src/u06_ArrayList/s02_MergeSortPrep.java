package u06_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class s02_MergeSortPrep {
    public static void main(String[] args){
        ArrayList<Integer> arr1 = generateRandomArrayList();
        ArrayList<Integer> arr2 = generateRandomArrayList();
        bubbleSort(arr1);
        bubbleSort(arr2);
        System.out.println(arr1);
        System.out.println(arr2);

        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        int totalSize = arr1.size()+arr2.size();
        int a1 = 0;
        int a2 = 0;

        while(arr3.size() < totalSize){
            if(a1==arr1.size()){ //if finished with arr1
                arr3.add(arr2.get(a2));
                a2++;
            }else if(a2==arr2.size()){ //if finished with arr2
                arr3.add(arr1.get(a1));
                a1++;
            }else{
                if(arr1.get(a1)<arr2.get(a2)){
                    arr3.add(arr1.get(a1));
                    a1++;
                }else{
                    arr3.add(arr2.get(a2));
                    a2++;
                }
            }
        }
        System.out.println(arr3);

    }

    public static ArrayList<Integer> generateRandomArrayList(){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<10; i++){
            arr.add((int)(Math.random()*20));
        }
        return arr;
    }

    public static void bubbleSort(ArrayList<Integer> arr){
        Collections.sort(arr);
    }

}
