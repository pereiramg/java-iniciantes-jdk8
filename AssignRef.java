/*
    Atribuindo variaveis de referencia de array
*/
public class AssignRef {
    public static void main(String[] args) {
        int i;

        int nums1[] = new int [10];
        int nums2[] = new int [10];

        for (i = 0; i < 10; i++){
            nums1[i] = i;
        }
        for (i = 0; i < 10; i++){
            nums2[i] = -i;
        }

        System.out.print("Aqui é nums1: ");
        for (i = 0; i < 10; i++){
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        System.out.print("Aqui é nums2: ");
        for (i = 0; i < 10; i++){
            System.out.print(nums2[i] + " ");
        }
        System.out.println();

        nums2 = nums1; // Agora nums2 referencia nums1
        // qualquer alteração é refletido nos dois

        System.out.print("Aqui é o nums2 depois de associado: ");
        for (i = 0; i < 10; i++){
            System.out.print(nums2[i] + " ");
        }
        System.out.println();

        // agora alteração de valor do array nums1 ao nums2
        nums2[3] = 99;

        System.out.print("Aqui é o nums1 depois de alterado o valor: ");
        for (i = 0; i < 10; i++){
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

    }
    
}