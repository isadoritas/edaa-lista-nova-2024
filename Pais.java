public class Pais {
    public String nome;
    public double consumoBeer;
    public double consumoSpirits;
    public double consumeWine;

    public Pais(String nome, double consumoBeer, double consumoSpirits, double consumeWine) {
        this.consumoBeer = consumoBeer;
        this.consumoSpirits = consumoSpirits;
        this.consumeWine = consumeWine;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getConsumoBeer() {
        return consumoBeer;
    }

    public void setConsumoBeer(double consumoBeer) {
        this.consumoBeer = consumoBeer;
    }

    public double getConsumoSpirits() {
        return consumoSpirits;
    }

    public void setConsumoSpirits(double consumoSpirits) {
        this.consumoSpirits = consumoSpirits;
    }

    public double getConsumeWine() {
        return consumeWine;
    }

    public void setConsumeWine(double consumeWine) {
        this.consumeWine = consumeWine;
    }
    


    
}
