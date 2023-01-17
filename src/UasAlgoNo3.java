import java.util.ArrayList;
import java.util.Scanner;

public class UasAlgoNo3 {
    public static void main(String[] args) {
        int jum = 4;
        UasAlgoNo3 myMassage = new UasAlgoNo3();
        Scanner sc = new Scanner(System.in);
        myMassage.setMessageID(sc.nextLine());
        myMassage.setMessageName(sc.nextLine());
        ArrayList<String> context = new ArrayList<>();
        for (int index = 0; index < jum; index++){
            context.add(sc.nextLine());
        }
        ,myMassage.setContext(context);

    }
}