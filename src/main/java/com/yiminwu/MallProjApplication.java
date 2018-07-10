package com.yiminwu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.yiminwu.interceptor.AuthInterceptor;

@SpringBootApplication
@ServletComponentScan
@EnableJpaRepositories(basePackages="com.yiminwu.repository")
public class MallProjApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(MallProjApplication.class, args);
	}
	
	@Override  
   public void addInterceptors(InterceptorRegistry registry) {  
       //注册自定义拦截器，添加拦截路径和排除拦截路径  
	   registry.addInterceptor(new AuthInterceptor()).addPathPatterns("/**").excludePathPatterns("/center/login", "/center/doLogin");
	   super.addInterceptors(registry);
   }  

}
