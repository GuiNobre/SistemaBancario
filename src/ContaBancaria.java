//Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico).
// Implemente métodos getters e setters para os atributos privados.

import Sistema.Configuracao;

public class ContaBancaria {
   public static void main (String[] args) {

      Configuracao configuracao = new Configuracao();

      System.out.println("Bem vindo de volta " + configuracao.getTitular());
      configuracao.transicao();



   }
}
