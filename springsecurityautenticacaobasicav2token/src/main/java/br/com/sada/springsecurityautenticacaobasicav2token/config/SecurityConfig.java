package br.com.sada.springsecurityautenticacaobasicav2token.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity

public class SecurityConfig extends WebSecurityConfigurerAdapter {

	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// Objeto que cria os usuarios
		auth.inMemoryAuthentication()
		.withUser("admin").password("{noop}admin").roles("ROLE").and()
		.withUser("usuario").password("{noop}usuario").roles("USER");

	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//Objeto que cria as regras de autenticação.
		http.authorizeRequests()
			.antMatchers("/categorias").permitAll()
			.anyRequest().authenticated().and()
			.httpBasic().and()
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
		.csrf().disable();

		
	}
	
	
	
	
}
