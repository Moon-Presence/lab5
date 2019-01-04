public class Main {

    public static void main(String[] args) {
        System.out.println("Лабораторная работа №5\n"+
                "Выполнил: ст. гр. ПЭ-171\n"+
                "Осокин Р.М.\n"+
                "Задание: создание приложения последовательно\n"+
                "запускащее 2 потока которые логируют свою работу\n"+
                "после синхронно запускащее 2 потока которые"+
                " логируют свою работу\n");

        System.out.println("a)Поочерёдный запуск потоков");
        MyThread a= new MyThread() ;
        MyThread b= new MyThread() ;
        a.name="First";
        b.name="Second";
        a.myrun();
        System.out.println();
        b.myrun();

        System.out.println("\n\nb)Синхронный запуск потоков с поочерёдной записью");

        new NewThread ( "A" ).t.setPriority(5);
        new NewThread ( "B" ).t.setPriority(1);
    }
}
