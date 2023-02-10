package com.bankapp.controller;

import java.util.Scanner;
import com.bankapp.user.User;

public class Controller {
	
	static User user = new User();
	static Controller controller = new Controller();
	static CreateAccount createAccount = new CreateAccount();
	static BalanceInquiry balanceInquiry = new BalanceInquiry();
	static AccountDetails accountDetails = new AccountDetails();
	static CreditAmount creditAmount = new CreditAmount();
	static WithdrawAmount withdrawAmount = new WithdrawAmount();
	
	public static void main(String[] args) {
		modeCall();
	}

	public static void modeCall() {
		try {
			Scanner scn = new Scanner(System.in);
			System.out.println("*******************************************");
			System.out.println(
					"Mode:\n Create Account 1\n Balance inquiry 2 \n Account Details 3\n Credit Amount 4\n Withdraw Amount 5 \n Exit press: 6");
			String str = scn.next();
			if (str.contentEquals("1")) {
				createAccount.createAccount();
			} else if (str.contentEquals("2") && !user.name.isEmpty()) {
				balanceInquiry.balanceInquiry();
			} else if (str.contentEquals("3") && !user.name.isEmpty()) {
				accountDetails.accountDetails();
			} else if (str.contentEquals("4") && !user.name.isEmpty()) {
				creditAmount.creditAmount();
			} else if (str.contentEquals("5") && !user.name.isEmpty()) {
				withdrawAmount.withdrawAmount();
			} else if (str.contentEquals("6")) {
				System.out.println("Thanks for Using Bank application");
			} else {
				System.out.println("Choose correct Mode: ");
				modeCall();
			}
		} catch (NullPointerException e) {
			System.out.println("You have to create account, User does not exist");
			modeCall();
		}
	}
}
