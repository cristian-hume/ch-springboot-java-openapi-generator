package ch.springboot.java.app.openapigenerator.cotroller;

import ch.springboot.java.app.openapigenerator.api.CustomerApi;
import ch.springboot.java.app.openapigenerator.model.CreateCustomerRequest;
import ch.springboot.java.app.openapigenerator.model.CreateCustomerResponse;
import ch.springboot.java.app.openapigenerator.model.FindCustomerResponse;
import ch.springboot.java.app.openapigenerator.model.UpdateCustomerRequest;
import org.springframework.http.ResponseEntity;
import java.util.UUID;

/**
 * @author  Cristian Hume Henriquez
 * @version 1.0.0
 * @since   2022.03.08-RENNY (HAPPY-BIRTHDAY)
 */
public class UserController implements CustomerApi {

    @Override
    public ResponseEntity<CreateCustomerResponse> createUser(CreateCustomerRequest createCustomerRequest) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteCustomer(String customerId) {
        return null;
    }

    @Override
    public ResponseEntity<FindCustomerResponse> getUser(UUID customerId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> putUser(String customerId, UpdateCustomerRequest updateCustomerRequest) {
        return null;
    }
}
