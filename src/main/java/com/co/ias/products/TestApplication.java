package com.co.ias.products;

import com.co.ias.products.products.application.domain.Product;
import com.co.ias.products.products.application.domain.ProductDiscount;
import com.co.ias.products.products.application.domain.ProductId;
import com.co.ias.products.products.application.domain.ProductName;
import com.co.ias.products.products.application.domain.ProductPrice;
import com.co.ias.products.products.application.domain.TypeOfProduct;
import com.co.ias.products.products.application.models.ProductDTO;

public class TestApplication {

    private static void testProduct() {
        try {
            ProductId productId = new ProductId(123);
            ProductName productName = new ProductName("headphones");
            TypeOfProduct typeOfProduct = new TypeOfProduct(2);
            ProductPrice productPrice = new ProductPrice(100);
            ProductDiscount productDiscount = new ProductDiscount(80);

            /* Product product = */new Product(productId, productName, typeOfProduct, productPrice, productDiscount);

            ProductDTO productDTO = new ProductDTO(1, 1, "headphones", 100, 80);

            /* Product product2 = */productDTO.toDomain();
        } catch (NullPointerException | IllegalArgumentException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }

    public static void main(String[] args) {
        testProduct();
    }
}
