package org.product.web.controller;

import java.util.List;

import org.product.web.bean.Product;
import org.product.web.service.ProductService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	ProductService productService = new ProductService();

	@RequestMapping(value = "/api/products", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Product> getProducts() {
		List<Product> listOfProducts = productService.getAllProducts();
		return listOfProducts;
	}

	@RequestMapping(value = "/api/product/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Product getProductId(@PathVariable int id) {
		return productService.getProduct(id);
	}

	@RequestMapping(value = "/api/products", method = RequestMethod.POST, headers = "Accept=application/json")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}

	@RequestMapping(value = "/api/products", method = RequestMethod.PUT, headers = "Accept=application/json")
	public Product updateCountry(@RequestBody Product product) {
		return productService.updateProduct(product);

	}

	@RequestMapping(value = "/api/product/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteProduct(@PathVariable("id") int id) {
		productService.deleteProduct(id);
    }	
}
