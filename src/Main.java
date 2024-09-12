//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Counting from 1 until 20
        for (int i = 1; i <= 20; i++) {
            String result = "";

            //if divisible by 3 the result will be A
            if (i % 3 == 0) result += "A";
            //if divisible by 5 the result will be B
            if (i % 5 == 0) result += "B";

            //If the number is divisible by both (3 and 5)
            //the value of var result will be AB
            //If it is not divisible by 3 or 5 the var will be empty.

            if(!result.isEmpty())
                //print the value based in the result of ternary if.
                //if AB, so C, if different of C will be A or B
                System.out.println(result.equals("AB") ? "C" : result);
        }
    }
}