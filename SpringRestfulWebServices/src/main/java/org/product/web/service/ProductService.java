package org.product.web.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.product.web.bean.Product;

/*
 * It is just a helper class which should be replaced by database implementation.
 * It is not very well written class, it is just used for demonstration.
 */
public class ProductService {

 static HashMap<Integer,Product> productIdMap=getProductIdMap();


 public ProductService() {
  super();

  if(productIdMap==null)
  {
	  productIdMap=new HashMap<Integer,Product>();
  // Creating some objects of Country while initializing
   Product hpProduct=new Product(1,"Desktop","HP",10000);
   Product dellProduct=new Product(2,"Laptop","DELL",15000);
   Product lenovoProduct=new Product(3,"Laptop","LENOVO",17000);
   Product appleProduct=new Product(4,"Laptop","APPLE",25000);
  
   productIdMap.put(1,hpProduct);
   productIdMap.put(4,appleProduct);
   productIdMap.put(3,lenovoProduct);
   productIdMap.put(2,dellProduct);
  }
 }

 public List<Product> getAllProducts()
 {
  List<Product> products = new ArrayList<Product>(productIdMap.values());
  return products;
 }

 public Product getProduct(int id)
 {
  Product product= productIdMap.get(id);
  return product;
 }
 public Product addProduct(Product product)
 {
  product.setId(getMaxId()+1);
  productIdMap.put(product.getId(), product);
  return product;
 }
 
 public Product updateProduct(Product product)
 {
  if(product.getId()<=0)
   return null;
  productIdMap.put(product.getId(), product);
  return product;

 }
 public void deleteProduct(int id)
 {
  productIdMap.remove(id);
 }

 public static HashMap<Integer, Product> getProductIdMap() {
  return productIdMap;
 }
 

 // Utility method to get max id
 public static int getMaxId()
 {   int max=0;
 for (int id:productIdMap.keySet()) {  
  if(max<=id)
   max=id;

 }  
 return max;
 }
}

