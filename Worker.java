
public class Worker {
    private String name;
    private double salary;
    private static int counter = 0; // Shared counter variable

    // Constructor
    public Worker(String name, double salary) {
        this.name = name;
        try {
            setSalary(salary);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        counter++; // Increment the counter for each new worker
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for salary with exception handling
    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary amount must be greater than zero");
        }
        this.salary = salary;
    }

    // Getter for counter
    public static int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        // Create three workers
        Worker worker1 = new Worker("John", 50000.0);
        Worker worker2 = new Worker("Alice", -1000.0); // This will throw an exception
        Worker worker3 = new Worker("Bob", 60000.0);

        // Display the number of total workers using the counter variable
        System.out.println("Total number of workers: " + Worker.getCounter());
    }
}
