package Atividade37.model;

public class cadastroPratos {

    public String cor;
    public String tamanho;
    public String quantidade;
    public String valor;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof cadastroPratos) {
            cadastroPratos outro = (cadastroPratos) obj;
            if (this.cor.equals(outro.cor) && this.tamanho.equals(outro.tamanho)
                    && this.quantidade.equals(outro.quantidade) && this.valor.equals(outro.valor)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "== Pratos ==\n" + "| Cor: " + cor + "| Tamanho: " + tamanho + "| Quantidade: " + quantidade
                + "| Valor: " + valor;
    }
}
