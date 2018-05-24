package twt.model;
// Generated 2018-5-24 14:12:58 by Hibernate Tools 3.5.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * UserPassRecord generated by hbm2java
 */
@Entity
@Table(name = "UserPassRecord", catalog = "CommunitySystem")
public class UserPassRecord implements java.io.Serializable {

	private UserPassRecordId id;
	private Household household;
	private Room roomByHouse;
	private Room roomByHouse_1;

	public UserPassRecord() {
	}

	public UserPassRecord(UserPassRecordId id, Household household, Room roomByHouse, Room roomByHouse_1) {
		this.id = id;
		this.household = household;
		this.roomByHouse = roomByHouse;
		this.roomByHouse_1 = roomByHouse_1;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id", nullable = false)),
			@AttributeOverride(name = "time", column = @Column(name = "time", nullable = false, length = 19)) })
	public UserPassRecordId getId() {
		return this.id;
	}

	public void setId(UserPassRecordId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
	public Household getHousehold() {
		return this.household;
	}

	public void setHousehold(Household household) {
		this.household = household;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "house", nullable = false)
	public Room getRoomByHouse() {
		return this.roomByHouse;
	}

	public void setRoomByHouse(Room roomByHouse) {
		this.roomByHouse = roomByHouse;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "house", nullable = false, insertable = false, updatable = false)
	public Room getRoomByHouse_1() {
		return this.roomByHouse_1;
	}

	public void setRoomByHouse_1(Room roomByHouse_1) {
		this.roomByHouse_1 = roomByHouse_1;
	}

}
