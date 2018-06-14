package twt.model;
// Generated 2018-6-14 13:25:42 by Hibernate Tools 3.5.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * LoginAdmin generated by hbm2java
 */
@Entity
@Table(name = "Login_Admin", catalog = "CommunitySystem")
public class LoginAdmin implements java.io.Serializable {

	private LoginAdminId id;

	public LoginAdmin() {
	}

	public LoginAdmin(LoginAdminId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "name", column = @Column(name = "name", nullable = false)),
			@AttributeOverride(name = "phone", column = @Column(name = "phone", nullable = false, length = 11)),
			@AttributeOverride(name = "password", column = @Column(name = "password", nullable = false)) })
	public LoginAdminId getId() {
		return this.id;
	}

	public void setId(LoginAdminId id) {
		this.id = id;
	}

}
