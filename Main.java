import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User john = new User("john", 1962, 7, 6);
        Admin nicolas = new Admin("nicolas", 1964, 1, 7);

        john.displayInfo();
        nicolas.displayInfo();

        nicolas.displayInfo(true);
        System.out.println();
        nicolas.displayInfo(false);
    }
}