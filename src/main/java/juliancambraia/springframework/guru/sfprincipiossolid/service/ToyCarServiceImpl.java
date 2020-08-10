package juliancambraia.springframework.guru.sfprincipiossolid.service;

import org.springframework.stereotype.Service;

@Service
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
        return "ToyCarServiceImpl: ToyCar: " +
                "Price = " + price +
                ", Color = " + color;
    }
}
