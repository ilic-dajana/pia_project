/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.Serializable;
import java.sql.SQLException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import util.dao.UserDao;

/**
 *
 * @author dajana
 */
@ManagedBean(name = "RegistracijaKompanija")
@SessionScoped
public class RegistracijaKompanija implements Serializable {
    private String username;
    private String password, ponovljenPassword;
    private String email, sajt,grad, adresa, specijalnost,kompanija, ime, prezime;
    private int broj_zaposlenih,PIB;
    private String delatnost, messageRegister;
    
    public String registracija() throws SQLException{
        try {
            if(UserDao.proveriUsername(username)){                
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Username vec postoji!", null));
                return  null;
            }
            
            messageRegister = UserDao.unesiKompaniju(username, password, kompanija, grad, adresa,ime, prezime, PIB, broj_zaposlenih, email, sajt, delatnost, specijalnost );    
                
            if(messageRegister == "")
                return "login?faces-redirect=true";
            else{
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, messageRegister, null));
                return  null;
            }
        } catch (SQLException ex) {            
            return "error";
        }
        
    }

    public String getMessageRegister() {
        return messageRegister;
    }

    public void setMessageRegister(String messageRegister) {
        this.messageRegister = messageRegister;
    }

    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSajt() {
        return sajt;
    }

    public void setSajt(String sajt) {
        this.sajt = sajt;
    }

    public String getSpecijalnost() {
        return specijalnost;
    }

    public void setSpecijalnost(String specijalnost) {
        this.specijalnost = specijalnost;
    }

    public String getKompanija() {
        return kompanija;
    }

    public void setKompanija(String kompanija) {
        this.kompanija = kompanija;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBroj_zaposlenih() {
        return broj_zaposlenih;
    }

    public void setBroj_zaposlenih(int broj_zaposlenih) {
        this.broj_zaposlenih = broj_zaposlenih;
    }

    public int getPIB() {
        return PIB;
    }

    public void setPIB(int PIB) {
        this.PIB = PIB;
    }

    public String getDelatnost() {
        return delatnost;
    }

    public void setDelatnost(String delatnost) {
        this.delatnost = delatnost;
    }

    public String getPonovljenPassword() {
        return ponovljenPassword;
    }

    public void setPonovljenPassword(String ponovljenPassword) {
        this.ponovljenPassword = ponovljenPassword;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
    
    
}
