package HomeWork04;

public class BusStop {
    private int id;
    private String name;
    private double attitude;
    private double latitude;

    public BusStop(int id, String name, double attitude, double latitude) {
        this.id = id;
        this.name = name;
        this.attitude = attitude;
        this.latitude = latitude;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
