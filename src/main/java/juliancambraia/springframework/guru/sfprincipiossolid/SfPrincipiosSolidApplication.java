package juliancambraia.springframework.guru.sfprincipiossolid;

import juliancambraia.springframework.guru.sfprincipiossolid.controller.HealthInsuranceController;
import juliancambraia.springframework.guru.sfprincipiossolid.entity.ClaimApprovalManager;
import juliancambraia.springframework.guru.sfprincipiossolid.entity.HealthInsuranceSurveyor;
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
	}

}
