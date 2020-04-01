package com.example.project.operadores;

public abstract class OperadorBinario {

    private final String operacion;
    private final double op1;
    private final double op2;

    private double resultado;

    public OperadorBinario(String operacion, double op1, double op2) {
        this.operacion = operacion;
        this.op1 = op1;
        this.op2 = op2;
    }

    public String getOperacion() {
        return operacion;
    }

    public double getOp1() {
        return op1;
    }

    public double getOp2() {
        return op2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public abstract void ejecutarOperacion();

    @Override
    public String toString() {
        return "OperadorBinario{" +
                "operacion='" + operacion + '\'' +
                ", op1=" + op1 +
                ", op2=" + op2 +
                ", resultado=" + resultado +
                '}';
    }
}
