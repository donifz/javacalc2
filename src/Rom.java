import java.util.Scanner;

public class Rom {
    public static void roman(){
        String str = roman(8);
        System.out.println(str);
    }

    Scanner scanner =new Scanner(System.in);
    public static String roman(int input){


        String str = "";
        if(input<1||input>100) {
            return str = "Ошибка";
        }
            while (input>=10){
                str += "X";
                input -= 10;
            }
            while (input>=9){
                str += "IX";
                input -= 9;
            }
            while (input>=5){
                str += "V";
                input -= 5;
            }
            while (input>=4){
                str += "IV";
                input -= 4;
            }
            while (input>=1){
                str += "I";
                input -= 1;
            }
        return str;
        }


}
