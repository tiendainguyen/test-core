package org.trainingjava.coreapiexceptiontest;

import org.aibles.coreswagger.EnableSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.trainingjava.core_api_exception.configuration.EnableCoreApiException;
import org.trainingjava.core_exception.NotFoundException;

@SpringBootApplication
@RestController
//@EnableCoreApiException
@EnableSwagger
public class CoreApiExceptionTestApplication {

  public static void main(String[] args) {
    SpringApplication.run(CoreApiExceptionTestApplication.class, args);
  }
  @GetMapping("/test")
  public String sayHi(){
    throw new NotFoundException("1", "anyType");
  }

}
