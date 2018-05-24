package twt.model;
// Generated 2018-5-24 14:12:58 by Hibernate Tools 3.5.0.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UserPassRecordId generated by hbm2java
 */
@Embeddable
public class UserPassRecordId implements java.io.Serializable {

	private int id;
	private Date time;

	public UserPassRecordId() {
	}

	public UserPassRecordId(int id, Date time) {
		this.id = id;
		this.time = time;
	}

	@Column(name = "id", nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "time", nullable = false, length = 19)
	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserPassRecordId))
			return false;
		UserPassRecordId castOther = (UserPassRecordId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getTime() == castOther.getTime()) || (this.getTime() != null && castOther.getTime() != null
						&& this.getTime().equals(castOther.getTime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getTime() == null ? 0 : this.getTime().hashCode());
		return result;
	}

}
