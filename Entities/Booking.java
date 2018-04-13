package entities;
// Generated Apr 14, 2018 12:42:49 AM by Hibernate Tools 3.4.0.CR1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Booking generated by hbm2java
 */
@Entity
@Table(name="booking"
    ,catalog="rental_system"
)
public class Booking  implements java.io.Serializable {


     private Integer id;
     private Car car;
     private Customer customer;
     private String name;
     private String email;
     private String contactNo;
     private Date pickupDate;
     private Date dropDate;
     private Integer rent;
     private String pickupAddress;
     private String dropAddress;
     private Integer passengers;

    public Booking() {
    }

    public Booking(Car car, Customer customer, String name, String email, String contactNo, Date pickupDate, Date dropDate, Integer rent, String pickupAddress, String dropAddress, Integer passengers) {
       this.car = car;
       this.customer = customer;
       this.name = name;
       this.email = email;
       this.contactNo = contactNo;
       this.pickupDate = pickupDate;
       this.dropDate = dropDate;
       this.rent = rent;
       this.pickupAddress = pickupAddress;
       this.dropAddress = dropAddress;
       this.passengers = passengers;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="car_id")
    public Car getCar() {
        return this.car;
    }
    
    public void setCar(Car car) {
        this.car = car;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="customer_id")
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    
    @Column(name="name")
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="email")
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="contact_no")
    public String getContactNo() {
        return this.contactNo;
    }
    
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="pickup_date", length=10)
    public Date getPickupDate() {
        return this.pickupDate;
    }
    
    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="drop_date", length=10)
    public Date getDropDate() {
        return this.dropDate;
    }
    
    public void setDropDate(Date dropDate) {
        this.dropDate = dropDate;
    }

    
    @Column(name="rent")
    public Integer getRent() {
        return this.rent;
    }
    
    public void setRent(Integer rent) {
        this.rent = rent;
    }

    
    @Column(name="pickup_address")
    public String getPickupAddress() {
        return this.pickupAddress;
    }
    
    public void setPickupAddress(String pickupAddress) {
        this.pickupAddress = pickupAddress;
    }

    
    @Column(name="drop_address")
    public String getDropAddress() {
        return this.dropAddress;
    }
    
    public void setDropAddress(String dropAddress) {
        this.dropAddress = dropAddress;
    }

    
    @Column(name="passengers")
    public Integer getPassengers() {
        return this.passengers;
    }
    
    public void setPassengers(Integer passengers) {
        this.passengers = passengers;
    }




}


