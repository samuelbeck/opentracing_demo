package com.themanawaha.opentracing_demo;

import io.jaegertracing.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OpentracingDemoApplication {

	@Bean
	public io.opentracing.Tracer jaegerTracer() {

		Configuration config = Configuration.fromEnv();

		System.out.println("Config_Host: " + config.getReporter().getSenderConfiguration().getAgentHost());
		System.out.println("Config_Port: " + config.getReporter().getSenderConfiguration().getAgentPort());
		System.out.println("Sampler_Host_Port: " + config.getSampler().getManagerHostPort());

		return config.getTracer();
	}

	public static void main(String[] args) {
		SpringApplication.run(OpentracingDemoApplication.class, args);
	}
}
