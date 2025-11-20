package interoperability;

public class CallKotlinCodeFromJava {
    public static void main(String[] args){
        System.out.println("Hello From Java");


        CounterExampleKotlin counter1 = new CounterExampleKotlin();

        System.out.println(counter1.getNumber());
        counter1.increment();
        System.out.println(counter1.getNumber());

        System.out.println(StringUtilsKt.isEmail("text@gmail.com"));

        Logger logger = new Logger();
        logger.log("Aplikasi Dimulai");
        logger.log("Aplikasi Dimulai","Debug");

        String dbUrl = Database.Companion.getConnectisonUrl();
        String dbUrl2 = Database.getConnectisonUrl();
        System.out.println(dbUrl);
        System.out.println(dbUrl2);

    }
}
