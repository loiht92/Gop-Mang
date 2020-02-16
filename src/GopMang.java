import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array1 = new int[5];
        int[] array2 = new int[5];


        for (int i = 0 ; i < 5; i++){
            System.out.println("Nhap array1 [" + i +"]: ");
            array1[i] = scanner.nextInt();
        }
        for (int i = 0 ; i < 5; i++){
            System.out.println("Nhap array2 [ " + i + "]: ");
            array2[i] = scanner.nextInt();
        }
        int [] array3 = new int [10];//
        for (int i = 0; i < 5 ; i++){
            array3[i] = array1[i]; // neu ma mang moi chay tu 0-5 thi lay gia tri cua mang 1 cho vao mang moi//

        }
        for (int i = 5 ; i < 10 ; i++){
            array3[i] = array2[i - 5]; //mang moi chay tu 5-10 thi ghep not gia tri cua mang 2 vao mang moi, nhung phai tru di 5: do la nhung phan tu dau tien mang moi de no ghep vao sau mang 1//
        }
        for (int x : array3){
            System.out.print(x + "\t ");
        }
//        int size1 = array1.length;
//        int size2 = array2.length;
//        int [] result = new int[size1 + size2];
//        System.arraycopy(array1,0, result , 0, size1); // coppy mang 1 vao mang moi//
//        System.arraycopy(array2, 0 , result, size1, size2); // coppy mang 2 vao mang 1, dung sau mang 1//
//        System.out.println(Arrays.toString(result)); // tra ve chuoi moi//
    }

}
