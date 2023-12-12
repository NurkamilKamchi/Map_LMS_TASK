public class Car {
    private long id;
    private long numderAuto;

    public Car() {
    }

    public Car(long id, long numderAuto) {
        this.id = id;
        this.numderAuto = numderAuto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNumderAuto() {
        return numderAuto;
    }

    public void setNumderAuto(long numderAuto) {
        this.numderAuto = numderAuto;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", numderAuto=" + numderAuto +
                '}';
    }
}
