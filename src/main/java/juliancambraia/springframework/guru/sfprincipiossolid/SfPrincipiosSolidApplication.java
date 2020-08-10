package juliancambraia.springframework.guru.sfprincipiossolid;

import juliancambraia.springframework.guru.sfprincipiossolid.controller.HealthInsuranceController;
import juliancambraia.springframework.guru.sfprincipiossolid.controller.ToysFactoryController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfPrincipiosSolidApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfPrincipiosSolidApplication.class, args);
        HealthInsuranceController healthInsuranceController = (HealthInsuranceController) ctx.getBean("healthInsuranceController");
        System.out.println("Após aplicar o princípio S.O.L.I.D. (Open/Close)");
        healthInsuranceController.approvalManager();
        healthInsuranceController.approvalManagerVheicle();

        System.out.println("-------------------Toys-------------------------");

        System.out.println("Após aplicar o princípio S.O.L.I.D. ( Princípio da Segregação de Interfaces (ISP) )");
        ToysFactoryController toysFactoryController = (ToysFactoryController) ctx.getBean("toysFactoryController");

        System.out.println("-------------------Toy House-------------------------");
        System.out.println(toysFactoryController.buildToyHouse());

        System.out.println("-------------------Toy Car-------------------------");
        System.out.println(toysFactoryController.buildToyCar());
        System.out.println("-------------------Toy Plane-------------------------");
        System.out.println(toysFactoryController.buildToyPlaine());
    }

}
