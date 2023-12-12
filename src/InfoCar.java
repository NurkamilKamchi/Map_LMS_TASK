public class InfoCar {
    private int createdYear;
    private String model;
    private double price;
    private String color;

    public InfoCar() {
    }

    public InfoCar(int createdYear, String model, double price, String color) {
        this.createdYear = createdYear;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getCreatedYear() {
        return createdYear;
    }

    public void setCreatedYear(int createdYear) {
        this.createdYear = createdYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "InfoCar{" +
                "createdYear=" + createdYear +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
