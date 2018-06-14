package twt.model;
// Generated 2018-6-14 13:25:42 by Hibernate Tools 3.5.0.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AnnouncementAdminId generated by hbm2java
 */
@Embeddable
public class AnnouncementAdminId implements java.io.Serializable {

	private String name;
	private Date time;
	private String content;

	public AnnouncementAdminId() {
	}

	public AnnouncementAdminId(String name, Date time, String content) {
		this.name = name;
		this.time = time;
		this.content = content;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "time", nullable = false, length = 19)
	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Column(name = "content", nullable = false, length = 2048)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AnnouncementAdminId))
			return false;
		AnnouncementAdminId castOther = (AnnouncementAdminId) other;

		return ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
				&& this.getName().equals(castOther.getName())))
				&& ((this.getTime() == castOther.getTime()) || (this.getTime() != null && castOther.getTime() != null
						&& this.getTime().equals(castOther.getTime())))
				&& ((this.getContent() == castOther.getContent()) || (this.getContent() != null
						&& castOther.getContent() != null && this.getContent().equals(castOther.getContent())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getTime() == null ? 0 : this.getTime().hashCode());
		result = 37 * result + (getContent() == null ? 0 : this.getContent().hashCode());
		return result;
	}

}
