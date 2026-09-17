package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // new -> criando uma nova instância do Bilhete único, ou seja, um novo objeto
        BilheteUnico b01 = new BilheteUnico();
        b01.titular = "Lucas";
        b01.numero = "00001";
        b01.cor = "Azul";
        b01.isIdoso = false;
        b01.isEstudante = true;
        b01.saldo = 0.0;

        b01.recarregar(10.0);

        System.out.println("Saldo do b01: " + b01.saldo);

        b01.passarBilhete();
        System.out.println("Saldo do b01: " + b01.saldo);

        System.out.println(b01);
        b01.printarInformacoes();

        System.out.println();
        System.out.println();

        BilheteUnico b02 = new BilheteUnico();
        b02.titular = "Bob";
        b02.numero = "00002";
        b02.cor = "Cinza";
        b02.isIdoso = true;
        b02.isEstudante = false;
        b02.saldo = 0.0;

        b02.printarInformacoes();
        b02.passarBilhete();

        List<BilheteUnico> bilhetes = new ArrayList<>();
        bilhetes.add(b01);
        bilhetes.add(b02);
    }
}
