package juliancambraia.springframework.guru.sfprincipiossolid.entity;

public class VehicleInsuranceSurveyor extends InsuranceSurveyor {
    public boolean isValidClaim() {
        System.out.println("VehicleInsuranceSurveyor: Validating health insurance claim veiculo...");
        /*Logic to validate health insurance claims*/
        return true;
    }
}
