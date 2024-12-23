import java.time.LocalDate;

public class Admin extends User{
    public Admin(){
        super();
    }
    public Admin(String name,int year, int month, int day){
        super(name, year, month, day);
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("User type: admin.");
    }
    public void displayInfo(boolean full){
        if (full) {
            displayInfo();
        }else{
            System.out.println(super.name);
        }
    }
}
