package twt.model;
// Generated 2018-6-14 13:25:42 by Hibernate Tools 3.5.0.Final

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
 * Expense generated by hbm2java
 */
@Entity
@Table(name = "Expense", catalog = "CommunitySystem")
public class Expense implements java.io.Serializable {

	private ExpenseId id;
	private Room room;
	private int water;
	private int watered;
	private int electricity;
	private int electricityed;
	private int gas;
	private int gased;

	public Expense() {
	}

	public Expense(ExpenseId id, Room room, int water, int watered, int electricity, int electricityed, int gas,
			int gased) {
		this.id = id;
		this.room = room;
		this.water = water;
		this.watered = watered;
		this.electricity = electricity;
		this.electricityed = electricityed;
		this.gas = gas;
		this.gased = gased;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id", nullable = false)),
			@AttributeOverride(name = "yearmonth", column = @Column(name = "yearmonth", nullable = false)) })
	public ExpenseId getId() {
		return this.id;
	}

	public void setId(ExpenseId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
	public Room getRoom() {
		return this.room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	@Column(name = "water", nullable = false)
	public int getWater() {
		return this.water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	@Column(name = "watered", nullable = false)
	public int getWatered() {
		return this.watered;
	}

	public void setWatered(int watered) {
		this.watered = watered;
	}

	@Column(name = "electricity", nullable = false)
	public int getElectricity() {
		return this.electricity;
	}

	public void setElectricity(int electricity) {
		this.electricity = electricity;
	}

	@Column(name = "electricityed", nullable = false)
	public int getElectricityed() {
		return this.electricityed;
	}

	public void setElectricityed(int electricityed) {
		this.electricityed = electricityed;
	}

	@Column(name = "gas", nullable = false)
	public int getGas() {
		return this.gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}

	@Column(name = "gased", nullable = false)
	public int getGased() {
		return this.gased;
	}

	public void setGased(int gased) {
		this.gased = gased;
	}

}
