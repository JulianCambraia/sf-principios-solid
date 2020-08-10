package juliancambraia.springframework.guru.sfprincipiossolid.service;

public class ToyCarServiceImpl implements ToyService, MovableService {
    private double price;
    private String color;

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void move() {
        System.out.println("ToyCar: Iniciando a movimentação do carro.");
    }

    @Override
    public String toString() {
        return "ToyCarServiceImpl{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
