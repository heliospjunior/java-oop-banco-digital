
public class Main {

	public static void main(String[] args) {
		
		Cliente helio  = new Cliente();
		helio.setNome("Hélio");
		
		Conta cc = new ContaCorrente(helio);
		cc.depositar(100);
		
		
		Conta poupanca = new ContaPoupanca(helio);
		poupanca.depositar(50);
		
		cc.transferir(75, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
