package classes;

public class Funcionario {
	private String nome;
	private Integer qtdHora;
	private Double valorHora;
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, Integer qtdHora, Double valorHora) {
		super();
		this.nome = nome;
		this.qtdHora = qtdHora;
		this.valorHora = valorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQtdHora() {
		return qtdHora;
	}

	public void setQtdHora(Integer qtdHora) {
		this.qtdHora = qtdHora;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}
	
	public double pagamento() {
		return qtdHora * valorHora;
	}
	
	
}
