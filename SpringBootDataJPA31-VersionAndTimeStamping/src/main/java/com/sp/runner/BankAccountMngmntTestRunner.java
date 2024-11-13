package com.sp.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sp.entity.BankAccount;
import com.sp.service.BankAccountMngmtService;

@Component
public class BankAccountMngmntTestRunner implements CommandLineRunner {

	@Autowired
	private BankAccountMngmtService bankAccountMngmtService;

	@Override
	public void run(String... args) throws Exception {

		// Open Account

//		BankAccount account = new BankAccount();
//		account.setAcHolderName("Sambit Panda");
//		account.setBalance(40000.00);
//
//		try {
//			String msg = bankAccountMngmtService.openBankAccount(account);
//			System.out.println(msg);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// WithDarw Balance
		try {
			String msgString = bankAccountMngmtService.withdrawBalance(2000000002, 5000);
			System.out.println(msgString);
			BankAccount account = bankAccountMngmtService.showAccByAcNo(2000000002);
			System.out.println("Account is Modified for: " + account.getModificationCount() + "\n ....Opened On : "
					+ account.getOpeningDate() + "\n Lastly Opreated on Account on : "
					+ account.getLastlyOperatedDate());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
