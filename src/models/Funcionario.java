package models;

public class Funcionario {
    private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private boolean ativo;
    private double valorHora;
    private int horasTrabalhadas;
    private int horasExtra;

    public Funcionario(String nome, String cpf, String endereco, String email, boolean ativo, double valorHora, int horasTrabalhadas, int horasExtra) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.ativo = ativo;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
        this.horasExtra = horasExtra;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public int getHorasExtra() {
        return horasExtra;
    }
}