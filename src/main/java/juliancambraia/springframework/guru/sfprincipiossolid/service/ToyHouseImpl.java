package juliancambraia.springframework.guru.sfprincipiossolid.service;

import org.springframework.stereotype.Service;

@Service
public class ToyHouseImpl implements ToyService {
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
    public String toString() {
        return "ToyHouseImpl: Toy House - " +
                "Price = " + price +
                ", Color = " + color ;
    }
}
