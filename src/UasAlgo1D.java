import org.w3c.dom.ls.LSOutput;

public class UasAlgo1D {
    public static void main(String []args){
        System.out.println(UasAlgo1D.Reverse("a b cd ef"));
        System.out.println(UasAlgo1D.Reverse("Nama saya joko"));

    }
    private static UasAlgo1D ReverseString;

    public static String Reverse(String atr){
    char ka[]= atr.toCharArray();
    String rev="";
    for(int i=ka.length-1;i>=0;i--){
        rev+=ka[i];
}
    return rev.replaceAll("(/)[aiueo]","*");
}
}