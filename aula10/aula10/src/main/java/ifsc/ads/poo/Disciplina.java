package ifsc.ads.poo;

public class Disciplina {
    private String[] alunos = new String[40];
    private String professor;
    private int qtdeAulas, cargaHoraria, avaliacoes;

    public int getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(int avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getProfessor() {
        return professor;
    }

    public int getQtdeAulas() {
        return qtdeAulas;
    }

    public String[] getAlunos() {
        return alunos;
    }

    public void setAlunos(String[] alunos) {
        this.alunos = alunos;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public void setQtdeAulas(int qtdeAulas) {
        this.qtdeAulas = qtdeAulas;
    }

}