package beans;
// Generated Feb 12, 2019 2:08:23 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Standovi generated by hbm2java
 */
@Entity
@Table(name="standovi"
    ,catalog="job_fair"
)
public class Standovi  implements java.io.Serializable {


     private Integer id;
     private Kompanija kompanija;
     private String ime;
     private String kompanijaIme;
     private int vreme;

    public Standovi() {
    }

    public Standovi(Kompanija kompanija, String ime, String kompanijaIme, int vreme) {
       this.kompanija = kompanija;
       this.ime = ime;
       this.kompanijaIme = kompanijaIme;
       this.vreme = vreme;
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
    @JoinColumn(name="kompanijaId", nullable=false)
    public Kompanija getKompanija() {
        return this.kompanija;
    }
    
    public void setKompanija(Kompanija kompanija) {
        this.kompanija = kompanija;
    }

    
    @Column(name="ime", nullable=false, length=45)
    public String getIme() {
        return this.ime;
    }
    
    public void setIme(String ime) {
        this.ime = ime;
    }

    
    @Column(name="kompanijaIme", nullable=false, length=45)
    public String getKompanijaIme() {
        return this.kompanijaIme;
    }
    
    public void setKompanijaIme(String kompanijaIme) {
        this.kompanijaIme = kompanijaIme;
    }

    
    @Column(name="vreme", nullable=false)
    public int getVreme() {
        return this.vreme;
    }
    
    public void setVreme(int vreme) {
        this.vreme = vreme;
    }




}


