package com.userfront.service;

import java.util.List;

import com.userfront.domain.PrimaryAccount;
import com.userfront.domain.PrimaryTransaction;
import com.userfront.domain.SavingsAccount;
import com.userfront.domain.SavingsTransaction;

public interface TransactionService {

	public List<PrimaryTransaction> findPrimaryTransactionList(String username);
	
	public List<SavingsTransaction> findSavingsTransactionList(String username);
	
	public void savePrimaryDepositTransaction(PrimaryTransaction primaryTransaction);
	
	public void saveSavingsDepositTransaction(SavingsTransaction savingsTransaction);

	void savePrimaryWithdrawTransaction(PrimaryTransaction primaryTransaction);
	
	void saveSavingsWithdrawTransaction(SavingsTransaction savingsTransaction);

	public void betweenAccountsTransfer(String transferFrom, String transferTo, String amount,
			PrimaryAccount primaryAccount, SavingsAccount savingsAccount) throws Exception;
	
}
