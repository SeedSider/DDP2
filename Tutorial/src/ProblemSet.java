class BankAccount
{
	private String name;
	private int balance;

	public BankAccount()
	{
		System.out.println("Panggil BankAccount()");
		name = "ABC";
		balance = 0;
	}

	public BankAccount(String name, int balance)
	{
		System.out.println("Panggil BankAccount(String,int)");
		this.name = name;
		this.balance = balance;
	}

	public void deposit(int amount)
	{
		balance = balance + amount;
	}

	public void withdraw(int amount)
	{
		if (balance >= amount)
			balance = balance - amount;
	}

	public void cetakInfo()
	{
		System.out.println(name + " punya saldo Rp "+ balance);
	}

}
public class ProblemSet {
	public static void main(String[] args)
	{
		BankAccount account = new BankAccount("Morgan SM*SH", 100000000);
		BankAccount account2 = new BankAccount("Prakoso Adi Nugroho",0);

		account.cetakInfo(); // Cetak ?
		account2.cetakInfo(); // Cetak ?

//		account.mystery(account2, 10000);
		account.cetakInfo(); // Cetak ?
		account2.cetakInfo(); // Cetak?
		}
	}