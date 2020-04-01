package com.example.project.historico;

import com.example.project.operadores.OperadorBinario;

import java.util.ArrayList;
import java.util.List;

public class HistoricoSimple {

    private List<OperadorBinario> operadorBinarioList;

    public HistoricoSimple() {
        operadorBinarioList = new ArrayList<>();
    }

    public void add(OperadorBinario operadorBinario) {
        operadorBinarioList.add(operadorBinario);
    }

    public int tamanyoHistorico() {
        return operadorBinarioList.size();
    }

    public List<OperadorBinario> getOperadorBinarioList() {
        return operadorBinarioList;
    }

    public void setOperadorBinarioList(List<OperadorBinario> operadorBinarioList) {
        this.operadorBinarioList = operadorBinarioList;
    }

    @Override
    public String toString() {
        return "HistoricoSimple{" +
                "operadorBinarioList=" + operadorBinarioList +
                '}';
    }
}
