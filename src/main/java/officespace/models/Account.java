package officespace.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * An entity Account composed by two fields (id, balance). The Entity
 * annotation indicates that this class is a JPA entity. The Table annotation
 * specifies the name for the table in the db.
 *
 * @author John Zaccone
 * @modify forkballpitch
 */
@Entity
@Table(name = "account")
public class Account {

	// ------------------------
	// PRIVATE FIELDS
	// ------------------------

	// An autogenerated id (unique for each account in the db)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	// The account balance
	@NotNull
	private double balance;

	// ------------------------
	// PUBLIC METHODS
	// ------------------------

	public Account() {
	}

	public Account(long id) {
		this.id = id;
	}

	public Account(double balance) {
		this.balance = balance;
	}

	// Getter and setter methods
	public long getId() {
		return id;
	}

	public void setId(long value) {
		this.id = value;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}