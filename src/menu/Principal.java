package menu;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		ArrayList <Manifestacao> manifestacoes = new ArrayList<>();
		int protocolo = 1;

		while (true) {
			System.out.println("************************");
			System.out.println("   MENU DE OUVIDORIA    ");
			System.out.println("************************");
			System.out.println("");
			System.out.println("1. Listar Manifestacao  ");
			System.out.println("2. Fazer um Elogio      ");
			System.out.println("3. Fazer uma Sugestao   ");
			System.out.println("4. Fazer Reclamacao     ");
			System.out.println("5. Excluir Manifestacao ");
			System.out.println("6. Sair                 ");
			System.out.println("");
			System.out.println("Digite Sua Opcao        ");
			System.out.println("");
			int opcao = Teclado.leInt();
			if (opcao == 1) {
				if (manifestacoes.isEmpty()) {
					System.out.println("Nenhuma Manifestacao Cadastrada ");
				}
				System.out.println("");
				for (Manifestacao m : manifestacoes) {
					System.out.println(m);
				}
			} else if (opcao == 2) {
				protocolo = criarElogio(manifestacoes, protocolo);

			} else if (opcao == 3) {
				protocolo = criarSugestao(manifestacoes, protocolo);

			} else if (opcao == 4) {
				protocolo = criarReclamacao(manifestacoes, protocolo);

			} else if (opcao == 5) {
				System.out.println("Digite o Indice Da Manifestacao Que Deseja Excluir: ");
				int indice = Teclado.leInt();
				manifestacoes.remove(indice - 1);
				System.out.println(" Voce Removeu a Manifestacao ");

			} else if (opcao == 6) {
				System.out.println(" Obrigado! ");
				break;
			} else {
				System.out.println("Opcao Invalida! ");
			}
		}
	}

	private static int criarReclamacao(ArrayList<Manifestacao> manifestacoes, int protocolo) {
		Manifestacao novo = new Manifestacao();
		System.out.println("Digite o Titulo da Reclamacao");
		String nome = Teclado.leString();
		System.out.println("Digite a Descricao ");
		String descricao = Teclado.leString();
		novo.setNome(nome);
		novo.setDescricao(descricao);
		novo.setProtocolo(protocolo);
		novo.setCategoria(Categoria.RECLAMACAO);
		manifestacoes.add(novo);
		protocolo++;
		return protocolo;
	}

	private static int criarSugestao(ArrayList<Manifestacao> manifestacoes, int protocolo) {
		Manifestacao novo = new Manifestacao();
		System.out.println("Digite o Titulo da Sugestao");
		String nome = Teclado.leString();
		System.out.println("Digite a Descricao ");
		String descricao = Teclado.leString();
		novo.setNome(nome);
		novo.setDescricao(descricao);
		novo.setProtocolo(protocolo);
		novo.setCategoria(Categoria.SUGESTAO);
		manifestacoes.add(novo);
		protocolo++;
		return protocolo;
	}

	private static int criarElogio(ArrayList<Manifestacao> manifestacoes, int protocolo) {
		Manifestacao novo = new Manifestacao();
		System.out.println("Digite o Titulo do Elogio");
		String nome = Teclado.leString();
		System.out.println("Digite a Descricao ");
		String descricao = Teclado.leString();
		novo.setNome(nome);
		novo.setDescricao(descricao);
		novo.setProtocolo(protocolo);
		novo.setCategoria(Categoria.ELOGIO);
		manifestacoes.add(novo);
		protocolo++;
		return protocolo;
	}
}
