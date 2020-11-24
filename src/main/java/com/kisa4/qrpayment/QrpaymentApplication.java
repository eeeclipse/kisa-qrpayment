package com.kisa4.qrpayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QrpaymentApplication {

	@RequestMapping("/")
	public String index () {
		return "Springboot Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(QrpaymentApplication.class, args);
	}

}
