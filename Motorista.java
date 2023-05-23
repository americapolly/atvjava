public class Motorista {
    private String nome;
    private int idade;
    private String categoria;

    public Motorista(String nome, int idade, String categoria) {
        this.nome = nome;
        this.idade = idade;
        this.categoria = categoria;
    }
    
 
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
  
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    } 
    public void imprimirDados(){
  System.out.println("Motorista: " +    this.getNome());
  System.out.println("Idade: "     +    this.getIdade());
  System.out.println("Categoria: " +    this.getCategoria());
  }
    }