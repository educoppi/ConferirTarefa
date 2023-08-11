package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Tarefa;
import view.TarefaView;

public class TarefaController {
	private ArrayList<Tarefa> tarefas;
	private TarefaView tarefaView = new TarefaView();

	Scanner input = new Scanner(System.in);

	public TarefaController() {
		tarefas = new ArrayList<>();
	}

	public void adicionaTarefa() {
		tarefaView.InsiraNomeTarefa();
		input.nextLine();
		String nome = input.nextLine();

		Tarefa tarefa = new Tarefa(nome);

		tarefas.add(tarefa);

		tarefaView.tarefaAdicionada(tarefa);
	}

	public void concluiTarefa(String nomeTarefa) {
		if (tarefas.isEmpty()) {
			tarefaView.listaVazia();
		} else {
			for (Tarefa t : tarefas) {
				if (t.getNome().equals(nomeTarefa)) {
					t.setConcluido(true);
					tarefaView.tarefaConcluida(t);

					return;
				}
			}
			tarefaView.tarefaNaoEncontrada();
		}
	}

	public void exibeLista() {
		if (tarefas.isEmpty()) {
			tarefaView.listaVazia();
		}
		else {
			tarefaView.exibeListaTarefas(tarefas);
		}
	}

	public void menu() {
		int check = -1;
		while (check != 0) {
			tarefaView.menu();
			check = input.nextInt();

			switch (check) {
			case 1 -> {
				adicionaTarefa();
			}
			case 2 -> {
				tarefaView.InsiraNomeTarefa();
				input.nextLine();
				String nome = input.nextLine();
				concluiTarefa(nome);
			}
			case 3 -> {
				exibeLista();
			}
			case 0 -> {
				tarefaView.sairMenu();
			}
			default -> {
				tarefaView.opcoeInvalida();
			}
			}
		}
		input.close();
	}
}
