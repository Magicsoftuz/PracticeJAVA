public class Car {
    private String model;
    private String name;
    private int year;

    Car(String model, String name, int year){
        this.model = model;
        this.name = name;
        this.year = year;
    }
    Car(Car car){
        this.model = car.getModel();
        this.name = car.getName();
        this.year = car.getYear();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void copy(Car car){
        this.model = car.getModel();
        this.name = car.getName();
        this.year = car.getYear();
    }
}
