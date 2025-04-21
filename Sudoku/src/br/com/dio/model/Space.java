package br.com.dio.model;

public class Space {

    private Integer atual;
    private final int esperado;
    private final boolean fixed;

    public Space(final int esperado, final boolean fixed) {
        this.esperado = esperado;
        this.fixed = fixed;
        if(fixed){
            atual = esperado;
        }
    }

    public Integer getAtual() {
        return atual;
    }

    public void setAtual(final Integer atual) {
        if(fixed) return;
        this.atual = atual;
    }

    public void limparEspaco(){
        setAtual(null);
    }

    public int getEsperado() {
        return esperado;
    }

    public boolean isFixed() {
        return fixed;
    }
}
