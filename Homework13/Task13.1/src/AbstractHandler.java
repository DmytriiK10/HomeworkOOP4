 import java.util.Scanner;
public class  AbstractHandler {
    public static void main(String[] args) {
        while (true) {
            String format;
            Scanner scan = new Scanner(System.in);
            AbstractHandler abstractHandler = new XMLHandler();
            AbstractHandler abstractHandler1 = new TXTHandler();
            AbstractHandler abstractHandler2 = new DOCHandler();


            System.out.println("Внесіть документ на перевірку формату ");
            format = scan.next();
            if (format.equals("XML")) {
                abstractHandler = new XMLHandler();
                System.out.println("Формат документу XML ");
                abstractHandler.create();
                abstractHandler.open();
                abstractHandler.change();
                abstractHandler.save();

            } else if (format.equals("TXT")) {
                abstractHandler1 = new TXTHandler();
                System.out.println("Формат документу TXT ");
                abstractHandler1.create();
                abstractHandler1.open();
                abstractHandler1.change();
                abstractHandler1.save();

            } else if (format.equals("DOC")) {
                abstractHandler2 = new DOCHandler();
                System.out.println("Формат документу DOC ");
                abstractHandler2.create();
                abstractHandler2.open();
                abstractHandler2.change();
                abstractHandler2.save();

            } else if (format.equals("QUIT")) {
                break;

            } else
                System.out.println("Такого формату немає, спробуйте ще раз ");

        }

    }

    void open() {
    }

    void create() {
    }

    void change() {
    }
    void save() {
    }
}


