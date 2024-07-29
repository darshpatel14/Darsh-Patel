class BankAccount {
  BankCustomer forCust;
  double balance;
  
  BankAccount (BankCustomer forCust, double balance) {
    this.forCust = forCust;
    this.balance = balance;
  }
}