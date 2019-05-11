package cotuba.domain;

public final class Capitulo {

    private final String titulo;
    private final String conteudoHtml;

    public Capitulo(String titulo, String conteudoHtml) {
        this.titulo = titulo;
        this.conteudoHtml = conteudoHtml;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConteudoHtml() {
        return conteudoHtml;
    }

}
