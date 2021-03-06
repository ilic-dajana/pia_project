package beans;
// Generated Feb 12, 2019 2:08:23 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Kompanija generated by hbm2java
 */
@Entity
@Table(name="kompanija"
    ,catalog="job_fair"
)
public class Kompanija  implements java.io.Serializable {


     private int id;
     private User user;
     private String naziv;
     private String adresa;
     private String direktorIme;
     private String direktorPrezime;
     private int pib;
     private int brojZaposlenih;
     private String email;
     private String sajt;
     private String delatnost;
     private String specijalnost;
     private String grad;
     private Set<Standovi> standovis = new HashSet<Standovi>(0);
     private Set<Konkurs> konkurses = new HashSet<Konkurs>(0);
     private Prijavanasajam prijavanasajam;

    public Kompanija() {
    }

	
    public Kompanija(User user, String naziv, String adresa, String direktorIme, String direktorPrezime, int pib, int brojZaposlenih, String email, String sajt, String delatnost, String specijalnost, String grad) {
        this.user = user;
        this.naziv = naziv;
        this.adresa = adresa;
        this.direktorIme = direktorIme;
        this.direktorPrezime = direktorPrezime;
        this.pib = pib;
        this.brojZaposlenih = brojZaposlenih;
        this.email = email;
        this.sajt = sajt;
        this.delatnost = delatnost;
        this.specijalnost = specijalnost;
        this.grad = grad;
    }
    public Kompanija(User user, String naziv, String adresa, String direktorIme, String direktorPrezime, int pib, int brojZaposlenih, String email, String sajt, String delatnost, String specijalnost, String grad, Set<Standovi> standovis, Set<Konkurs> konkurses, Prijavanasajam prijavanasajam) {
       this.user = user;
       this.naziv = naziv;
       this.adresa = adresa;
       this.direktorIme = direktorIme;
       this.direktorPrezime = direktorPrezime;
       this.pib = pib;
       this.brojZaposlenih = brojZaposlenih;
       this.email = email;
       this.sajt = sajt;
       this.delatnost = delatnost;
       this.specijalnost = specijalnost;
       this.grad = grad;
       this.standovis = standovis;
       this.konkurses = konkurses;
       this.prijavanasajam = prijavanasajam;
    }
   
     @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="user"))@Id @GeneratedValue(generator="generator")

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    
    @Column(name="naziv", nullable=false, length=45)
    public String getNaziv() {
        return this.naziv;
    }
    
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    
    @Column(name="adresa", nullable=false, length=45)
    public String getAdresa() {
        return this.adresa;
    }
    
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    
    @Column(name="direktor_ime", nullable=false, length=45)
    public String getDirektorIme() {
        return this.direktorIme;
    }
    
    public void setDirektorIme(String direktorIme) {
        this.direktorIme = direktorIme;
    }

    
    @Column(name="direktor_prezime", nullable=false, length=45)
    public String getDirektorPrezime() {
        return this.direktorPrezime;
    }
    
    public void setDirektorPrezime(String direktorPrezime) {
        this.direktorPrezime = direktorPrezime;
    }

    
    @Column(name="pib", nullable=false)
    public int getPib() {
        return this.pib;
    }
    
    public void setPib(int pib) {
        this.pib = pib;
    }

    
    @Column(name="brojZaposlenih", nullable=false)
    public int getBrojZaposlenih() {
        return this.brojZaposlenih;
    }
    
    public void setBrojZaposlenih(int brojZaposlenih) {
        this.brojZaposlenih = brojZaposlenih;
    }

    
    @Column(name="email", nullable=false, length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="sajt", nullable=false, length=45)
    public String getSajt() {
        return this.sajt;
    }
    
    public void setSajt(String sajt) {
        this.sajt = sajt;
    }

    
    @Column(name="delatnost", nullable=false, length=45)
    public String getDelatnost() {
        return this.delatnost;
    }
    
    public void setDelatnost(String delatnost) {
        this.delatnost = delatnost;
    }

    
    @Column(name="specijalnost", nullable=false, length=45)
    public String getSpecijalnost() {
        return this.specijalnost;
    }
    
    public void setSpecijalnost(String specijalnost) {
        this.specijalnost = specijalnost;
    }

    
    @Column(name="grad", nullable=false, length=45)
    public String getGrad() {
        return this.grad;
    }
    
    public void setGrad(String grad) {
        this.grad = grad;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="kompanija")
    public Set<Standovi> getStandovis() {
        return this.standovis;
    }
    
    public void setStandovis(Set<Standovi> standovis) {
        this.standovis = standovis;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="kompanija")
    public Set<Konkurs> getKonkurses() {
        return this.konkurses;
    }
    
    public void setKonkurses(Set<Konkurs> konkurses) {
        this.konkurses = konkurses;
    }

@OneToOne(fetch=FetchType.LAZY, mappedBy="kompanija")
    public Prijavanasajam getPrijavanasajam() {
        return this.prijavanasajam;
    }
    
    public void setPrijavanasajam(Prijavanasajam prijavanasajam) {
        this.prijavanasajam = prijavanasajam;
    }




}


