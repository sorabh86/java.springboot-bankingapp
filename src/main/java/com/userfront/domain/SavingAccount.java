/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.userfront.domain;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Sorabh86 <ssorabh.ssharma@gmail.com>
 */
public class SavingAccount {
    private Long id;
    private int accountNumber;
    private BigDecimal accountBalance;
    
    private List<SavingTransaction> savingTransactionList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<SavingTransaction> getPrimaryTransactionList() {
        return savingTransactionList;
    }

    public void setPrimaryTransactionList(List<SavingTransaction> savingTransactionList) {
        this.savingTransactionList = savingTransactionList;
    }
    
    
}
