package twt.model;
// Generated 2018-6-21 11:26:04 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Repair generated by hbm2java
 */
@Entity
@Table(name = "Repair", catalog = "CommunitySystem")
public class Repair implements java.io.Serializable {

	private Integer id;
	private Room room;
	private String content;
	private int isfixed;

	public Repair() {
	}

	public Repair(Room room, String content, int isfixed) {
		this.room = room;
		this.content = content;
		this.isfixed = isfixed;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "roomid", nullable = false)
	public Room getRoom() {
		return this.room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	@Column(name = "content", nullable = false, length = 2048)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "isfixed", nullable = false)
	public int getIsfixed() {
		return this.isfixed;
	}

	public void setIsfixed(int isfixed) {
		this.isfixed = isfixed;
	}

}
