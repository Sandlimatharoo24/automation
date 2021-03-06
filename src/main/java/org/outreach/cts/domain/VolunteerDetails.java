package org.outreach.cts.domain;
// Generated Oct 17, 2016 9:28:46 PM by Hibernate Tools 5.2.0.CR1

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Volunteer generated by hbm2java
 */
@Entity
@Table(name = "volunteer", catalog = "outreach")
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.ANY, fieldVisibility = JsonAutoDetect.Visibility.NONE)
public class VolunteerDetails extends BaseModel<String> implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Council council;
	private EventDetails eventDetails;
	private String volunteerId;
	private String volunteerName;
	private String volunteerDesc;
	private BigDecimal volHoursSpent;

	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@JsonProperty("id")
	public String getPrimaryKey() {
		return this.primaryKey;
	}

	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}

	@ManyToOne(optional = false)
	@JoinColumn(name = "council_id")
	@JsonManagedReference
	public Council getCouncil() {
		return this.council;
	}

	public void setCouncil(Council council) {
		this.council = council;
	}

	@ManyToOne(optional = false)
	@JoinColumn(name = "event_id")
	@JsonManagedReference
	public EventDetails getEventDetails() {
		return this.eventDetails;
	}

	public void setEventDetails(EventDetails eventDetails) {
		this.eventDetails = eventDetails;
	}


	@Column(name = "vol_hours_spent", precision = 10)
	public BigDecimal getVolHoursSpent() {
		return this.volHoursSpent;
	}

	public void setVolHoursSpent(BigDecimal volHoursSpent) {
		this.volHoursSpent = volHoursSpent;
	}

	@Column(name = "volunteer_id",  length = 100)
	public String getVolunteerId() {
		return volunteerId;
	}

	public void setVolunteerId(String volunteerId) {
		this.volunteerId = volunteerId;
	}
	@Column(name = "volunteer_name",  length = 100)
	public String getVolunteerName() {
		return volunteerName;
	}

	public void setVolunteerName(String volunteerName) {
		this.volunteerName = volunteerName;
	}
	@Column(name = "volunteer_desc", length = 500)
	public String getVolunteerDesc() {
		return volunteerDesc;
	}

	public void setVolunteerDesc(String volunteerDesc) {
		this.volunteerDesc = volunteerDesc;
	}

	@Override
	public String toString() {
		return "VolunteerDetails [council=" + council + ", eventDetails=" + eventDetails + ", volunteerId="
				+ volunteerId + ", volunteerName=" + volunteerName + ", volunteerDesc=" + volunteerDesc
				+ ", volHoursSpent=" + volHoursSpent + "]";
	}


}
