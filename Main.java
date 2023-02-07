import java.util.Scanner;
public class Main {
    public static String example;
    public static String sign;
    public static int [] intPart = new int[2];
    //public static int intPart2;
    public static String [] StrPart = new String[2];
   // public static String StrPart2;


    public static void main(String[] args) {

        calc ();

    }
    public static String calc (){
        int i = 0;
        Scanner scanner = new Scanner(System.in);       //Ввод строки. Если не ввели, то ошибка
        System.out.println("Введите пример:");
        example = scanner.nextLine();
        if (example.isEmpty() == true){
            System.out.println ("Вы не ввели строку");
        }

        String [] sings = {"+", "-", "*", "/"};         // ищем действие.
        for (String element: sings) {
            if (example.contains(element) == true) {
                sign = element;
                i++;
            }
        }
        if (i == 0){
            System.out.println("Неправильная операция"); // Если не ввели знак - ошибка
        }
        i = 0;
        String [] strings = example.split("[+|\\-|*|/]");
        for (String element: strings){                                //Тут разделяем строку по знаку и заодно отсекаем ситуации, когда знаков больше одного
            element = element.trim();                                 //После разделение убираем пробелы, что бы не мешали
            element =  element.replaceAll("//s","");
            i++;
            if (i>2) {
                 System.out.println("Много действий");
                break;
            }

        }

        for (i=0; i<2; i++){
            try {
                intPart [i] = Integer.parseInt(strings[i]);
                System.out.println(intPart[i]);
                if (intPart[i] > 10 | intPart[i] < 1) {
                    System.out.println("Недопустимый диапазон");
                    break;
                }
            } catch (NumberFormatException nfe) {
                StrPart[i] = strings[i];
                rome ();
            }
        }

        return null;
    }

    public static String rome (){
        String [] romeNumbers = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        for (String element: romeNumbers){
            if ()
        }
        return null;
    }
}


