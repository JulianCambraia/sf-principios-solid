package juliancambraia.springframework.guru.sfprincipiossolid.entity;

public class ClaimApprovalManager {
       public void processHealthClaim(HealthInsuranceSurveyor seguroVida) {
           if (seguroVida.isValidClaim()) {
               System.out.println("Processo corrente de aprovação do seguro de vida...");
           }
       }

       public void processVheicleClaim(VehicleInsuranceSurveyor seguro) {
           if (seguro.isValidClaim()) {
               System.out.println("Processo corrente de aprovação da apólice de seguro de veículo...");
           }
       }
}
