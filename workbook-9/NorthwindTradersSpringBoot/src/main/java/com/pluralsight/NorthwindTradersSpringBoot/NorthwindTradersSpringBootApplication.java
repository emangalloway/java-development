package com.pluralsight.NorthwindTradersSpringBoot;

import com.pluralsight.NorthwindTradersSpringBoot.models.Product;
import com.pluralsight.NorthwindTradersSpringBoot.services.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class NorthwindTradersSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(NorthwindTradersSpringBootApplication.class, args);
		//Preview all beans in application
		String[] allBeanNames = context.getBeanDefinitionNames();
		for (String beanName : allBeanNames) {
			System.out.println(beanName);
		}
		// Manually inject beans
		ProductService productService = context.getBean(ProductService.class);

		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out.println("========== Ledger Application ==========");
			System.out.println("1. List Transactions");
			System.out.println("2. Add Transaction");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Consumes the newline character after the integer input.

			// Handling user's choice with switch-case.
			switch (choice) {
				case 1:listProducts(productService);
					break;
				case 2:addProduct(scanner,productService);
					break;
				case 0:
					System.out.println("Exiting...");
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 0);
		scanner.close();
	}
	private static void listProducts(ProductService productService){
		System.out.println("=========================");
		List<Product> products = productService.getAll();
		for (Product product : products) {
			System.out.println(products);
		}
		System.out.println();
	}
	private static void addProduct(Scanner scanner, ProductService productService){
		System.out.println("Enter product name: ");
		String name = scanner.nextLine();
		System.out.println("Enter category ID: ");
		int categoryID = scanner.nextInt();
		System.out.println("Enter product price: ");
		double productPrice = scanner.nextDouble();

		Product product = new Product(categoryID,name,productPrice);
		Product newProduct = productService.add(product);
		System.out.println(newProduct);
	}
}
