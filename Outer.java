/*
    Usa uma classe interna
*/
public class Outer {
    int nums[];

    Outer(int n[]) {
        nums = n;
    }

    void analyze() {
        Inner inOb = new Inner();
        System.out.println("Minimo: " + inOb.min());
        System.out.println("Maximo: " + inOb.max());
        System.out.println("Media: " + inOb.avg());
    }

    // Esta é uma classe interna
    class Inner {
        int min() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < m) {
                    m = nums[i];
                }
            }
            return m;
        }

        int max() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > m) {
                    m = nums[i];
                }
            }
            return m;
        }

        int avg() {
            int a = 0;
            for (int i = 1; i < nums.length; i++) {
                a += nums[i];
            }
            return a;
        }

    }
}