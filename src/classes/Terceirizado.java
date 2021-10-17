package classes;

public class Terceirizado extends Funcionario{
	private Double custoAdicional;
	
	public Terceirizado () {
		super();
	}

	public Terceirizado(String nome, Integer qtdHora, Double valorHora, Double custoAdicional) {
		super(nome, qtdHora, valorHora);
		this.custoAdicional = custoAdicional;
	}

	public Double getCustoAdicional() {
		return custoAdicional;
	}

	public void setCustoAdicional(Double custoAdicional) {
		this.custoAdicional = custoAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + custoAdicional * 1.1;
	}
	
	
}
