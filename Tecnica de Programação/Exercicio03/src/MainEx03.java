import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainEx03 {
    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);
        Pessoa[] pessoa;

        String listaDeNomes = "";

        int numeroPessoas;

        System.out.print("Quanto nomes deseja criar? : ");
        numeroPessoas = sc.nextInt();
        pessoa = new Pessoa[numeroPessoas];

        for (int i = 0; i < pessoa.length; i++) {

            pessoa[i] = new Pessoa(Generator.generateName(10), Generator.generateName(15));

            listaDeNomes += pessoa[i].getNomeCompleto();

        }

        JOptionPane.showMessageDialog(null, listaDeNomes);

        sc.close();

    }
}
