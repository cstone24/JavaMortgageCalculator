package mortgagecalculator;

import java.text.NumberFormat;

public class MortgageReport {
	
	private MortgageCalculator calculator;
	private final NumberFormat currency;
	
	public MortgageReport(MortgageCalculator calculator) {
		super();
		this.calculator = calculator;
		currency = NumberFormat.getCurrencyInstance();
	}

	public void printMortgage() {
		double mortgage = calculator.calculateMortgage();
		String mortgageFormatted = currency.format(mortgage);
		System.out.print("\nMORTGAGE\n---------\nMonthly Payments: " + mortgageFormatted);
	}

	public void printPaymentSchedule() {
		System.out.print("\n\nPAYMENT SCHEDULE\n----------------\n");
		for (double balance : calculator.getRemainingBalances()) {
			System.out.println(currency.format(balance));
		}
	}
}
