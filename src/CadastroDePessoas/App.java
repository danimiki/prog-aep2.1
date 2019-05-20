package CadastroDePessoas;

public class App {
	
	public static void main(String[] args) {
		
		Fisica pessoa1 = new Fisica("daniela", "12345678909", "987678905");
		
		System.out.println("id: " + pessoa1.getId() + ", nome: " + pessoa1.getNome() + ", rg: " +
		pessoa1.getRg() + ", cpf: " + pessoa1.getCpf());
		
		Juridica pessoaJur1 = new Juridica("Alan Walker", "0923647589208", 500);
		Juridica pessoaJur2 = new Juridica("Martin Garrix", "019283746576", 250);
		
		Fisica pessoa2 = new Fisica("Lucas Hiroshi", "2255346789", "1133446628");
		Fisica pessoa3 = new Fisica("Luiza Yumi", "324465452", "21225654356");

		pessoaJur1.adicionarSocio(pessoa1, 40);
		
		pessoaJur1.adicionarSocio(pessoa2, 20);
		
		pessoaJur1.adicionarSocio(pessoaJur2, 25);

		pessoaJur1.adicionarSocio(pessoaJur1, 80);
		
		pessoaJur1.removerSocio(pessoa3);
		
	}

}
