import java.util.Scanner;

/**
 *
 */
public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de litros:");
        int quantidadeDeLitros = scanner.nextInt();
        System.out.println("Digite o tipo de combustível: 1-gasolina\n2-alcool\n3-diesel\n4-flex");
        int tipoCombustivel = scanner.nextInt();

        PostoCombustivel postoCombustivel = new PostoCombustivel(quantidadeDeLitros, tipoCombustivel);

        System.out.println(postoCombustivel);



    }
}
