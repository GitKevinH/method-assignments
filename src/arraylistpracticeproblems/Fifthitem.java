package arraylistpracticeproblems;
import java.util.ArrayList;
import java.util.Scanner;

public class Fifthitem {
    public static void main(String[] args) {

        ArrayList list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()){
                break;
            }
            else{
                list.add(input);
            }
        }

        if (list.size() >= 5) {
            System.out.println("The fifth element in the list is: " + list.get(4));
        }
        else{
            System.out.println("Not enough elements to print the fifth element.");

        }
    }
}
