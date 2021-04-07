package bin;

public class selection {


    public String numsel1;
    public String numsel2;
    public String znach; //znak
    public int flags;
    public int arabs1;
    public int arabs2;
    public int romes1;
    public int romes2;
    public int rome_answer;
    int flag1 = 0;
    public String[] nums = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};


    public void select_arab_or_rome() {



        for (int i = 0; i <= 9; i++) {
            if (numsel1.equals(nums[i])) {
                romes1 = i + 1;
            }
            //выясняем римские ли наши цифры????
            if (numsel2.equals(nums[i]) & (flags >= 0)) {

                romes2 = i + 1;
                flag1 += 1;

            }
        }
        if (romes1 > 10 | romes2 > 10){System.out.println("Калькулятор не умеет обрабатывать такие числа, только диапазон от 1 до 10 или от I до X"); System.exit(0); }
        if (((flags > 0) & (flag1 == 0)) | ((flags == 0) & (flag1 > 0))) {

            System.out.println("Вынужден сообщить, что этот калькулятор не умеет считать одновременно арабские и римские цифры");
            System.exit(0);
        } else if ((flags == 0) & (flag1 == 0)) {

            arabs1 = Integer.parseInt(numsel1);
            arabs2 = Integer.parseInt(numsel2);

        } else if (arabs1 == 0 | arabs2 == 0){ };

    }

    public void operation_arab() {


        if ( (arabs1 > 0  &  arabs1 < 11)  &  (arabs2>0  &  arabs2 < 11)) {


            switch (znach) {
                case "+":
                    System.out.println(arabs1 + arabs2);
                    break;

                case "-":
                    System.out.println(arabs1 - arabs2);
                    break;

                case "/":
                    System.out.println(arabs1 / arabs2);
                    break;

                case "*":
                    System.out.println(arabs1 * arabs2);
                    break;
            }
        } else if (arabs2 == 0 & arabs1 == 0) {}
        else if (arabs2 > 10 | arabs2 > 0){System.out.println("!!!!!Калькулятор не умеет обрабатывать такие числа, только диапазон от 1 до 10 или от I до X"); System.exit(0);}

    }

    public void operation_rome() {


        if ((romes1 > 0 & romes1 < 11) & (romes2 >0 & romes2 < 11)) {


            switch (znach) {
                case "+":
                    rome_answer = (romes1 + romes2);

                    break;

                case "-":
                    rome_answer = (romes1 - romes2);
                    break;

                case "/":
                    rome_answer = (romes1 / romes2);
                    break;

                case "*":
                    rome_answer = (romes1 * romes2);
                    break;
            }

        } else if (arabs1 == 0 & arabs2 == 0){System.out.println("Калькулятор не умеет обрабатывать такие числа, только диапазон от 1 до 10 или от I до X"); System.exit(0);}

        if ((rome_answer >= 10) & (rome_answer < 100)) {

            RomanNumberTranslator romen = new RomanNumberTranslator();
            romen.answer_to_translate = rome_answer;

            romen.Translator();

        } else if ( rome_answer == 100){System.out.println("C"); }
        else if (arabs1 == 0 & arabs2 == 0) { System.out.println(nums[rome_answer - 1]); }

    }



}


