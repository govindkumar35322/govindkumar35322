package Pay.fund.validation;

import Pay.fund.bank.User;

public interface UserServices {
	public void Login();
	public void Logout(User user);
	public void CreateAccount();
	public void AccountDetail();
	public void AccountActivity();
	public void FundTransfer( int amount,int pin,User fromUser,User toUser);
	public void Withdraw(User user);
	public void changePin(User user);
	public void createLog(User user, String message);
	public void checkAccount(User fromUser,User toUser);

}
