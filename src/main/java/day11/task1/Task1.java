package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.setCountPickedOrders(0);
        warehouse.setCountDeliveredOrders(0);
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        businessProcess(courier);
        businessProcess(picker);

        picker.bonus();
        courier.bonus();

        System.out.println(warehouse.toString());
        System.out.println(picker.getSalary());
        System.out.println(courier.getSalary());

        Warehouse warehouse1 = new Warehouse();
        warehouse1.setCountPickedOrders(0);
        warehouse1.setCountDeliveredOrders(0);
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);

        picker1.doWork();
        courier1.doWork();

        System.out.println(warehouse.toString());
        System.out.println(picker.getSalary());
        System.out.println(courier.getSalary());

        System.out.println(warehouse1.toString());
        System.out.println(picker1.getSalary());
        System.out.println(courier1.getSalary());

    }

    static void businessProcess(Worker worker){
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
    }
}
