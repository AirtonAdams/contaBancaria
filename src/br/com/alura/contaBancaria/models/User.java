package br.com.alura.contaBancaria.models;

public class User {
    private String name;
    private String typeOfAccount;
    private double openingBalance;
    private double balance;
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(String typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    public double getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(double openingBalance) {
        this.openingBalance = openingBalance;
        this.balance = openingBalance;
    }

    public double getBalance() {
        return balance;
    }

    public String getMessage() {
        return message;
    }

    public String balanceInquiry() {
        return this.message = "O saldo atual é de R$%.2f".formatted(this.balance);
    }

    public String receivesValue(double receivesValue) {
        this.balance += receivesValue;
        return this.message = """
                Valor recebido: R$%.2f
                saldo atual: R$%.2f""".formatted(receivesValue, this.balance);
    }

    public String sendValue(double sendValue) {
        if(sendValue > this.balance) {
            return this.message = "Saldo insuficiente na conta";
        } else {
            this.balance -= sendValue;
            return this.message = """
                    Transfrência efetuada!
                    Saldo restante: R$%.2f
                    """.formatted(this.balance);
        }
    }
}