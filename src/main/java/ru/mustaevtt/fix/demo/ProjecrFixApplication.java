package ru.mustaevtt.fix.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import ru.mustaevtt.fix.demo.servlet.HorseServlet;

import javax.servlet.http.HttpServlet;

@SpringBootApplication
public class ProjecrFixApplication {
	@Bean
	public ServletRegistrationBean exampleServletBean() {
		ServletRegistrationBean bean = new ServletRegistrationBean(
				httpServlet(), "/horse/servlet/count");
		bean.setLoadOnStartup(1);
		return bean;
	}

	@Bean
	public HttpServlet httpServlet() {
		return new HorseServlet();
	}
	public static void main(String[] args) {
		SpringApplication.run(ProjecrFixApplication.class, args);
	}

}
