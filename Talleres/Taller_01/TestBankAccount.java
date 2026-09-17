public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Ana María Gómez", 1001, 500);
        System.out.println("Cuenta: #" + account.getAccountNumber() + " | Titular: " + account.getAccountHolder() + " | Saldo Inicial: $" + account.getBalance());

        System.out.println("\n--- Pruebas de Depósito ---");
        System.out.println("¿Depósito válido ($200)?: " + account.deposit(200));   // true
        System.out.println("¿Depósito cero ($0)?: " + account.deposit(0));
        System.out.println("¿Depósito negativo (-$50)?: " + account.deposit(-50));
        System.out.println("Saldo actual: $" + account.getBalance());

        System.out.println("\n--- Pruebas de Retiro ---");
        System.out.println("¿Retiro válido ($300)?: " + account.withdrawals(300));
        System.out.println("¿Retiro superior al saldo ($1000)?: " + account.withdrawals(1000));
        System.out.println("¿Retiro negativo (-$100)?: " + account.withdrawals(-100));
        System.out.println("¿Retiro de cero ($0)?: " + account.withdrawals(0));

        System.out.println("\n--- Estado Final ---");
        System.out.println("Titular: " + account.getAccountHolder());
        System.out.println("Saldo final conservado correctamente: $" + account.getBalance());
    }
}