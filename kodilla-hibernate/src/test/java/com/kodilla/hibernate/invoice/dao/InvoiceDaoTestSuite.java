package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Product1");
        Product product2 = new Product("Product2");
        Product product3 = new Product("Product3");
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        Invoice invoice1 = new Invoice("1");
        Item item1 = new Item( new BigDecimal(100.00), 5);
        Item item2 = new Item( new BigDecimal(50.00), 3);
        Item item3 = new Item( new BigDecimal(20.00), 8);

        product1.getItems().add(item1);
        item1.setProduct(product1);
        product2.getItems().add(item2);
        item2.setProduct(product2);
        product3.getItems().add(item3);
        item3.setProduct(product3);

        invoice1.getItems().add(item1);
        item1.setInvoice(invoice1);
        invoice1.getItems().add(item2);
        item2.setInvoice(invoice1);
        invoice1.getItems().add(item3);
        item3.setInvoice(invoice1);
        invoiceDao.save(invoice1);

        //When
        int product1Id = product1.getId();
        int product2Id = product2.getId();
        int product3Id = product3.getId();
        int invoice1Id = invoice1.getId();
        long productsCount = productDao.count();
        long invoicesCount = invoiceDao.count();
        long itemsCount = itemDao.count();

        //Then
        Assert.assertEquals(3, productsCount);
        Assert.assertEquals(1, invoicesCount);
        Assert.assertEquals(3, itemsCount);

        //CleanUp
        try {
            invoiceDao.delete(invoice1Id);
            productDao.delete(product1Id);
            productDao.delete(product2Id);
            productDao.delete(product3Id);

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
