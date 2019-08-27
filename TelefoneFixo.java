public class TelefoneFixo extends Operadora{
    
    private double tamanhoCabo ;
    private String IdentificadorChamada;
    
public void setTamanhoCabo(double num){
    this.tamanhoCabo = num;
    
}
public double getTamanhoCabo(){
    return tamanhoCabo;
}
public void setIdenticadorBina(String nome){
    this.IdentificadorChamada = nome;
    
}
public String getIdentificadorBina(){
    return IdentificadorChamada;
}

@Override
     public void ImprimirDados(){
         super.ImprimirDados();
     }
}
