package session_10_oop_concepts.practice.bank_account;

import session_10_oop_concepts.practice.bank_account.Address;
import session_10_oop_concepts.practice.bank_account.BankAccount;
import session_10_oop_concepts.session_10_oop_concepts.practice.bank_account.Address;
import session_10_oop_concepts.session_10_oop_concepts.practice.bank_account.BankAccount;

import java.util.UUID;

public class User {

    private UUID id;
    private String firstName;
    private String lastName;
    private Address address; //composition - user HAS-A Address
    private BankAccount bankAccount;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
