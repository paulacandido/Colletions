import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {
	Scanner leia = new Scanner (System.in);
	int quantidade;
	String nome;
	String codigo;
	double preco;
	Estoque(int codigo, int quantidade, String nome, double preco) {
		this.codigo = "C"+codigo;
		this.quantidade = quantidade;
		this.nome = nome;
		this.preco = preco;
	}
	@Override
    public String toString() {
        return this.codigo+" - "+this.nome+" x "+this.quantidade+" R$"+preco;
    }
	@Override
	public int hashCode() {
		System.out.println("Digite a opção que deseja: \n 1- Atualizar Codigo  \n 2- Atualizar Nome \n 3- Atualizar Preço \n 4- Atualizar Quantidade");
	    int a = leia.nextInt();
	    switch(a) {
	    case 1:
	    	System.out.println("Digite o codigo novo:");
		   this.codigo = "/C"+leia.next()+"/";
		    break;
	    case 2:
	    	System.out.println("Digite o nome novo:");
		    this.nome = leia.next();
		    break;
	    case 3:
	    	System.out.println("Digite o preço novo:");
		    this.preco = leia.nextDouble();
		    break;
	    case 4: 
	    	System.out.println("Digite a quantidade nova:");
		    this.quantidade = leia.nextInt();
		    break;
	    }
		return 4;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		List<Object> estoque= new ArrayList<Object>();
		int a = 0;
		do {
			System.out.println("Digite a opção que deseja: \n 1- Adicionar  \n 2- Remover \n 3- Atualizar \n 4- Apresentar \n 5- Sair");
		     a = leia.nextInt();
			switch(a){
			case 1:
				System.out.println("Nome do produto:");
				String n = leia.next();
				System.out.println("Quantidade do produto:");
				int q = leia.nextInt();
				System.out.println("Codigo do produto:");
				int c = leia.nextInt();
				System.out.println("Preço do produto:");
				double p = leia.nextDouble();			
				estoque.add(new Estoque(c,q,n,p));				
				
				break;
			case 2: 
				if(estoque.size() <= 1) 
					estoque.clear();				
				else {
				System.out.println("Digite o codigo do produto que deseja remover(apenas numeros):");
				int codigo = leia.nextInt();					
				
					for (Object produto : estoque) {
						System.out.println(estoque.size());
						if((produto.toString()).contains("/C"+codigo+"/") == true) {							
							
								estoque.remove(produto);
						}			
					}
				}
				break;
			case 3: 
				System.out.println("Digite o codigo do produto que deseja atualizar:");
				int cod = leia.nextInt();
				for (Object produto : estoque) {
					if((produto.toString()).contains("/C"+cod+"/") == true) {
						produto.hashCode();
					}
				    System.out.println("Produto: " + produto.toString());
				}
				break;
			case 4:
				for (Object produto : estoque) {
				    System.out.println("Produto: " + produto.toString());
				}
				break;
			case 5:
				System.out.println("Você está saindo...");
				break;
			default: 
				System.out.println("Opção invalida.");
				break;
			}
		}while(a!=5);
		
		
		

	}

}
