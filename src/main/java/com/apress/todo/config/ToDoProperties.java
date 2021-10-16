package com.apress.todo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "todo.authentication")
public class ToDoProperties {
    private String findByEmailUri;
    private String username;
    private String password;
	public String getFindByEmailUri() {
		return findByEmailUri;
	}
	public void setFindByEmailUri(String findByEmailUri) {
		this.findByEmailUri = findByEmailUri;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}