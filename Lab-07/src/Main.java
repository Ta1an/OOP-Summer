public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[10];
        workers[0] = new Teacher("Anna", 20, 40);
        workers[1] = new Teacher("Bob", 40, 20);
        workers[2] = new Teacher("Jack", 50, 10);
        workers[3] = new Teacher("Jane", 10, 50);
        workers[4] = new Teacher("John", 20, 30);

        workers[5] = new Programmer("Connor", 100, 40);
        workers[6] = new Programmer("Markus", 70, 20);
        workers[7] = new Programmer("Alice", 60, 10);
        workers[8] = new Programmer("Ryan", 80, 30);
        workers[9] = new Programmer("Mike", 90, 40);

        double workFor5Hours = 0;
        double workFor10Hours = 0;

        for (Worker worker : workers) {
            workFor5Hours = worker.toWork(5);
            workFor10Hours = worker.toWork(10);

            System.out.println(worker.getFullName() + ": " + workFor10Hours);
        }
        Worker workerWithMaxPower = new Worker();
        Worker workerWithMaxWorkFor10Hours = new Worker();

        for (Worker worker : workers) {
            if (worker.getPower() > workerWithMaxPower.getPower()) {
                workerWithMaxPower = worker;
            }
            if (worker.toWork(10) > workerWithMaxWorkFor10Hours.toWork(10)) {
                workerWithMaxWorkFor10Hours = worker;
            }
        }
        System.out.println(workerWithMaxPower);
        System.out.println(workerWithMaxWorkFor10Hours);

    }
}