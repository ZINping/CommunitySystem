package twt.model;
// Generated 2018-6-21 11:26:04 by Hibernate Tools 3.5.0.Final

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Household generated by hbm2java
 */
@Entity
@Table(name = "Household", catalog = "CommunitySystem")
public class Household implements java.io.Serializable {

	private Integer id;
	private String name;
	private String phone;
	private Integer sex;
	private Date birthday;
	private int type;
	private Set<Comment> comments = new HashSet<Comment>(0);
	private Set<Car> cars = new HashSet<Car>(0);
	private Set<Express> expresses = new HashSet<Express>(0);
	private Set<Room> rooms = new HashSet<Room>(0);
	private Set<UserPassRecord> userPassRecords = new HashSet<UserPassRecord>(0);

	public Household() {
	}

	public Household(String name, String phone, int type) {
		this.name = name;
		this.phone = phone;
		this.type = type;
	}

	public Household(String name, String phone, Integer sex, Date birthday, int type, Set<Comment> comments,
			Set<Car> cars, Set<Express> expresses, Set<Room> rooms, Set<UserPassRecord> userPassRecords) {
		this.name = name;
		this.phone = phone;
		this.sex = sex;
		this.birthday = birthday;
		this.type = type;
		this.comments = comments;
		this.cars = cars;
		this.expresses = expresses;
		this.rooms = rooms;
		this.userPassRecords = userPassRecords;
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

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "phone", nullable = false, length = 11)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "sex")
	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "birthday", length = 19)
	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Column(name = "type", nullable = false)
	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "household")
	public Set<Comment> getComments() {
		return this.comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "household")
	public Set<Car> getCars() {
		return this.cars;
	}

	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "household")
	public Set<Express> getExpresses() {
		return this.expresses;
	}

	public void setExpresses(Set<Express> expresses) {
		this.expresses = expresses;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "households")
	public Set<Room> getRooms() {
		return this.rooms;
	}

	public void setRooms(Set<Room> rooms) {
		this.rooms = rooms;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "household")
	public Set<UserPassRecord> getUserPassRecords() {
		return this.userPassRecords;
	}

	public void setUserPassRecords(Set<UserPassRecord> userPassRecords) {
		this.userPassRecords = userPassRecords;
	}

}
