public class task9 {
    public static void main(String[] args) {
        System.out.println(sumOfCubes(new int[]{1, 5, 9}));
        System.out.println(sumOfCubes(new int[]{3, 4, 5}));
        System.out.println(sumOfCubes(new int[]{2}));
        System.out.println(sumOfCubes(new int[]{}));
    }

    static int sumOfCubes(int[] a) {
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            k += Math.pow(a[i],3);
        }
        return k;
    }
}
