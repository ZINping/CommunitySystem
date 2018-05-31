package twt.model;
// Generated 2018-5-31 11:25:56 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ExpenseId generated by hbm2java
 */
@Embeddable
public class ExpenseId implements java.io.Serializable {

	private int id;
	private int yearmonth;

	public ExpenseId() {
	}

	public ExpenseId(int id, int yearmonth) {
		this.id = id;
		this.yearmonth = yearmonth;
	}

	@Column(name = "id", nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "yearmonth", nullable = false)
	public int getYearmonth() {
		return this.yearmonth;
	}

	public void setYearmonth(int yearmonth) {
		this.yearmonth = yearmonth;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ExpenseId))
			return false;
		ExpenseId castOther = (ExpenseId) other;

		return (this.getId() == castOther.getId()) && (this.getYearmonth() == castOther.getYearmonth());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + this.getYearmonth();
		return result;
	}

}
