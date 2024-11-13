package com.sp.service;

import com.sp.entity.BankAccount;

public interface IBankAccountMngmtService {

	public String openBankAccount(BankAccount account);

	public String withdrawBalance(long acno, double amnt);

	public BankAccount showAccByAcNo(long acno);
}
