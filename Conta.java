package mainPackage;

public class Conta {
	
	private double saldo;
	private double investido;
	private double salario;
	private double guardado;
	
	public Conta()
	{
		this.saldo = 0;
		this.investido = 0;
	}
	
	
		
	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public double getInvestido() {
		return investido;
	}



	public void setInvestido(double investido) {
		this.investido = investido;
	}



	public double getGuardado() {
		return guardado;
	}



	public void setGuardado(double guardado) {
		this.guardado = guardado;
	}

	
	public double getSalario()
	{
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}



	public boolean valorEmConta(double cashIn)
	{
		if(cashIn > 0)
		{
			this.saldo += cashIn;
			return true;
		}
		return false;
	}
	
	public boolean valorSalario(double salarioIn)
	{
		if(salarioIn > 0) 
		{
		this.salario += salarioIn;
		this.saldo += salarioIn;
		return true;
		}
		return false;
	}

	
	public double salarioXMeses(int meses)
	{
		guardado = 0;
		for(int i = 0; i < meses; i++)
		{
			guardado += salario;
		}
		return guardado;
	}
	
	public double guardado(int meses, double guardadoPorMes)
	{
		guardado = 0;
		for(int i = 0; i < meses; i++)
		{
			guardado += guardadoPorMes;
		}
		return guardado;
	}
	
}

	
