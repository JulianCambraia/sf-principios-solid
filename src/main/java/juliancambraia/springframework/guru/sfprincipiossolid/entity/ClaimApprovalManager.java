package juliancambraia.springframework.guru.sfprincipiossolid.entity;

public class ClaimApprovalManager {

    public void processClaim(InsuranceSurveyor surveyor) {
        if (surveyor.isValidClaim()) {
            System.out.println("ClaimApprovalManager: Reinvidicação válida. Processando reclamação para aprovação....");
        }
    }

}
