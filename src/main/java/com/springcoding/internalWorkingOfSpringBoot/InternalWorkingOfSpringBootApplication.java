package com.springcoding.internalWorkingOfSpringBoot;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
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
	private PaymentService paymentsService;

	// DI - through constructor injection
//	@Autowired - is optional if only one constructor exists for a class
	public InternalWorkingOfSpringBootApplication(PaymentService paymentService) {

		this.paymentsService = paymentService;
	}

	// Setter Injection - DI done through public setter methods of a class
//	@Autowired - optional if only one setter method exists
	public void setPaymentsService(PaymentService paymentService){
		this.paymentsService = paymentService;
	}

	@Override
	public void run(String... args) throws Exception {
		String payment = paymentsService.pay();
		System.out.println("Payment done using: " +payment);

	}
}
