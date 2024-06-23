package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    // Protected = Atributo visível apenas para a classe e suas subclasses
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularXp();
}
