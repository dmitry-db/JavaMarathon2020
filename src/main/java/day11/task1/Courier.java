package day11.task1;

public class Courier implements Worker{
    private int salary = 0;
    private boolean isPayed;
    private Warehouse warehouse;
    private int kolv =0;


    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public Courier(Warehouse warehouse){
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        String s = "";
        if (isPayed == true){
            s = "бонус был выплачен";
        }
        else{
            s = "бонус не был выплачен";
        }
        return "заработная плата: " + salary + " " + s;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);
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

