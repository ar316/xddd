import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {


    Cliente arnold = new Cliente("arnold","1007679575");
	AccountBank cuenta_arnold = new AccountBank(arnold,"03187881458", 10000);
	
    while(true) {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Depositar\n2.Transferir\n3.Saldo\n4.Salir"));
        switch(opcion) {
            case 1:
                int monto = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Depositar"));
                cuenta_arnold.Depositar(monto);
                break;
            case 2:
                
                break;
            case 3:
                JOptionPane.showMessageDialog(null, cuenta_arnold.getSaldo());
                break;
            case 4:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida");
                break;
        }
  
    
    }
}
}

