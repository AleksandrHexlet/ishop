package com.edu.ishop.entity;

import jakarta.persistence.*;

@Entity

public class ProductCustomerOrder {
    @Id
    int id;
    @MapsId("id")
    @ManyToOne
    private Product product;
    @ManyToOne
    @MapsId("id")
    private CustomerOrder customerOrder;
    private int count;




    public ProductCustomerOrder() {
    }

    public ProductCustomerOrder(int id, Product product, CustomerOrder customerOrder, int count) {
        this.id = id;
        this.product = product;
        this.customerOrder = customerOrder;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }

    public int getCount() {
        return count;
    }

    public void setCustomerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }
}
