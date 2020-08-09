package juliancambraia.springframework.guru.sfprincipiossolid.controller;

import juliancambraia.springframework.guru.sfprincipiossolid.entity.ClaimApprovalManager;
import juliancambraia.springframework.guru.sfprincipiossolid.entity.HealthInsuranceSurveyor;
import juliancambraia.springframework.guru.sfprincipiossolid.entity.VehicleInsuranceSurveyor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HealthInsuranceControllerTest {
    HealthInsuranceSurveyor healthInsuranceSurveyor;
    ClaimApprovalManager claimApprovalManager;
    VehicleInsuranceSurveyor vehicleInsuranceSurveyor;

    @BeforeEach
    void setUp() {
        healthInsuranceSurveyor = new HealthInsuranceSurveyor();
        claimApprovalManager = new ClaimApprovalManager();
        vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();
    }

    @Test
    public void testProcessClaim() {
        claimApprovalManager.processClaim(healthInsuranceSurveyor);
        claimApprovalManager.processClaim(vehicleInsuranceSurveyor);
    }

}