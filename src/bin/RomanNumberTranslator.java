package bin;

public class RomanNumberTranslator {

    public int answer_to_translate;
    String[] rumes = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X","L","C"};



    static void Uni_tes(int unit, String dozenss, String[] rumes_auromatik) {                                            //алгоритм для "прибавления единиц к десяткам"

        if (unit != 0) {
            System.out.println(dozenss + rumes_auromatik[unit - 1]);
        } else {System.out.println(dozenss);}
    }



    public void Translator() {                                                                                          //преобразование обратно в римские, решил разбить на от 1 до 10,

        int dozens_int1 = answer_to_translate / 10;                                                                     // от 40 до 49, 50-89, 90-99, 100. Хотя можно было конкретно
        int units = answer_to_translate % 10;                                                                           //таблицу уммножения загнать, но так интереснее, показалось
        String dozens = "";
        if ((answer_to_translate > 10) & (answer_to_translate < 40)) {

            for (int i = 1; i <= dozens_int1; i++) {

                dozens = dozens + rumes[9];

            }

            Uni_tes(units, dozens, rumes);


        }
        else if ((answer_to_translate > 39) & (answer_to_translate < 50)){

            dozens = rumes[9] + rumes[10];
            Uni_tes(units, dozens, rumes);

        }
        else if ((answer_to_translate > 49) & (answer_to_translate < 89)){
            dozens = "L";
            if (dozens_int1-5 > 0){
                for (int i=1; i<=(dozens_int1-5);i++){
                    dozens = dozens + rumes[9];

                }
                Uni_tes(units, dozens, rumes);
            } else Uni_tes(units, dozens, rumes);

        }
        else {
            System.out.println(rumes[9] + rumes[11]);


        }

    }

}
