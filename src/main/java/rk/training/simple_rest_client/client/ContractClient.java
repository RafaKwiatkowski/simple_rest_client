package rk.training.simple_rest_client.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;
import rk.training.simple_rest_client.dto.Contract;

/**
 * @author: Rafał Kwiatkowski
 * @created: 05.08.2018 14:10
 */

@Component
public class ContractClient {

    @Autowired
    private RestOperations restOperations;

    private final String url;

    @Autowired
    public ContractClient(@Value("${contract.service.url}") final String url) {
        this.url = url;
    }

    public Contract getContract(final int contractNumber) {
        return restOperations.getForObject(url, Contract.class, contractNumber);
    }
}
