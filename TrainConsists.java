import java.util.LinkedList;

public class TrainConsists {
    public static void main(String[] args) {

        // Step 1: Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Step 2: Add bogies in order
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC Coach");
        train.add("Cargo");
        train.add("Guard");

        // Step 3: Insert Pantry Car at position 2 (index starts from 0)
        train.add(2, "Pantry Car");

        // Step 4: Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        // Step 5: Display final train consist
        System.out.println("Final Train Consist:");
        for (String bogie : train) {
            System.out.println(bogie);
        }
    }
}
