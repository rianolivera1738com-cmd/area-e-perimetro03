import java.util.Scanner;

public class AreaPerimetro {
  public static void main(String[] args) {  
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a base do Retangulo: ");
    double base = scanner.nextDouble();
    System.out.print("Digite a Altura do retangulo: ");
    double altura = scanner.nextDouble();
    double area = base * altura;
    double perimetro = 2 * (base + altura);
    
    System.out.printf("Base: %.2f%n", base);
    System.out.printf("Altura: %.2f%n", altura);
    System.out.printf("Area: %.2f%n", area);
    System.out.printf("Perimetro: %.2f%n", perimetro);

    scanner.close();
}
}
