package java.shop_toys.Date;

public class Toy {
    int id;
    String name;
    int amount;
    int frequency;

    public Toy(int id, String name, int amount, int frequency) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", frequency=" + frequency +
                '}';
    }
}
