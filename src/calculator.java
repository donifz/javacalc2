import java.util.Scanner;

public class calculator {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        String str =scanner.next();

        String temp = "";
        double [] num = new double[2];
        int numIndex=0;
        char op = ' ';

        try {


        for(int i =0; i<str.length(); i++){
            char c = str.charAt(i);

            if(Character.isDigit(c)){
                temp+=c;
            }else {
                op=c;
                num[numIndex]=Double.valueOf(temp);
                numIndex++;
                temp="";

            }
            
        }

       num[numIndex] = Double.valueOf(temp);


       switch (op){
            case '+': System.out.println(num[0] + num[1]); break;
            case '-': System.out.println(num[0] - num[1]); break;
           case '*': System.out.println(num[0] * num[1]); break;
           case '/': System.out.println(num[0] / num[1]); break;
           default:System.out.println("ввели неправильную операцию");
       }
       } catch (NumberFormatException e) {
            System.out.println("Ошибка");

       }
        System.out.println();


    }


}
