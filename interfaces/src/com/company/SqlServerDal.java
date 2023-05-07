package com.company;

public class SqlServerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Sql server eklendi");
    }
}
