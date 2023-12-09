package pet.store.controller.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import pet.store.entity.Customer;


@Data
@NoArgsConstructor
public class CustomerData {
	private Long customerId;
	private String customerFirstName;
	private String customerLastName;
	private String customerEmail;
	
	public CustomerData(Customer customer) {
		customerId = customer.getCustomerId();
		customerFirstName = customer.getCustomerFirstName();
		customerLastName = customer.getCustomerLastName();
		customerEmail = customer.getCustomerEmail();
		
		
	}
	
}
