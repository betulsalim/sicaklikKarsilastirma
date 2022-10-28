import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        int sicaklik;

        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık değerini giriniz: ");
        sicaklik = input.nextInt();
        if(sicaklik < 5){
            System.out.println("Bu sıcaklıkta kayak yapabilirsiniz.");
        }
        else if(5 <= sicaklik && sicaklik <= 15){

                System.out.println("Bu sıcaklıkta Sinemaya gidebilirsiniz");

        }
        else if( 15 < sicaklik && sicaklik <= 25){
            System.out.println("Bu sıcaklıkta Piknik yapabilirsiniz.");
        }
        else if(25 < sicaklik){
            System.out.println("Bu sıcaklıkta Yüzmeye gidebilirsiniz.");
        }

    }

}
