package Sistema;
import java.util.Scanner;

public class Configuracao {
    public String titular = "Guilherme";
    private boolean ativo;
    private int numeroConta;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void transicao() {
        System.out.println("Gostaria de fazer alguma transição?");
        Scanner scanner = new Scanner(System.in);
        String desejoTransicao = scanner.nextLine();
         if (desejoTransicao.equals("Sim")) {
            System.out.println("Digite o valor");
         }
        if (desejoTransicao.equals("Não")) {
            System.out.println("Certo, paramos por aqui.");
        }
        else {
                System.out.println("Não entendi, digite Sim ou Não");
            }

        }

    }

