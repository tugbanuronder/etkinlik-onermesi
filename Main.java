import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int sıc;

        System.out.print("Sicaklik degeri giriniz:");
        sıc=input.nextInt();

        if(sıc<5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if(5<=sıc && sıc<=10){
            System.out.println("Sinemaya gidebilirsiniz.");
        }else if(sıc>10 && sıc<=15){
            System.out.println("Sinemaya ya da piknige gidebilirsiniz.");
        }else if (sıc>15 && sıc<=25){
            System.out.println("Piknige gidebilirsiniz.");
        }else {
            System.out.println("Yuzmeye gidebilirsin.");
        }
    }

}
