package org.codetech.code;

import java.util.Scanner;

/**
 *
 * @author pedro.nardelli
 */
public class ContaTerminal {

    public static void main(String[] args) {

        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Agencia: ");
        int receberNumero = scanner.nextInt();

        if(receberNumero != conta.numero){
            System.out.println("Agencia não existe, por favor re-valide!!");
        }else {
            System.out.println("Olá " + conta.nomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia é " + conta.agencia + " conta " + conta.getNumero() +
            " e seu saldo " + conta.getSaldo() + " já está dispinivel para saque.");
        }

        System.out.println("Fim do programa!");

    }
}
