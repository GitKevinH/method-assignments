package arraylistpracticeproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int input = scanner.nextInt();
            if (input == 0){
                break;
            }
            else{
                list.add(input);
            }
        }

        System.out.println(add(list));



    }

    public static int add(ArrayList<Integer> list){
        int sum = 0;
        for (Integer num: list){
            sum += num;
        }
        return sum;

    }


}
