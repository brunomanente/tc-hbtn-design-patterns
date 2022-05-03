public class Program {
    public static void main(String[] args) {
        SalarioService salarioService1 = new SalarioService();
        SalarioService salarioService2 = new SalarioService();

        double valorSalario1 = salarioService1.calcular(1200, 150, 3000, 10);
        double valorSalario2 = salarioService2.calcular(2500, 350, 10000, 15);

        System.out.printf("Salario 1: %.2f\n", valorSalario1);
        System.out.printf("UUID 1: %s\n\n", salarioService1.getUuid());

        System.out.printf("Salario 2: %.2f\n", valorSalario2);
        System.out.printf("UUID 2: %s\n", salarioService2.getUuid());
    }
}