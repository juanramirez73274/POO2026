public class BankAccount {
    private final int accountNumber;
    private String accountHolder;
    private int balance;
    

    public BankAccount(String accountHolder, int accountNumber, int balance){
        if(!isValidAccountHolder(accountHolder)){
            throw new IllegalArgumentException("el nombre no puede estar vacio");
        }
    
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public boolean deposit(int amount){
        if(amount<=0){
            System.out.println("el monto de deposito debe ser mayor que 0"); 
            return false; 
        }
        this.balance += amount;
        return true;
    }
    public boolean withdrawals(int amount){
        if(amount<=0 || amount>balance){
            System.out.println("no se puede hacer el retiro de la cuenta. Porque excede el saldo o porque el monto a retirar es menor o igual a 0");
            return false;
        }
        this.balance -= amount;
        return true;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    
    public String getAccountHolder(){
        return accountHolder;
    }
    public int getBalance(){
        return balance;
    }
    public boolean setAccountHolder(String accountHolder){
        if(isValidAccountHolder(accountHolder)){
            this.accountHolder=accountHolder;
            return true;
        }
        return false;
    }

    public boolean isValidAccountHolder(String accountHolder){
        return accountHolder != null && !accountHolder.trim().isEmpty();
    }
}
//Una aplicación bancaria necesita representar una cuenta de la cual se conoce el número de cuenta (account number), 
//el nombre de su titular (account holder) y el saldo disponible (balance).
//El número de cuenta identifica la cuenta y no debe cambiar una vez establecido.
//El saldo no puede modificarse arbitrariamente. Únicamente puede aumentar mediante depósitos (deposits) y disminuir mediante
//retiros (withdrawals).
//Un depósito solamente puede realizarse cuando el valor es mayor que cero. Un retiro solamente puede realizarse cuando
//el valor solicitado es mayor que cero y existe saldo suficiente.