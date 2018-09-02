/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.userfront.domain;

import java.util.List;

/**
 *
 * @author Sorabh86 <ssorabh.ssharma@gmail.com>
 */
public class User {
    private Long userId;
    private String username;
    private String password;
    private String firstName;
    private String lastName; 
    private String email;
    private String phone;
    
    private boolean enable=true;
    
    private PrimaryAccount primaryAccount;
    
    private SavingAccount savingsAccount;
    
    private List<Appointment> appointmentList;
    
    private List<Recipient> recipientList;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public PrimaryAccount getPrimaryAccount() {
        return primaryAccount;
    }

    public void setPrimaryAccount(PrimaryAccount primaryAccount) {
        this.primaryAccount = primaryAccount;
    }

    public SavingAccount getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(SavingAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    public List<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(List<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }

    public List<Recipient> getRecipientList() {
        return recipientList;
    }

    public void setRecipientList(List<Recipient> recipientList) {
        this.recipientList = recipientList;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", username=" + username + ", password=" + password + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone + ", enable=" + enable + ", primaryAccount=" + primaryAccount + ", savingsAccount=" + savingsAccount + ", appointmentList=" + appointmentList + ", recipientList=" + recipientList + '}';
    }
    
}
