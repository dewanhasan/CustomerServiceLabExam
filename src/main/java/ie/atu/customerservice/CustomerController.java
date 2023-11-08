package ie.atu.customerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public void injectedConstructor(CustomerService customerService){
        this.CustomerService = customerService;

        @PostMapping("/addDetails")
                public void addCustomerDetails(@RequestBody CustomerDetails customerDetails)
        {
            CustomerService.addCustomerDetails(addCustomerDetails)
        }
    }
}
