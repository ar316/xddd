import javax.swing.JOptionPane;

public class AccountBank {
	private Cliente cliente;
	private String AccountNumber;
	private double Saldo;
	
	public AccountBank(Cliente cliente, String accountNumber, double saldo) {
		super();
		this.cliente = cliente;
		AccountNumber = accountNumber;
		Saldo = saldo;
	}

	@Override
	public String toString() {
		return "AccountBank [cliente=" + cliente + ", AccountNumber=" + AccountNumber + ", Saldo=" + Saldo + "]";
	}

	public void Depositar(int monto) {
		if(monto >= 0 )
		Saldo += monto;
		else{
			JOptionPane.showConfirmDialog(null, "no se puede depositar, saldo incorrecto");
		}
		
	}

    public Object getSaldo() {
        return Saldo;
    }
	
	
	

	


}
