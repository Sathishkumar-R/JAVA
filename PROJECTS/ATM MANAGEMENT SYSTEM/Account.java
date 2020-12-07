// Account.java
// Represents a bank account

public class Account 
{
   private int accountNumber; // account number
   private int pin; // PIN for authentication
   private double availableBalance; // funds available for withdrawal
   private double totalBalance; // funds available + pending deposits.
   private int admin;
   private String username;

   // Account constructor initializes attributes
   public Account(String Username, int theAccountNumber, int thePIN, 
      double theAvailableBalance, double theTotalBalance, int isadmin)
   {
	   setUsername(Username);
      setAccountNumber(theAccountNumber);
      setPin(thePIN);
      setAvailableBalance(theAvailableBalance);
      setTotalBalance(theTotalBalance);
      setAdmin(isadmin);
   } // end Account constructor

   // determines whether a user-specified PIN matches PIN in Account
   public boolean validatePIN(int userPIN)
   {
      if (userPIN == getPin())
         return true;
      else
         return false;
   } // end method validatePIN
   
   // returns available balance
   public double getAvailableBalance()
   {
      return availableBalance;
   } // end getAvailableBalance

   // returns the total balance
   public double getTotalBalance()
   {
      return totalBalance;
   } // end method getTotalBalance

   // credits an amount to the account
   public void credit(double amount)
   {
      setTotalBalance(getTotalBalance() + amount); // add to total balance
   } // end method credit

   // debits an amount from the account
   public void debit(double amount)
   {
      setAvailableBalance(getAvailableBalance() - amount); // subtract from available balance
      setTotalBalance(getTotalBalance() - amount); // subtract from total balance
   } // end method debit

   // returns account number
   public int getAccountNumber()
   {
      return accountNumber;  
   } // end method getAccountNumber
   
   public int getISadmin()
   {
	   return getAdmin();  
   }
   
   public int GetPin(){
	   return getPin();
   }

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}

public int getPin() {
	return pin;
}

public void setPin(int pin) {
	this.pin = pin;
}

public void setAvailableBalance(double availableBalance) {
	this.availableBalance = availableBalance;
}

public void setTotalBalance(double totalBalance) {
	this.totalBalance = totalBalance;
}

public int getAdmin() {
	return admin;
}

public void setAdmin(int admin) {
	this.admin = admin;
}
   
  
   
} // end class Account


