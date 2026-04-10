import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println("Bogie: " + name + " -> Capacity: " + capacity);
    }
}

public class TrainConsistManagementUC7 {

    public static void main(String[] args) {

        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));

        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("Passenger Bogies Sorted by Capacity:\n");

        for (Bogie b : bogieList) {
            b.display();
        }

        System.out.println("\nProgram executed successfully!");
    }
}
