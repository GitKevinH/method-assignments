package practicingmethods;

public class MethodReturnTypes {
    public static void main(String[] args) {
        System.out.println(returnBoolean());
        System.out.println(returnInt());
        System.out.println(returnString());

    }

    public static int returnInt(){
        int num = 2;
        return num;

    }

    public static String returnString(){
        String str = "Returned String";
        return str;

    }
    public static boolean returnBoolean(){
        boolean facts = true;
        return facts;
    }
}
