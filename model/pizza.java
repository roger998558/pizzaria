package model;

public class pizza{
    private String sabor;
    private double valor;
    private char tamanho;

    
    
    public pizza(String sabor, double valor, char tamanho) {
        this.sabor = sabor;
        this.valor = valor;
        this.tamanho = tamanho;

    }
    public pizza(){}
    public String pedidoifood(){
        return String.format("sabor:%s,valor %.2f,tamanho %s"+getSabor(),getValor(),getTamanho());
    }
    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public char getTamanho() {
        return tamanho;
    }
    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }

} 