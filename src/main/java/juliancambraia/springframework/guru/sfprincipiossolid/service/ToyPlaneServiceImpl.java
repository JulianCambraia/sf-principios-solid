package juliancambraia.springframework.guru.sfprincipiossolid.service;

import org.springframework.stereotype.Service;

@Service
public class ToyPlaneServiceImpl implements ToyService, MovableService, FlyableService {

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
    public void fly() {
        System.out.println("ToyPlane: Iniciando o voô do Avião.");
    }

    @Override
    public void move() {
        System.out.println("ToyPLane: Iniciando o taxiamento do Avião.");
    }

    @Override
    public String toString() {
        return "ToyPlaneServiceImpl - Toy Plane: " +
                "Price = " + price +
                ", Color='" + color;
    }
}
