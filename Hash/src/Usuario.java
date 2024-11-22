public class Usuario{
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = HashSenha.hash(senha);
    }

    public boolean verificarSenha(String senha){
        return HashSenha.verificarSenha(senha, this.senha);
    }
    
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
    
}