package beans;
// Generated Feb 3, 2019 8:02:34 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Obrazovanje generated by hbm2java
 */
@Entity
@Table(name="obrazovanje"
    ,catalog="job_fair"
)
public class Obrazovanje  implements java.io.Serializable {


     private int id;
     private Biografija biografija;
     private Date dateOd;
     private Date dateDo;
     private int onGoing;
     private String stepen;
     private String fakultet;

    public Obrazovanje() {
    }

    public Obrazovanje(Biografija biografija, Date dateOd, Date dateDo, int onGoing, String stepen, String fakultet) {
       this.biografija = biografija;
       this.dateOd = dateOd;
       this.dateDo = dateDo;
       this.onGoing = onGoing;
       this.stepen = stepen;
       this.fakultet = fakultet;
    }
   
     @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="biografija"))@Id @GeneratedValue(generator="generator")

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public Biografija getBiografija() {
        return this.biografija;
    }
    
    public void setBiografija(Biografija biografija) {
        this.biografija = biografija;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date_od", nullable=false, length=10)
    public Date getDateOd() {
        return this.dateOd;
    }
    
    public void setDateOd(Date dateOd) {
        this.dateOd = dateOd;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date_do", nullable=false, length=10)
    public Date getDateDo() {
        return this.dateDo;
    }
    
    public void setDateDo(Date dateDo) {
        this.dateDo = dateDo;
    }

    
    @Column(name="on_going", nullable=false)
    public int getOnGoing() {
        return this.onGoing;
    }
    
    public void setOnGoing(int onGoing) {
        this.onGoing = onGoing;
    }

    
    @Column(name="stepen", nullable=false, length=50)
    public String getStepen() {
        return this.stepen;
    }
    
    public void setStepen(String stepen) {
        this.stepen = stepen;
    }

    
    @Column(name="fakultet", nullable=false, length=45)
    public String getFakultet() {
        return this.fakultet;
    }
    
    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }




}

