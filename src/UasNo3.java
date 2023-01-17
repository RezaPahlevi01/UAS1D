import javax.naming.Context;
import java.util.ArrayList;
import java.util.Scanner;

public class UasNo3 {
        public static void main(String[] args) {
            int jum = 1;
            UAS1D myMessage = new UAS1D();
            Scanner sc = new Scanner(System.in);
            System.out.println("Masukkan ID MESSAGE : ");
            myMessage.setMESSAGEID(sc.nextLine());
            System.out.println("Masukkan NAMA Pengirim : ");
            myMessage.setMESSAGENAME(sc.nextLine());
            ArrayList<String> context = new ArrayList<>();
            for (int index = 0; index < jum; index++){
                context.add(sc.nextLine());
            }
            myMessage.setCONTEXT(context);
            System.out.println(context.contains(myMessage));


            System.out.println("kata yang dicari : ");
            String cari = sc.nextLine();
            System.out.println(myMessage.FindWord(context, cari));

        }
    }
