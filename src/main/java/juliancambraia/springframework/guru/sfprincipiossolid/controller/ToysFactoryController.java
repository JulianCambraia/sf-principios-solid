package juliancambraia.springframework.guru.sfprincipiossolid.controller;

import juliancambraia.springframework.guru.sfprincipiossolid.service.ToyCarServiceImpl;
import juliancambraia.springframework.guru.sfprincipiossolid.service.ToyHouseImpl;
import juliancambraia.springframework.guru.sfprincipiossolid.service.ToyPlaneServiceImpl;
import juliancambraia.springframework.guru.sfprincipiossolid.service.ToyService;
import org.springframework.stereotype.Controller;

@Controller
public class ToysFactoryController {

    private final ToyHouseImpl service;
    private final ToyCarServiceImpl toyCarService;
    private final ToyPlaneServiceImpl toyPlaneService;

    public ToysFactoryController(ToyHouseImpl service, ToyCarServiceImpl toyCarService, ToyPlaneServiceImpl toyPlaneService) {
        this.service = service;
        this.toyCarService = toyCarService;
        this.toyPlaneService = toyPlaneService;
    }

    public ToyService buildToyHouse() {
        this.service.setColor("green");
        this.service.setPrice(15.00);
        return this.service;
    }

    public ToyService buildToyCar() {
        this.toyCarService.setColor("red");
        this.toyCarService.setPrice(25.00);
        this.toyCarService.move();
        return this.toyCarService;
    }

    public ToyService buildToyPlaine() {
        this.toyPlaneService.setColor("white");
        this.toyPlaneService.setPrice(125.00);
        this.toyPlaneService.fly();
        return toyPlaneService;
    }
}
