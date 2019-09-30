package matc89.exercicio3;

import java.util.List;

public class Tarefa {
    private String descricao;
    private int prioridade;



    public Tarefa(String descricao, int prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getPrioridade() {
        return prioridade;
    }
}

