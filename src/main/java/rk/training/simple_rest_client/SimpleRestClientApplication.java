package rk.training.simple_rest_client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rk.training.simple_rest_client.client.ContractClient;
import rk.training.simple_rest_client.dto.Contract;

@SpringBootApplication
public class SimpleRestClientApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(SimpleRestClientApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(SimpleRestClientApplication.class, args);
    }

    @Autowired
    private ContractClient contractClient;

    @Override
    public void run(String... args) throws Exception {
        Contract contracts = contractClient.getContract(5);
        logger.info("Response: {}", contracts);
    }
}
