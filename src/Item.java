// Classe Items para guardar as informações das variáveis

import java.util.Date;

public class Item {

    private String nome;
    private int quantidades;
    private double preco = 0.0;
    private Date data;

    public Item(String nome, double preco, int quantidades, Date data) {

        this.nome = nome;
        this.quantidades = quantidades;
        this.data = data;
        this.preco = preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getData() {
        return data;
    }

    // Usando o método setnome para definir o nome do produto e a quantidade
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getnome para retornar o nome do produto
    public String getNome() {
        return nome;
    }

    // Método setquantidades para definir a quantidade do produto
    public void setQuantidades(int quantidades) {
        this.quantidades = quantidades;
    }

    // Método getquantidades para retornar a quantidade do produto
    public int getQuantidades() {
        return quantidades;
    }

    // Método toString para retornar a representação do objeto como uma string
    // toString() pra exibir bonitinho
    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidades +
                ", preco=" + preco +
                ", data=" + data +
                '}';
    }
}
