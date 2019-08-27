public class Operadora {
    private String nomeOperadora;
    private int frequencia;
    private String cobertura;
   
    
    
    
    public void setNomeOperadora(String nome){
        this.nomeOperadora = nome;   
    }
    public String getNomeOperadora(){
        return nomeOperadora;
    }
    public void setFrequencia(int num){
        this.frequencia = num;
    }
    public int getFrequencia(){
        return frequencia;
    }
    public void setCobertura(String nome){
        this.cobertura = nome;
    }
    public String getCobertura(){
        return cobertura;
    }
    
    
    public void ImprimirDados(){
        System.out.println(nomeOperadora);
        System.out.println(frequencia);
        System.out.println(cobertura);
    }
    
    
}
