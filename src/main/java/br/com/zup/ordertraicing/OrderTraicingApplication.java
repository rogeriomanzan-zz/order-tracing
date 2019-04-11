package br.com.zup.ordertraicing;

import io.jaegertracing.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OrderTraicingApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderTraicingApplication.class, args);
    }

    @Bean
    public io.opentracing.Tracer jaegerTracer() {
        Configuration.SamplerConfiguration samplerConfig = Configuration.SamplerConfiguration.fromEnv().withType("const").withParam(1);
        Configuration.ReporterConfiguration reporterConfig = Configuration.ReporterConfiguration.fromEnv().withLogSpans(true);
        Configuration config = new Configuration("Order-Service").withSampler(samplerConfig).withReporter(reporterConfig);
        return config.withSampler(samplerConfig).withReporter(reporterConfig).getTracer();
    }

}
