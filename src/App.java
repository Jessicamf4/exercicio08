import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double porHora, horas, salario;
        System.out.println("Digite quanto você ganha por hora: ");
        porHora = sc.nextInt();
        System.out.println("Digite o número de horas trabalhadas neste mês: ");
        horas = sc.nextInt();
        sc.close();
        salario = porHora*horas;
        
        System.out.println("O seu salário neste mês foi " + salario + "reais");
    }
}

