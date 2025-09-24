package okr;

public class Curso {
    private String nome;
    private String categoria;
    private int estudantes;

    public Curso(String nome, String categoria, int estudantes){
        this.nome = nome;
        this.categoria = categoria;
        this.estudantes = estudantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(int estudantes) {
        this.estudantes = estudantes;
    }
}
