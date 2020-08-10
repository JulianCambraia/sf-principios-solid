package juliancambraia.springframework.guru.sfprincipiossolid.controller;

import juliancambraia.springframework.guru.sfprincipiossolid.service.ToyCarServiceImpl;
import juliancambraia.springframework.guru.sfprincipiossolid.service.ToyHouseImpl;
import juliancambraia.springframework.guru.sfprincipiossolid.service.ToyPlaneServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ToysFactoryControllerTest {
    ToysFactoryController toysFactoryController;

    @BeforeEach
    void setUp() {
        toysFactoryController = new ToysFactoryController(new ToyHouseImpl(), new ToyCarServiceImpl(), new ToyPlaneServiceImpl());
    }

    @Test
    void buildToysHouse() {
        System.out.println(toysFactoryController.buildToyHouse());
    }

    @Test
    void buildToysCar() {
        System.out.println(toysFactoryController.buildToyCar());
    }

    @Test
    void buildToysPlane() {
        System.out.println(toysFactoryController.buildToyPlaine());
    }
}