
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] dizi = {15,12,788,1,-1,-778,2,0};
        
        System.out.println("Dizi : " + Arrays.toString(dizi));
        
        System.out.print("Girilen Sayi : ");
        int girilenSayi = scanner.nextInt();
        int yakinSayiKucuk = 0;
        int yakinSayiBuyuk = 0;
        Arrays.sort(dizi);
        for(int i : dizi){
            if(i < girilenSayi){
                yakinSayiKucuk = i;
            }
            if(girilenSayi < i){
                yakinSayiBuyuk = i;
                break;
            }
        }
        System.out.println("Girilen sayidan kucuk en yakin sayi : " + yakinSayiKucuk);
        System.out.println("Girilen Sayidan buyuk en yakin sayi : " + yakinSayiBuyuk);
    }
}
