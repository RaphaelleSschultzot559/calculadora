package com.example.project.operadores;

public class OperadorSuma extends OperadorBinario {

    private static final String OPERADOR = "+";

    public OperadorSuma(double op1, double op2) {
        super(OPERADOR, op1, op2);
    }

    @Override
    public void ejecutarOperacion() {
        this.setResultado(getOp1() + getOp2());
    }

}
