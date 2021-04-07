package bin;

import java.util.Scanner;


public class numbers_sign {




    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean n = true;
        while (n == true) {
            String linee0 = in.nextLine();
            String linee = linee0.replaceAll("\\s", "");                                                      //удаляем все пробелы, чтобы увеличить скорость (уменьшает количество шагов цикла for)
            String first = "";                                                                                                //а так же сделать всё красиво, для второго числа
            String znak = "";
            String second = "";
            int flag11 = 0;
            int dlina = linee.length();

            for (int i = 0; i <= dlina; i++) {

                char res1 = linee.charAt(i);

                if ((res1 == '+') | (res1 == '-') | (res1 == '/') | (res1 == '*')) {


                    String s = String.valueOf(res1);
                    znak = znak.concat(s);
                    second = linee.substring((i + 1), dlina);                                                                  //обрезаем строку linee от шага знака+1 до конца длины строки


                    break;

                } else {

                    String s = String.valueOf(res1);
                    first = first.concat(s);

                    if ((first.equals("I")) | (first.equals("V")) | (first.equals("X"))) {
                        flag11 += 1;

                    }
                }

            }
            if ((first == "") | (znak == "") | (second == "")) {
                System.out.println("Некорректный ввод данных, только натуральные числа от 1 до 10 или от I до X");
                System.exit(0);
            }


            selection sel = new selection();
            sel.numsel1 = first;
            sel.numsel2 = second;
            sel.flags = flag11;
            sel.znach = znak;
            sel.select_arab_or_rome();
            sel.operation_rome();
            sel.operation_arab();


        }
    }

}

