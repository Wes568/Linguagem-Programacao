import java.lang.Object;
import java.util.UUID;

public class Aluno {
	
    private String nome;
    private String endereco;
    private int idade;
    private UUID uuid;
    
    Aluno(String end, String nom, int id){
        nome = nom;
        endereco = end;
        idade = id;
        uuid = UUID.randomUUID();

    }
  
    public String getEndereco() {
        return endereco;
      }
    
      public int getIdade() {
        return idade;
      }

      public String getNome() {
        return nome;
      }

      public UUID getUuid() {
        return uuid;
      }
    
    public void setEndereco(String end) {
      endereco = end;
    }
  
    public void setIdade(int id) {
      idade = id;
    }
    public void setNome(String nom) {
        nome = nom;
      }

      public void setUuid(UUID uud) {
        uuid = uud;
      }

  
    public static void main(String args[]) {
    }
  }