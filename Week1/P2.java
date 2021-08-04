package Week1;

import java.util.Arrays;

public class P2 {
    public static void main(String[] args) {
        int[] arr1 = {23, 45, 57, 1, 3, 134, 87, 66};
        Arrays.sort(arr1);
        System.out.println("Smallest: " + arr1[0]);
        System.out.println("Largest: " + arr1[arr1.length - 1]);

        int[] arr2 = {7,5,6,1,4,2};
        Arrays.sort(arr2);
        for(int i = 0; i < arr2.length; i++){
            if(arr2[i] + 1 != arr2[i + 1]){
                System.out.println("Missing number: " + (arr2[i] + 1));
                break;
            }
        }
    }
}
