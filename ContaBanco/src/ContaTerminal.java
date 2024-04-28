import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner.
        // Exibir as mensagens para o nosso usuário.
        // Obter pela classe Scanner os valores digitados no terminal.
        // Exibir a mesagem da conta criada.

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu Nome!");
        String nome = scanner.nextLine();
           
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();     
            
        System.out.println("Por favor, digite o número da conta!");
        int numero = scanner.nextInt();
              
        System.out.println("Por favor, digite o valor do saldo da conta!");
        Double saldo = scanner.nextDouble();
  
        System.out.println("Olá ".concat(nome) +", obrigado por criar uma conta em nosso banco, sua agência é: ".concat(agencia) + " conta: "+ numero + " e seu saldo: R$ " + saldo +" já está disponível para saque.");

    }
}
