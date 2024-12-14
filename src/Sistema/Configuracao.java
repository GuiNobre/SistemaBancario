package Sistema;

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


    }

}
