
package Mercado;

public class ProdutoImportado extends Produto{
    private Double taxaDeAlfandega;



    public ProdutoImportado(Double taxaDeAlfandega, String nome, Double preco) {
        super(nome, preco);
        this.taxaDeAlfandega = taxaDeAlfandega;
    }

    public Double getTaxaDeAlfandega() {
        return taxaDeAlfandega;
    }

    public void setTaxaDeAlfandega(Double taxaDeAlfandega) {
        this.taxaDeAlfandega = taxaDeAlfandega;}
    
    public Double precoTotal(){
        return getPreco() + taxaDeAlfandega;
    }
    @Override
    public String etiquetaDePreco(){
        return nome+" $ "+
                String.format("%.2f", precoTotal()) 
                +"(Taxa de alfândega: $ "+String.format("%.2f", taxaDeAlfandega)+")";
    }
    
}
