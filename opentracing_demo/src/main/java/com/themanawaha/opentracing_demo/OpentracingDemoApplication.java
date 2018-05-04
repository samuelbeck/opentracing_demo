package com.themanawaha.opentracing_demo;


import io.jaegertracing.Configuration;
import io.jaegertracing.Tracer;
import io.jaegertracing.reporters.InMemoryReporter;
import io.jaegertracing.reporters.Reporter;
import io.jaegertracing.samplers.ProbabilisticSampler;
import io.jaegertracing.samplers.Sampler;
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

		return config.getTracer();
	}

	public static void main(String[] args) {
		SpringApplication.run(OpentracingDemoApplication.class, args);
	}
}
