import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int[] array={3,6,9,2,5,12,20,1,45};

        System.out.print("Sayiyi giriniz : ");
        int value=input.nextInt();
        near(array,value);


    }
    static void near(int[] list,int value){
        int k=1;
        Arrays.sort(list);

        for (int i=0;i<list.length-1;i++){
            if ((list[i] < value) && (value < list[k])){
                System.out.print("Dizi : ");
                System.out.println(Arrays.toString(list));
                System.out.println("Girilen Sayı : "+value);
                System.out.println("Girilen sayıdan küçük en yakın sayı : "+list[i]+"\nGirilen sayıdan büyük en yakın sayı : "+list[k]);
            }
            k++;
        }
    }
}