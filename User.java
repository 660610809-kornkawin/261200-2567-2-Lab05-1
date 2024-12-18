import java.time.LocalDate;

public class User {
    private String name;
    private LocalDate dob;

// contructor --> no parameter
    User(){
        this.name = null;
        this.dob = LocalDate.now();
    }

// contructor --> with parameter
    User(String name, int year , int month, int day){
        this.name = name;
        this.dob = LocalDate.of(year,month,day);
    }

    public String getName(){
        return name;
    }

    public LocalDate getDob(){
        return dob;
    }

    // Display user's name and birthday
    public void displayInfo(){
        System.out.println(name);
        System.out.println(dob);
    }
}
