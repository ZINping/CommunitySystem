package twt.model;
// Generated 2018-6-14 13:25:42 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Login generated by hbm2java
 */
@Entity
@Table(name = "Login", catalog = "CommunitySystem")
public class Login implements java.io.Serializable {

	private String phone;
	private String password;

	public Login() {
	}

	public Login(String phone, String password) {
		this.phone = phone;
		this.password = password;
	}

	@Id

	@Column(name = "phone", unique = true, nullable = false, length = 11)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "password", nullable = false)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
