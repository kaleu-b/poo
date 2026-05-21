public class Veiculo {

    private String placa;
    private String modelo;
    private String ano;

    public Veiculo(String placa, String modelo, String ano) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Veiculo{");
        sb.append("placa='").append(placa).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", ano='").append(ano).append('\'');
        sb.append('}');
        return sb.toString();
    }
}