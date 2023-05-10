package arraylistpracticeproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
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
            System.out.println("The last element in the list is: " + list.get((list.size()-1)));


        }
    }
