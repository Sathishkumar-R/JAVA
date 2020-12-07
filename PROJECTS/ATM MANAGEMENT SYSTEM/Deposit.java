import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// Deposit.java
// Represents a deposit ATM transaction

public class Deposit extends Transaction
{
   private double amount; // amount to deposit
   private Keypad keypad; // reference to keypad
   private Deposit depositSlot; // reference to deposit slot
   private final static int CANCELED = 0; // constant for cancel option

   // Deposit constructor
   public Deposit(int userAccountNumber, Screen atmScreen, 
      BankDatabase atmBankDatabase, Keypad atmKeypad, 
      Deposit atmDepositSlot)
   {
      // initialize superclass variables
      super(userAccountNumber, atmScreen, atmBankDatabase);

      // initialize references to keypad and deposit slot
      keypad = atmKeypad;
      depositSlot = atmDepositSlot;
   } // end Deposit constructor

   // perform transaction
   @Override
   public void execute()
   {
	   promptForDepositAmount();
   }
   public void makedeposit(double amount){
      BankDatabase bankDatabase = getBankDatabase(); // get reference
      Screen screen = getScreen(); // get reference
       // get deposit amount from user

      // check whether user entered a deposit amount or canceled
      if (amount != CANCELED)
      {
         // request deposit envelope containing specified amount
         screen.messageJLabel2.setText( "\nPlease insert a deposit envelope containing " + amount);

         // receive deposit envelope
         boolean envelopeReceived = depositSlot.isEnvelopeReceived();

         // check whether deposit envelope was received
         if (envelopeReceived)
         {  
        	 screen.messageJLabel2.setText("\nYour envelope has been " + 
               "received.\nNOTE: The money just deposited will not ");
              screen.messageJLabel3.setText("be available until we verify the amount of any " +
               "enclosed cash and your checks clear.");
            
            // credit account to reflect the deposit
            bankDatabase.credit(getAccountNumber(), amount); 
         } // end if
         else // deposit envelope not received
         {
        	 screen.messageJLabel2.setText("\nYou did not insert an " +
               "envelope, so the ATM has canceled your transaction.");
         } // end else
      } // end if 
      else // user canceled instead of entering amount
      {
    	  screen.messageJLabel2.setText("\nCanceling transaction...");
      } // end else
   } // end method execute

   private boolean isEnvelopeReceived() {
	// TODO Auto-generated method stub
	return false;
}

// prompt user to enter a deposit amount in cents 
   private void promptForDepositAmount()
   {
      Screen screen = getScreen(); // get reference to screen

      // display the prompt
      screen.CreateDepositGUI(); // receive input of deposit amount
      screen.Mainframe.add( keypad.addkeypad(), BorderLayout.CENTER);
      Depositcheck check1 = new Depositcheck();  
      keypad.BEnter.addActionListener( check1 );
      screen.Mainframe.revalidate();
      // check whether the user cancelled or entered a valid amount
      
          // return dollar amount 
      } // end else
   // end method promptForDepositAmount

   public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

private class Depositcheck implements ActionListener
   {
      public void actionPerformed( ActionEvent e )
      {
   	   
         @SuppressWarnings("static-access")
		double input = Integer.parseInt( screen.getInputfield2().getText() );
         double amount = input / 100;
        
         makedeposit(amount);
       
      }
   }
}
 // end class Deposit
