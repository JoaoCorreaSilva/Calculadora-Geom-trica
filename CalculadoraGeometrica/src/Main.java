import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            System.out.print("Escolha a figura: ");
            opcao = scanner.nextInt();

            if (opcao != 0) {
                calcularFigura(opcao);
            }

        } while (opcao != 0);

        System.out.println("Fim do Programa 😏.");
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("===== Calculadora Geométrica =====");
        System.out.println("1. Triângulo Equilátero");
        System.out.println("2. Quadrado");
        System.out.println("3. Retângulo");
        System.out.println("4. Círculo");
        System.out.println("5. Hexágono");
        System.out.println("6. Cubo");
        System.out.println("7. Paralelepípedo");
        System.out.println("8. Esfera");
        System.out.println("9. Pirâmide de Base Quadrada");
        System.out.println("10. Cilindro");
        System.out.println("11. Cone");
        System.out.println("0. Sair");
    }

    private static void calcularFigura(int opcao) {
        Scanner scanner = new Scanner(System.in);

        switch (opcao) {
            case 1:
                System.out.print("Digite o lado do triângulo equilátero: ");
                double ladoTriangulo = scanner.nextDouble();
                double areaTriangulo = (Math.sqrt(3) / 4) * Math.pow(ladoTriangulo, 2);
                double perimetroTriangulo = 3 * ladoTriangulo;
                exibirResultados("Triângulo Equilátero", areaTriangulo, perimetroTriangulo);
                break;

            case 2:
            System.out.print("Digite o lado do quadrado: ");
            double ladoQuadrado = scanner.nextDouble();
            double areaQuadrado = Math.pow(ladoQuadrado, 2);
            double perimetroQuadrado = 4 * ladoQuadrado;
            exibirResultados("Quadrado", areaQuadrado, perimetroQuadrado);
            break;

            case 3:
                System.out.print("Digite o comprimento do retângulo: ");
                double comprimentoRetangulo = scanner.nextDouble();
                System.out.print("Digite a largura do retângulo: ");
                double larguraRetangulo = scanner.nextDouble();
                double areaRetangulo = comprimentoRetangulo * larguraRetangulo;
                double perimetroRetangulo = 2 * (comprimentoRetangulo + larguraRetangulo);
                exibirResultados("Retângulo", areaRetangulo, perimetroRetangulo);
                break;

            case 4:
                System.out.print("Digite o raio do círculo: ");
                double raioCirculo = scanner.nextDouble();
                double areaCirculo = Math.PI * Math.pow(raioCirculo, 2);
                double perimetroCirculo = 2 * Math.PI * raioCirculo;
                exibirResultados("Círculo", areaCirculo, perimetroCirculo);
                break;

            case 5:
                System.out.print("Digite o lado do hexágono: ");
                double ladoHexagono = scanner.nextDouble();
                double areaHexagono = (3 * Math.sqrt(3) / 2) * Math.pow(ladoHexagono, 2);
                double perimetroHexagono = 6 * ladoHexagono;
                exibirResultados("Hexágono", areaHexagono, perimetroHexagono);
                break;

            case 6:
                System.out.print("Digite o lado do cubo: ");
                double ladoCubo = scanner.nextDouble();
                double volumeCubo = Math.pow(ladoCubo, 3);
                double areaSuperficialCubo = 6 * Math.pow(ladoCubo, 2);
                exibirResultadosEspaciais("Cubo", volumeCubo, areaSuperficialCubo);
                break;

            case 7:
                System.out.print("Digite o comprimento do paralelepípedo: ");
                double comprimentoParalelepipedo = scanner.nextDouble();
                System.out.print("Digite a largura do paralelepípedo: ");
                double larguraParalelepipedo = scanner.nextDouble();
                System.out.print("Digite a altura do paralelepípedo: ");
                double alturaParalelepipedo = scanner.nextDouble();

                double volumeParalelepipedo = comprimentoParalelepipedo * larguraParalelepipedo * alturaParalelepipedo;
                double areaSuperficialParalelepipedo = 2 * (comprimentoParalelepipedo * larguraParalelepipedo +
                        comprimentoParalelepipedo * alturaParalelepipedo +
                        larguraParalelepipedo * alturaParalelepipedo);

                exibirResultadosEspaciais("Paralelepípedo", volumeParalelepipedo, areaSuperficialParalelepipedo);
                break;

            case 8:
                System.out.print("Digite o raio da esfera: ");
                double raioEsfera = scanner.nextDouble();
                double volumeEsfera = (4.0 / 3.0) * Math.PI * Math.pow(raioEsfera, 3);
                double areaSuperficialEsfera = 4 * Math.PI * Math.pow(raioEsfera, 2);
                exibirResultadosEspaciais("Esfera", volumeEsfera, areaSuperficialEsfera);
                break;



            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void exibirResultados(String figura, double area, double perimetro) {
        System.out.println("===== Resultados =====");
        System.out.println("Figura: " + figura);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
        System.out.println("======================");
    }

    private static void exibirResultadosEspaciais(String figura, double volume, double areaSuperficial) {
        System.out.println("===== Resultados =====");
        System.out.println("Figura: " + figura);
        System.out.println("Volume: " + volume);
        System.out.println("Área Superficial: " + areaSuperficial);
        System.out.println("======================");
    }

}


