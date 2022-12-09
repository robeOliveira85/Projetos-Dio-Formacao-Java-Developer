package banco.oceleolimite.beto;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();
        cc.depositar(1500);

        cc.transferir(600,poupanca);
        poupanca.sacar(200.50);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
