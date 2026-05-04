package com.springcoding.internalWorkingOfSpringBoot;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternalWorkingOfSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InternalWorkingOfSpringBootApplication.class, args);
	}

	//tight coupling - not recommended
	//application is dependent on phone pay payment service
	// private PhonePayPaymentService phonePayPaymentService = new PhonePayPaymentService();

	// @Autowired - field injection - spring will automatically inject the dependency
	private PhonePayPaymentService phonePayPaymentService;

	// DI - through constructor injection
	public InternalWorkingOfSpringBootApplication(PhonePayPaymentService phonePayPaymentService) {
		this.phonePayPaymentService = phonePayPaymentService;
	}


	@Override
	public void run(String... args) throws Exception {
		phonePayPaymentService.phonePayPayment();
		System.out.println("Payment done using phone pay payment service");

	}

}
