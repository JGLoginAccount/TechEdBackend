package com.lmig.gfc.TechEducationProject.models;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity (name = "appUsers")
@Table(name = "appUsers")
public class User implements UserDetails {

	// @OneToMany(mappedBy = "user")
	// private List<Request> requests;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;



	private static final long serialVersionUID = 1L;


	@Column(nullable = false)
	private String password;

	@Column(nullable = false)
	private String firstName;

	@Column(nullable = false)
	private String lastName;

	@Column(nullable = false, unique = true)
	private String username;
	
	@OneToOne(cascade = CascadeType.ALL)
	private MentorProfile profile;

	public User() {
	}
	
	  public User(String firstName, String lastName, String userName, String password) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.username = userName;
	        this.password = password;

	    }

	    @Override
	    public boolean isAccountNonExpired() {
	        return true;
	    }

	    @Override
	    public boolean isAccountNonLocked() {
	        return true;
	    }

	    @Override
	    public boolean isCredentialsNonExpired() {
	        return true;
	    }

	    @Override
	    public boolean isEnabled() {
	        return true;
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    // public void setUsername(String email) {
	    // this.username = email;
	    // }

	    @Override
	    public String getUsername() {
	        return username;
	    }

	    @Override
	    public String getPassword() {
	        return password;
	    }

	    @Override
	    public Collection<? extends GrantedAuthority> getAuthorities() {
	        // TODO Auto-generated method stub
	        return null;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

		public String getUserName() {
			return username;
		}

		public void setUserName(String userName) {
			this.username = userName;
		}

		public MentorProfile getProfile() {
			return profile;
		}

		public void setProfile(MentorProfile profile) {
			this.profile = profile;
		}

}
