package beans;
// Generated Feb 12, 2019 2:08:23 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Ocenjivanje generated by hbm2java
 */
@Entity
@Table(name="ocenjivanje"
    ,catalog="job_fair"
)
public class Ocenjivanje  implements java.io.Serializable {


     private Integer id;
     private String naziv;
     private int idstudent;
     private String ocena;

    public Ocenjivanje() {
    }

    public Ocenjivanje(String naziv, int idstudent, String ocena) {
       this.naziv = naziv;
       this.idstudent = idstudent;
       this.ocena = ocena;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="naziv", nullable=false, length=45)
    public String getNaziv() {
        return this.naziv;
    }
    
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    
    @Column(name="idstudent", nullable=false)
    public int getIdstudent() {
        return this.idstudent;
    }
    
    public void setIdstudent(int idstudent) {
        this.idstudent = idstudent;
    }

    
    @Column(name="ocena", nullable=false, length=45)
    public String getOcena() {
        return this.ocena;
    }
    
    public void setOcena(String ocena) {
        this.ocena = ocena;
    }




}


