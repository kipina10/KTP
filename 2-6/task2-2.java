import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        System.out.println(differenceMaxMin(new int[] {10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println(differenceMaxMin(new int[] {44, 32, 86, 19}));
    }
    public static int differenceMaxMin(int[] mass) {
       int max=-10000;
       int min=10000;
       for(int i = 0; i < mass.length; i++){
           if(max<mass[i]){
               max=mass[i];
           }
           if(min>mass[i]){
               min=mass[i];
           }


       }
       return max-min;
    }
}
