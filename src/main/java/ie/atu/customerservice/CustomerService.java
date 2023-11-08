package ie.atu.customerservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomerService {
    private ArrayList<CustomerDetails>customerDetails = new ArrayList<CustomerDetails>();
    public void CreateCustomerDetails(CustomerDetails customerDetails){
        customerDetails.add(customerDetails);
        System.out.println("CustomerId" + customerDetails.getCustomerId());
        System.out.println("Name" + customerDetails.getName());
        System.out.println("Age" + customerDetails.getAge());
        System.out.println("Email" + customerDetails.getEmail());
        public ArrayList <CustomerDetails> getCustomerDetails(){
            System.out.println("returning details");
            return customerDetails;
        }
    }
}
