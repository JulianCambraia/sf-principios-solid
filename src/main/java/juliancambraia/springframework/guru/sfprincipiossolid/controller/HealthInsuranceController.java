package juliancambraia.springframework.guru.sfprincipiossolid.controller;

import juliancambraia.springframework.guru.sfprincipiossolid.entity.ClaimApprovalManager;
import juliancambraia.springframework.guru.sfprincipiossolid.entity.HealthInsuranceSurveyor;
import juliancambraia.springframework.guru.sfprincipiossolid.entity.VehicleInsuranceSurveyor;
import org.springframework.stereotype.Controller;

@Controller
public class HealthInsuranceController {

    ClaimApprovalManager claimApprovalManager = new ClaimApprovalManager();

    public void approvalManager() {
        claimApprovalManager.processHealthClaim(new HealthInsuranceSurveyor());
    }

    public void approvalManagerVheicle() {
        claimApprovalManager.processVheicleClaim(new VehicleInsuranceSurveyor());
    }
}
