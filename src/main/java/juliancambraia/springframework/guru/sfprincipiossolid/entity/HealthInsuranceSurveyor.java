package juliancambraia.springframework.guru.sfprincipiossolid.entity;

public class HealthInsuranceSurveyor extends InsuranceSurveyor {
       public boolean isValidClaim() {
           System.out.println("HealthInsuranceSurveyor: validação seguro de vida: ");
           // adicione aqui a sua lógica de validação para o seguro de vida
           return true;
       }
}
