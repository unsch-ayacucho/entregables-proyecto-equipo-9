package pe.edu.consejo.facultad.unsch.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import pe.edu.consejo.facultad.unsch.dao.UsuarioRepository;
import pe.edu.consejo.facultad.unsch.entities.Usuario;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	

	
	@Autowired
    private AccessDeniedHandler accessDeniedHandler;
	
    @Autowired
    private UserDetailsService userDetailsService;

	@Autowired
	protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		
		http
			.authorizeRequests()
				
		    	.antMatchers("/css/**").permitAll()
		    	.antMatchers("/img/**").permitAll()
		    	.antMatchers("/js/**").permitAll()
		    	.antMatchers("/fonts/**").permitAll()
		        .antMatchers("/admin/**").hasAnyRole("ADMINISTRADOR") //HASHROLE MODIFICADO
		        .antMatchers("/decano/**").hasAnyRole("DECANO") //HASHROLE MODIFICADO
		        .antMatchers("/secretario/**").hasAnyRole("SECRETARIO") //HASHROLE MODIFICADO
		        .anyRequest().authenticated()
		        .and()
	        .formLogin()
	            .loginPage("/login")
	            .usernameParameter("username")
	            .passwordParameter("password")
	            .defaultSuccessUrl("/secretario/home")
	            .permitAll()
	            .and()
	        .logout()
	        	.invalidateHttpSession(true)
	        	.clearAuthentication(true)
	        	.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
	        	
	        	.logoutSuccessUrl("/login?logout")
	            .permitAll()
	            .and()
	        .exceptionHandling()
	        	.accessDeniedHandler(accessDeniedHandler);
	}
	
}
