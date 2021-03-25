
package execiciopolimorfismo2;

import Mercado.Produto;
import Mercado.ProdutoImportado;
import Mercado.ProdutoUsado;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ExecicioPolimorfismo2 {

    public static void main(String[] args) throws ParseException {
        Scanner t = new Scanner(System.in);
        List<Produto>list = new ArrayList<>();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Insira o número de produtos: ");
        int n = t.nextInt();
        for(int i = 1;i<=n;i++){
            System.out.println("Dados do protuto #"+i+": ");
            System.out.print("Comum, usado ou importado (c/u/i)? ");
            char r = t.next().charAt(0);
            System.out.print("Nome: ");
            t.nextLine();
            String nome = t.nextLine();
            System.out.print("Preço: ");
            double preco = t.nextDouble();
            if (r == 'i'){
                System.out.print("Preço de alfândega: ");
                double taxaDeAlfandega = t.nextDouble();
                Produto pro = new ProdutoImportado(taxaDeAlfandega, nome, preco);
                list.add(pro);
            }
            else if(r=='u'){
                System.out.print("Data de fabricação (DD/MM/YYYY): ");
                String da = t.nextLine();
                Date data = formato.parse(da);
                Produto pro = new ProdutoUsado(data, nome, preco);
                list.add(pro);
            }
            else{
                Produto pro = new Produto(nome, preco);
                list.add(pro);
            }
            
        }
        System.out.println("----------------------");
        System.out.println("ETIQUETAS DE PREÇO: ");
            for(Produto x: list){
                System.out.println(x.etiquetaDePreco());
            }
    }
    
}
