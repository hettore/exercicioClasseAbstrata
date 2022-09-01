package entities;

public class PessoaFisica extends TaxPayer {

	private Double healthExpenditures;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double total = 0.0;
		double saude = 0.0;

		if (getAnualIncome() < 20000.00) {
			total = getAnualIncome() * 0.15;
		} else {
			total = getAnualIncome() * 0.25;
		}

		if (healthExpenditures != 0.0) {
			saude = healthExpenditures * 0.50;
		}
		return total - saude;
	}

}
