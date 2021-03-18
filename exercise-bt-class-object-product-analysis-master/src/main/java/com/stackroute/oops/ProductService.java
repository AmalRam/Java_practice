package com.stackroute.oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
    Class for Analyzing the products present in ProductRepository
 */
public class ProductService {




    public static void main(String[]args){

        Scanner scan=new Scanner(System.in);

        ProductService prdS = new ProductService();
        Product[] categoryProducts = new Product[10];
        Product  maxPriceProducts= new Product();

        System.out.println("===================================");

        System.out.println("enter the product code of the product you want to search");
        int pcode=scan.nextInt();
        String searchProduct=prdS.findProductNameByCode(pcode);
        System.out.println("Product Name:"+searchProduct);

        System.out.println("===================================");

        System.out.println("enter the category of the product: ");
        String pcate=scan.next();
        maxPriceProducts=prdS.findMaxPriceProductInCategory(pcate);
        System.out.println("Max Price:"+maxPriceProducts.getPrice());

        System.out.println("===================================");

        System.out.println("Enter the category for showing its products:");
        String prod=scan.next();
        categoryProducts=prdS.getProductsByCategory(prod);
       System.out.println("\n Products Includes: -");
       if(categoryProducts.length==0)
           System.out.println(" Null/ Invalid Category");

       else{
                for (int i=0;i<categoryProducts.length;i++)
                    System.out.println(categoryProducts[i].getName());
            }

        System.out.println("===================================");

    }


    public static String findProductNameByCode ( int productCode){

        String searchedProduct = null;
        final Product[] prd= ProductRepository.getProducts();
        for (Product product : prd) {
            if (product.getProductCode() == productCode) {
                searchedProduct = product.getName();

            }
        }
        return searchedProduct;
    }

    /*
        Returns the Product with maximum price in a given category
     */

    public Product findMaxPriceProductInCategory(String category) {
        final Product[] prd = ProductRepository.getProducts();
        Product maxProduct=new Product();
        double maxPrice = 0;
        for (Product product : prd) {
            if (product.getCategory().equalsIgnoreCase(category) && product.getPrice() >= maxPrice) {
              maxPrice = product.getPrice();
                maxProduct = product;
            }

        }
        return maxProduct;
    }

    /*
        Returns a array of products for a given category
     */
    public Product[] getProductsByCategory(String category) {
        final Product[] products = ProductRepository.getProducts();
        int count = 0;
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                count++;
            }
        }

        Product[] categoryProducts = new Product[count];
        count = 0;
        for (Product product : products) {
           // System.out.println(product.toString());
            if (product.getCategory().equalsIgnoreCase(category)) {
                categoryProducts[count++] = product;
               //  System.out.println( categoryProducts.toString());
            }
        }
     //   System.out.println(categoryProducts.toString());
        return categoryProducts;
    }
}