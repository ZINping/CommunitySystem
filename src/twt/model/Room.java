package twt.model;
// Generated 2018-5-24 10:57:55 by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Room generated by hbm2java
 */
@Entity
@Table(name = "Room", catalog = "CommunitySystem")
public class Room implements java.io.Serializable {

	private Integer id;
	private int house;
	private int unit;
	private int layer;
	private int room;
	private Set<Household> households = new HashSet<Household>(0);
	private Set<Repair> repairs = new HashSet<Repair>(0);
	private Set<UserPassRecord> userPassRecords = new HashSet<UserPassRecord>(0);
	private Set<Expense> expenses = new HashSet<Expense>(0);

	public Room() {
	}

	public Room(int house, int unit, int layer, int room) {
		this.house = house;
		this.unit = unit;
		this.layer = layer;
		this.room = room;
	}

	public Room(int house, int unit, int layer, int room, Set<Household> households, Set<Repair> repairs,
			Set<UserPassRecord> userPassRecords, Set<Expense> expenses) {
		this.house = house;
		this.unit = unit;
		this.layer = layer;
		this.room = room;
		this.households = households;
		this.repairs = repairs;
		this.userPassRecords = userPassRecords;
		this.expenses = expenses;
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

	@Column(name = "house", nullable = false)
	public int getHouse() {
		return this.house;
	}

	public void setHouse(int house) {
		this.house = house;
	}

	@Column(name = "unit", nullable = false)
	public int getUnit() {
		return this.unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	@Column(name = "layer", nullable = false)
	public int getLayer() {
		return this.layer;
	}

	public void setLayer(int layer) {
		this.layer = layer;
	}

	@Column(name = "room", nullable = false)
	public int getRoom() {
		return this.room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "rooms")
	public Set<Household> getHouseholds() {
		return this.households;
	}

	public void setHouseholds(Set<Household> households) {
		this.households = households;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "room")
	public Set<Repair> getRepairs() {
		return this.repairs;
	}

	public void setRepairs(Set<Repair> repairs) {
		this.repairs = repairs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "room")
	public Set<UserPassRecord> getUserPassRecords() {
		return this.userPassRecords;
	}

	public void setUserPassRecords(Set<UserPassRecord> userPassRecords) {
		this.userPassRecords = userPassRecords;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "room")
	public Set<Expense> getExpenses() {
		return this.expenses;
	}

	public void setExpenses(Set<Expense> expenses) {
		this.expenses = expenses;
	}

}
