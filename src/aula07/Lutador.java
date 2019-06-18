package aula07;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Metodos Publicos
    public void apresentar() {
        System.out.println("Lutador "+ this.getNome());
        System.out.println("Origem "+ this.getNacionalidade());
        System.out.println(this.getIdade() + " Anos");
        System.out.println(this.getAltura() + "m de altura");
        System.out.println(this.getPeso() + "Kg");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: "+this.getEmpates());
    }
    public void status() {
        System.out.print(this.getNome());
        System.out.println(" é um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " Vitorias");
        System.out.println(this.getDerrotas() +" Derrotas");
        System.out.println(this.getEmpates() +" Empates");
    }
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    // Metodos Especiais (Construtor)

    public Lutador(String nome, String nacionalidade, int idade, float altura,
                   float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    //Metodos Especiais (Geters e Setters)

    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    private float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        //this.categoria = categoria;
        if(this.peso < 52.2)
            this.categoria = " Invalido";
        else if (this.peso <= 70.3){
            this.categoria = " Leve";
        }
        else if (this.peso <= 83.9){
            this.categoria = " Medio";
        }
        else if(this.peso <= 120.2) {
            this.categoria = "Pesado";
        }
        else {
            this.categoria =" Invalido";
        }
    }
    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
