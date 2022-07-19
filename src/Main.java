public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        task1();
        task2();
        task3();
        task4();
        task5();
    }

    //    ### Задание 1
//
//    Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
//
//    На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
//
//    Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
//
//    Не забудьте выполнить переход на новую строку между двумя циклами.
//
//    В результате программы вывод должен получиться следующий:
//
//            1 2 3 4 5 6 7 8 9 10
//            10 9 8 7 6 5 4 3 2 1
    public static void task1(){
        int i=0;
        while(i<10) {
            i++;
            if(i<10) {
                System.out.print(i + " ");
            }else{
                System.out.print(i+"\n");
            }
        }
        for(; i>=1; i--) {
            if(i>1) {
                System.out.print(i + " ");
            }else{
                System.out.print(i+"\n");
            }
        }
    }

//    ### Задание 2
//
//    В вашей компании пятница является днем отчетным.
//    Нам нужно написать программу, которая считает дни месяца по датам, определяет, какой день пятница,
//    и выводит сообщение с напоминанием о том, что нужно подготовить еженедельный отчет.
//
//    Условия задачи:
//    Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
//    Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
//            "Сегодня пятница, ...-е число. Необходимо подготовить отчет."
//
//    В нашем месяце 31 день. В результате у вас должно вывестись от 4 до 5 сообщений с напоминаниями по разным датам.

    public static void task2(){
        int fridayDate = 1;
        int daysInMonth=31;

        for(int i=0; i<daysInMonth; i++){

            if((fridayDate+7)==i) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
                fridayDate+=7;
            }

        }
    }

//    ### Задание 3
//
//    Мы решили написать астрономическое приложение, которое считает, когда над Землей пролетают кометы
//    и их можно будет увидеть. Для начала нам нужно посчитать траекторию движения кометы,
//    которая пролетает рядом с Землей каждый 79-й год, начиная с нулевого.
//
//    Нам нужно узнать, в каких годах комета пролетала рядом с Землей за последние 200 лет и когда мы увидим
//    ее в следующий раз.
//
//    Условия задачи:
//    В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления.
//    Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет до текущего
//    (из созданной ранее переменной) в качестве старта и 100 лет после в качестве завершения периода расчета.
//
//    В результате решения задачи в консоль должен вывестись следующий результат:
//            1896
//            1975
//            2054

    public static void task3(){

        int currentYear=2022;

        for(int i=(currentYear-200); i<(currentYear+100);i++){

            if(i%79==0){
                System.out.println(i);
            }
        }
    }
//    Задание 4
//    Это задание очень любят давать на собеседованиях в разных вариациях, потому мы предлагаем его вам,
//    чтобы вы оценили свои силы.
//    Необходимо пройти циклом по числам от 1 до 30 включительно и, если число делится на 3 без остатка,
//    вывести ping, а если число делится на 5 без остатка, вывести pong.
//    Если число делится без остатка и на 3, и на 5, необходимо вывести ping pong.
//    Допускается наличие пустых строк в выводе.
//    Вывод должен быть следующий:
//            1:
//            2:
//            3: ping
//            4:
//            5: pong
//            6: ping
//            7:
//            8:
//            9: ping
//            10: pong
//            11:
//            12: ping
//            13:
//            14:
//            15: ping pong
//            16:
//            17:
//            18: ping
//            19:
//            20: pong
//    Критерии оценки
//– В консоль выводится значение из условия задачи
//– Цикл проходит по значениям и выполняет условие задачи деления цифр на 3 и 5
//            – Код написан корректно и без ошибок.

    public static void task4(){
        for(int i=1; i<=30; i++){

//            if(i%5==0&&i%3==0){
//                System.out.println(i+" ping  pong");
//            }else if(i%5==0){
//                System.out.println(i+" ping");
//            }
//            else if(i%3==0){
//                System.out.println(i+" pong");
//            }else{
//                System.out.println(i);
//            }
            System.out.print("\n"+i+": ");
            if(i%3==0){
                System.out.print("ping ");
            }
            if(i%5==0){
                System.out.print("pong");
            }

        }
    }

//    Задание 5
//    Вывести первые 10 чисел последовательности Фибоначчи. Последовательность строится по следующему правилу:
//            – Каждое следующее число равняется сумме двух предыдущих.
//            Дано: две целочисленные переменные, первая равна 0, вторая равна 1.
//    Эти два числа — первые числа последовательности. Следующие восемь нужно вычислить и вывести.
//    Должно получиться следующее:
//            0 1 1 2 3 5 8 13 21 34
//    Справка
//    Числа Фибоначчи – элементы числовой последовательности
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, … ,
// в которой первые два числа равны 0 и 1, а каждое последующее число равно сумме двух предыдущих чисел.
// Названы в честь средневекового математика Леонардо Пизанского.
//            Критерии оценки
//– Код написан корректно и выполняет условия задачи при изменении значений переменной;
//– В коде не допущено ошибок или неверного использования конструкций; – Все условия задачи выполняются.

    public static void task5(){
        int num=0;
        int nextNum=1;

        System.out.print("\n"+num+" "+nextNum+" ");
        for(int i=0; i<8;i++){

            System.out.print(nextNum+num+" ");
            nextNum=nextNum+num;
            num=nextNum-num;

        }
    }
}