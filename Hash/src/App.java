import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do usuário:");
        String nome = entrada.nextLine();

        System.out.println("Digite o email do usuário:");
        String email = entrada.nextLine();

        System.out.println("Digite a senha do usuário:");
        String senha = entrada.nextLine();

        Usuario usuario = new Usuario(nome, email, senha);

        System.out.println("hash da senha: " + usuario.getSenha());
        
        System.out.println("Digite a senha para verificar:");
        String senhaVerificar = entrada.nextLine();

        if(usuario.verificarSenha(senhaVerificar)){
            System.out.println("Senha correta");
        } else {
            System.out.println("Senha incorreta");
        }

        entrada.close();
    }
}
