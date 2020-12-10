package day11.task1;

public class Picker implements Worker{
    private int salary = 0;
    private boolean isPayed;
    private Warehouse warehouse;
    private int kolv = 0;

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public Picker(Warehouse warehouse){
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        return "заработная плата: " + salary + "\n" + "бонус был выплачен: " + isPayed;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);
        kolv += 1;
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        }
        else {
            if (kolv >= 10000) {
                salary += 70000;
                isPayed = true;

            } else {
                System.out.println("Бонус пока не доступен");
            }

        }
    }
}
