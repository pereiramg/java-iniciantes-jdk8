/*
    Encontra o valor minimo e máximo de um array
*/
public class MinMax {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int min, max;

        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;

        min = max = nums[0];

        for (int i=1; i < 10; i++){
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        System.out.println("min and max: " + min + " " + max);


         // outro metodo de preencher os valores
         int nums2[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
         for (int i=1; i < 10; i++){
            if (nums2[i] < min) min = nums2[i];
            if (nums2[i] > max) max = nums2[i];
        }
        System.out.println("min and max: " + min + " " + max);
    }
    
}