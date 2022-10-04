public class Elevador {
    private int capacidade;
    private int nPessoas;
    private int andarTotal;
    private int andarAtual;

    public Elevador(int capacidade, int nPessoas, int andarTotal, int andarAtual) {
        this.capacidade = capacidade;
        this.nPessoas = nPessoas;
        this.andarTotal = andarTotal;
        this.andarAtual = andarAtual;
    }

    public Elevador() {
    }

    public void Iniciar(int capacidade, int andarTotal) {
        this.capacidade = capacidade;
        this.andarTotal = andarTotal;
    }

    public void Entra(int qtdEntra) {
        if (qtdEntra + getnPessoas() > getCapacidade()) {
            this.nPessoas += (qtdEntra + getnPessoas()) - getCapacidade();
        } else if (qtdEntra < 0) {
            return;
        } else {
            this.nPessoas = qtdEntra;
        }
    }

    public void Sai(int qtdSai) {
        if (this.nPessoas - qtdSai < 0) {
            this.nPessoas = 0;
        } else if (qtdSai < 0) {
            return;
        } else {
            this.nPessoas -= qtdSai;
        }
    }

    public void Sobe(int qtdSubir) {
        if (this.andarAtual + qtdSubir > this.andarTotal) {
            this.andarAtual = this.andarTotal;
        } else if (qtdSubir < 0) {
            return;
        } else {
            this.andarAtual += qtdSubir;
        }
    }

    public void Desce(int qtdDescer) {
        if (qtdDescer > this.andarAtual) {
            this.andarAtual = 1;
        } else if (qtdDescer < 0) {
            return;
        } else {
            this.andarAtual -= qtdDescer;
        }
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        if (capacidade < 0) {
            return;
        }
        this.capacidade = capacidade;
    }

    public int getnPessoas() {
        return nPessoas;
    }

    public void setnPessoas(int nPessoas) {
        if (nPessoas < 0)
            return;
        this.nPessoas = nPessoas;
    }

    public int getAndarTotal() {
        return andarTotal;
    }

    public void setAndarTotal(int andarTotal) {
        if (andarTotal < 0) {
            return;
        }
        this.andarTotal = andarTotal;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        if (andarAtual < 0)
            return;
        this.andarAtual = andarAtual;
    }

}
