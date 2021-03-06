package beans;
// Generated Feb 12, 2019 2:08:23 PM by Hibernate Tools 4.3.1


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
 * Obrazovanje generated by hbm2java
 */
@Entity
@Table(name="obrazovanje"
    ,catalog="job_fair"
)
public class Obrazovanje  implements java.io.Serializable {


     private Integer idobrazovanje;
     private Biografija biografija;
     private Date dateod;
     private Date datedo;
     private String onGoing;
     private String stepen;
     private String fakultet;

    public Obrazovanje() {
    }

    public Obrazovanje(Biografija biografija, Date dateod, Date datedo, String onGoing, String stepen, String fakultet) {
       this.biografija = biografija;
       this.dateod = dateod;
       this.datedo = datedo;
       this.onGoing = onGoing;
       this.stepen = stepen;
       this.fakultet = fakultet;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idobrazovanje", unique=true, nullable=false)
    public Integer getIdobrazovanje() {
        return this.idobrazovanje;
    }
    
    public void setIdobrazovanje(Integer idobrazovanje) {
        this.idobrazovanje = idobrazovanje;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idBio", nullable=false)
    public Biografija getBiografija() {
        return this.biografija;
    }
    
    public void setBiografija(Biografija biografija) {
        this.biografija = biografija;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dateod", nullable=false, length=10)
    public Date getDateod() {
        return this.dateod;
    }
    
    public void setDateod(Date dateod) {
        this.dateod = dateod;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="datedo", nullable=false, length=10)
    public Date getDatedo() {
        return this.datedo;
    }
    
    public void setDatedo(Date datedo) {
        this.datedo = datedo;
    }

    
    @Column(name="on_going", nullable=false, length=45)
    public String getOnGoing() {
        return this.onGoing;
    }
    
    public void setOnGoing(String onGoing) {
        this.onGoing = onGoing;
    }

    
    @Column(name="stepen", nullable=false, length=45)
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


