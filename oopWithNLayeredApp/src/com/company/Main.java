package com.company;

import com.company.business.ProductManager;
import com.company.core.logging.DatabaseLogger;
import com.company.core.logging.FileLogger;
import com.company.core.logging.Logger;
import com.company.core.logging.MailLogger;
import com.company.dataAccess.JdbcProductDao;
import com.company.entities.Product;

public class Main {

    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "Iphone Xr", 10000);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
        productManager.add(product1);
    }
}
