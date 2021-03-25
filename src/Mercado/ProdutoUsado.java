
package Mercado;


import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    private Date dataDeFabricacao;

    public ProdutoUsado() {
        super();
    }
    public ProdutoUsado(Date dataDeFabricacao, String nome, Double preco) {
        super(nome, preco);
        this.dataDeFabricacao = dataDeFabricacao;
    }
    public Date getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(Date dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }
     @Override
    public String etiquetaDePreco(){
        return nome+" (Usado )$ "+String.format("%.2f", preco)+" (Data de fabricação: "+formato.format(dataDeFabricacao)+") " ;
    }

}
