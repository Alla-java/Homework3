public class Main {
    public static void main(String[] args) {

/* Задание 1. Объявите переменные типа int, byte, short, long, float, double. */
               int dog = 5;
               System.out.println("Значение переменной" + " " + "dog" + " " + "с типом" + " " + "int" + " " + "равно" + " " + dog);

               byte cat = 8;
               System.out.println("Значение переменной" + " " + "cat" + " " + "с типом" + " " + "byte" + " " + "равно" + " " + cat);

               short hamster = 25;
               System.out.println("Значение переменной" + " " + "hamster" + " " + "с типом" + " " + "short" + " " + "равно" + " " + hamster);

               long goat = 25000;
               System.out.println("Значение переменной" + " " + "goat" + " " + "с типом" + " " + "long" + " " + "равно" + " " + goat);

               float pig = 2.5f;
               System.out.println("Значение переменной" + " " + "pig" + " " + "с типом" + " " + "float" + " " + "равно" + " " + pig);

               double cow = 3.89767890976544;
               System.out.println("Значение переменной" + " " + "cow" + " " + "с типом" + " " + "double" + " " + "равно" + " " + cow);


               /* Задание 2. Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных. */
               float ball = 27.12f;
               long power = 987678965549L;
               double jack = 2.786;
               short cycle = 569;
               short wood = -159;
               int lemongrass = 27897;
               byte flower = 67;

               /* Задание 3. Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.
Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги» */
               byte studentsLudmilaPav = 23;
               byte studentsAnnaSer = 27;
               byte studentsEkaterinaAnd = 30;
               int totalStudents = studentsLudmilaPav + studentsAnnaSer + studentsEkaterinaAnd;
               short totalSumSheets = 480;
               int sheetsStudent = totalSumSheets / totalStudents;
               System.out.println("На каждого ученика рассчитано" + " " + sheetsStudent + " " + "листов бумаги");

           /* Задание 4. Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет:
              за 20 минут,
              в сутки,
              за 3 дня,
              за 1 месяц?
              Рассчитывайте производительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.
              Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок». */
              int machinePerformance1Min = 8;

              int min20= 20;
              int machinePerformance20Min = machinePerformance1Min * min20;
              System.out.println("За" + " " + min20 + " " + "минут" + " " + "машина произвела" + " " + machinePerformance20Min + " " + "штук бутылок");

              int day1 = 1440;
              int machinePerformance1Day = machinePerformance1Min * day1;
              System.out.println("За" + " " + day1 + " " + "минут" + " " + "машина произвела" + " " + machinePerformance1Day + " " + "штук бутылок");

              int days3 = day1 * 3;
              int machinePerformance3Days = machinePerformance1Min * days3;
              System.out.println("За" + " " + days3 + " " + "минут" + " " + "машина произвела" + " " + machinePerformance3Days + " " + "штук бутылок");

              int days30 = day1 * 30;
              int machinePerformance1Month = machinePerformance1Min * days30;
              System.out.println("За" + " " + days30 + " " + "минут" + " " + "машина произвела" + " " + machinePerformance1Month + " " + "штук бутылок");

              /* Задание 5. На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски». */
              int totalPaint = 120;
              int class1white = 2;
              int class1brown = 4;

              int class1 = class1white + class1brown;
              int totalClass = totalPaint / class1;
              int totalPaintWhite = totalClass * class1white;
              int totalPaintBrown = totalClass * class1brown;
              System.out.println("В школе, где" + " " + totalClass + " " + "классов, нужно" + " " + totalPaintWhite + " " + "банок белой краски и" + " " + totalPaintBrown + " " + "банок коричневой краски");

              /* Задание 6. Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
Вот один из рецептов, по которому спортсмен готовит себе завтрак:
 Бананы — 5 штук (1 банан — 80 грамм).
 Молоко — 200 мл (100 мл = 105 грамм).
 Мороженое-пломбир — 2 брикета по 100 грамм.
 Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
Смешать всё в блендере — и готово.
Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы. */

       int weightBananas = 400;
       int weightMilk = 210;
       int weightIceCream = 200;
       int weightEgg = 280;

       int totalWeightGrams = weightBananas + weightMilk + weightIceCream + weightEgg;
       System.out.println("Количество граммов спортзавтрака" + " " + totalWeightGrams);

       int grPerKg = 1000;
       float totalWeightKilograms = (float) totalWeightGrams / grPerKg;
       System.out.println("Количество килограммов спортзавтрака" + " " + totalWeightKilograms);

    /* Задание 7. Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно сбросить 7 кг. Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм, а сколько — если каждый день будет худеть на 500 грамм.
Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения. */

     int needLoseWeight = 7;



     float weighLossDays1 = ((float) needLoseWeight / 250) * grPerKg;
     System.out.println("Количество дней похудения, если спортсмен будет терять каждый день по 250 грамм" + " " + weighLossDays1);


     float weighLossDays2 = ((float) needLoseWeight / 500) * grPerKg;
     System.out.println("Количество дней похудения, если спортсмен будет терять каждый день по 500 грамм" + " " + weighLossDays2);

     float averageWeighLossDays = (weighLossDays1 + weighLossDays2) / 2;
     System.out.println("Среднее количество дней для похудения" + " " + averageWeighLossDays);

     /* Задание 8. */

        int MashaActualMonthlySalary = 67760;
        int DenisActualMonthlySalary = 83690;
        int KristinaActualMonthlySalary = 76230;

        int MashaActualSalaryPerYear = MashaActualMonthlySalary * 12;
        int DenisActualSalaryPerYear = DenisActualMonthlySalary * 12;
        int KristinaActualSalaryPerYear = KristinaActualMonthlySalary * 12;



        int MashaIncreasedMonthlySalary = ((MashaActualMonthlySalary * 10) / 100) + MashaActualMonthlySalary;
        int DenisIncreasedMonthlySalary = ((DenisActualMonthlySalary * 10) / 100) + DenisActualMonthlySalary;
        int KristinaIncreasedMonthlySalary = ((KristinaActualMonthlySalary * 10) / 100) + KristinaActualMonthlySalary;

        int MashaIncreasedSalaryPerYear = MashaIncreasedMonthlySalary * 12;
        int DenisIncreasedSalaryPerYear = DenisIncreasedMonthlySalary * 12;
        int KristinaIncreasedSalaryPerYear = KristinaIncreasedMonthlySalary * 12;

        int MashaSalaryDiffPerYear = MashaIncreasedSalaryPerYear - MashaActualSalaryPerYear;
        int DenisSalaryDiffPerYear = DenisIncreasedSalaryPerYear - DenisActualSalaryPerYear;
        int KristinaSalaryDiffPerYear = KristinaIncreasedSalaryPerYear - KristinaActualSalaryPerYear;

        System.out.println("Маша теперь получает" + " " + MashaIncreasedMonthlySalary + " " + "рублей. Годовой доход вырос на" + " " + MashaSalaryDiffPerYear + " " + "рублей");
        System.out.println("Денис теперь получает" + " " + DenisIncreasedMonthlySalary + " " + "рублей. Годовой доход вырос на" + " " + DenisSalaryDiffPerYear + " " + "рублей");
        System.out.println("Кристина теперь получает" + " " + KristinaIncreasedMonthlySalary + " " + "рублей. Годовой доход вырос на" + " " + KristinaSalaryDiffPerYear + " " + "рублей");
    }
}