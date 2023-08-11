package view;

import model.Tarefa;
import java.util.ArrayList;

public class TarefaView {
	
	public void InsiraNomeTarefa() {
		System.out.printf("Insira o nome da tarefa: ");
	}
	
	public void menu() {
		System.out.println("\n== Menu ==");
		System.out.println("1 - Adicionar tarefa");
		System.out.println("2 - Concluir tarefa");
		System.out.println("3 - Exibir lista de tarefas");
		System.out.println("0 - Sair");
		System.out.printf("Selecione uma das opcoes: ");
	}
	
	public void tarefaAdicionada(Tarefa tarefa) {
		System.out.println("Tarefa: " + tarefa.getNome() + " adicionada com sucesso.");
	}
	
	public void exibeListaTarefas(ArrayList<Tarefa> tarefas) {
		System.out.println("\n==== LISTA DE TAREFAS ====");
		for (Tarefa t : tarefas) {
			System.out.printf("Tarefa: "+ t.getNome() + ", Concluida: "+ t.isConcluido() +"\n");
		}
	}
	
	public void tarefaConcluida(Tarefa tarefa) {
		System.out.println("Tarefa: "+ tarefa.getNome() + " Concluida!");
	}
	
	public void tarefaNaoEncontrada() {
		System.out.println("TAREFA NÃO ENCONTRADA!");
	}
	
	public void sairMenu() {
		System.out.println("Saindo...");
	}
	
	public void opcoeInvalida() {
		System.out.println("Opcao Invalida!");
	}
	
	public void listaVazia() {
		System.out.println("A lista esta vazia!");
	}
}
