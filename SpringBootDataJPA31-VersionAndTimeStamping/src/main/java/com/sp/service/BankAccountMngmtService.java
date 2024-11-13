package com.sp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.entity.BankAccount;
import com.sp.repository.iBankAccountRepostionry;

@Service("BankAccountService")
public class BankAccountMngmtService implements IBankAccountMngmtService {

	@Autowired
	private iBankAccountRepostionry iBankAccountRepostionry;

	@Override
	public String openBankAccount(BankAccount account) {
		long id = iBankAccountRepostionry.save(account).getAcno();
		return "Bank Account is opened Id Value : " + id;
	}

	@Override
	public String withdrawBalance(long acno, double amnt) {
		BankAccount account = iBankAccountRepostionry.findById(acno)
				.orElseThrow(() -> new IllegalArgumentException("Accont Not Found"));
		if (account != null) {
			account.setBalance(account.getBalance() - amnt);
			iBankAccountRepostionry.save(account);
			return "Money Is With Drawn";
		}
		return "Account Not Found";
	}

	@Override
	public BankAccount showAccByAcNo(long acno) {

		return iBankAccountRepostionry.findById(acno)
				.orElseThrow(() -> new IllegalArgumentException("Invalid Account No"));
	}

}
