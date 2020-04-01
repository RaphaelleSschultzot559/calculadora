/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project.calculadoras;

import com.example.project.historico.HistoricoSimple;
import com.example.project.operadores.OperadorBinario;
import com.example.project.operadores.OperadorMultiplicacion;
import com.example.project.operadores.OperadorResta;
import com.example.project.operadores.OperadorSuma;

public class Calculator {

    private HistoricoSimple historicoSimple;

    public Calculator() {
        this.historicoSimple = new HistoricoSimple();
    }

    public double sumar(double op1, double op2) {
        return aplicar(new OperadorSuma(op1, op2));
    }

    public double restar(double op1, double op2) {
        return aplicar(new OperadorResta(op1, op2));
    }

    public double multiplicar(double op1, double op2) {
        return aplicar(new OperadorMultiplicacion(op1, op2));
    }


    private double aplicar(OperadorBinario operadorBinario) {
        operadorBinario.ejecutarOperacion();
        historicoSimple.add(operadorBinario);
        return operadorBinario.getResultado();
    }

    public HistoricoSimple getHistoricoSimple() {
        return historicoSimple;
    }

    public void setHistoricoSimple(HistoricoSimple historicoSimple) {
        this.historicoSimple = historicoSimple;
    }
}
