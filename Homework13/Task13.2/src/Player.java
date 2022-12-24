import java.util.Scanner;
public class Player implements Playable, Recodable {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Натисність  кнопку p, щоб розпочати програвання ");
        String R = scan.next();
        if (R.equals("p")) {
            Player player = new Player();
            player.play();
        } else {
            System.out.println("Ви натиснули не ту кнопку ");
        }
       System.out.println("Натисніть кнопку r, щоб розпочати запис ");
        String R2 = scan.next();
        if (R2.equals("r")) {
            Player player1 = new Player();
            player1.record();
        } else {
            System.out.println("Ви натиснули не ту кнопку ");
        }
    }
        public void play () {
        System.out.println("Програвання розпочато ");

        }
        public void stop () {
        System.out.println("Програвання зупинено ");

        }
        public void record () {
        System.out.println("Запис розпочато ");

        }
        public void pause () {
        System.out.println("Поставити на паузу ");

        }
    }
