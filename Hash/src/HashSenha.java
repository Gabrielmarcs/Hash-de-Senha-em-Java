import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class HashSenha {

    public static String hash(String senha){
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = messageDigest.digest(senha.getBytes());
            return Base64.getEncoder().encodeToString(bytes);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Erro ao gerar hash da senha " + e.getMessage());
        }
    }

    public static boolean verificarSenha(String senha, String hash){
        return hash(senha).equals(hash);
    }
}
