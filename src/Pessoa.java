/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * //alt inset construtor, genreter 
 * //alt inset construtor, genreter 
 * 
 * @author u07881974109
 */
public class Pessoa {

    private String nome;
    private int idade; //atributos

    public Pessoa() {  // construtor e o mesmo nome da classe
        nome = "";
        idade = 0;
    }

    public Pessoa(String nome, int idade) { // mesmo nome com para metro diferente é sobre carg.
        this.nome = nome;
        this.idade = idade;
    }

    public void aniversario() { // metodos
        setIdade(getIdade() + 1);
    }
     // os atalhos e psvm + alt+espaço
    public static void main(String[] args) { // a msm coisa so que e sobre carga de construtores+
        Pessoa pessoa = new Pessoa("marcos", 53);
        pessoa.aniversario();
        System.out.println("nome:" + pessoa.getNome());
        System.out.println("idade:" + pessoa.getIdade());

    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

}
