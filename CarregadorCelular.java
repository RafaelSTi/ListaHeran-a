
public class CarregadorCelular extends Celular {
    
    private String tamanhoFio;
    private String voltagem;
    
    
    public void setTamanhoFio(String cm){
        this.tamanhoFio = cm;
    }
    public String getTamanhoFio(){
        return tamanhoFio;
    }
    
    public void setVoltagem(String volts){
        this.voltagem = volts;
    }
    
    public String getVoltagem(){
        return voltagem;
    }
   
    
    public void DadosCarregador(String nome){
        super.DadosCarregador();
    }
   
   
    }
    
    
    

