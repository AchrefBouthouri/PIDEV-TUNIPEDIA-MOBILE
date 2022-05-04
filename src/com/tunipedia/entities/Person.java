/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunipedia.entities;

import java.util.Date;

/**
 *
 * @author mac
 */
public class Person {
    private int id,Avatar;
    private String FullName, Email, Password, Gender, Nationalite, Role;
    private String CreatedAt;
    private Boolean HasPlaces, IsPartner;
    private float Balance;

    public Person(int id, int Avatar, String FullName, String Email, String Password, String Gender, String Nationalite, String Role, String CreatedAt, Boolean HasPlaces, Boolean IsPartner, float Balance) {
        this.id = id;
        this.Avatar = Avatar;
        this.FullName = FullName;
        this.Email = Email;
        this.Password = Password;
        this.Gender = Gender;
        this.Nationalite = Nationalite;
        this.Role = Role;
        this.CreatedAt = CreatedAt;
        this.HasPlaces = HasPlaces;
        this.IsPartner = IsPartner;
        this.Balance = Balance;
    }

    public Person(int Avatar, String FullName, String Email, String Password, String Gender, String Nationalite, String Role, String CreatedAt, Boolean HasPlaces, Boolean IsPartner, float Balance) {
        this.Avatar = Avatar;
        this.FullName = FullName;
        this.Email = Email;
        this.Password = Password;
        this.Gender = Gender;
        this.Nationalite = Nationalite;
        this.Role = Role;
        this.CreatedAt = CreatedAt;
        this.HasPlaces = HasPlaces;
        this.IsPartner = IsPartner;
        this.Balance = Balance;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAvatar() {
        return Avatar;
    }

    public void setAvatar(int Avatar) {
        this.Avatar = Avatar;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getNationalite() {
        return Nationalite;
    }

    public void setNationalite(String Nationalite) {
        this.Nationalite = Nationalite;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public String getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    public Boolean getHasPlaces() {
        return HasPlaces;
    }

    public void setHasPlaces(Boolean HasPlaces) {
        this.HasPlaces = HasPlaces;
    }

    public Boolean getIsPartner() {
        return IsPartner;
    }

    public void setIsPartner(Boolean IsPartner) {
        this.IsPartner = IsPartner;
    }

    public float getBalance() {
        return Balance;
    }

    public void setBalance(float Balance) {
        this.Balance = Balance;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", Avatar=" + Avatar + ", FullName=" + FullName + ", Email=" + Email + ", Password=" + Password + ", Gender=" + Gender + ", Nationalite=" + Nationalite + ", Role=" + Role + ", CreatedAt=" + CreatedAt + ", HasPlaces=" + HasPlaces + ", IsPartner=" + IsPartner + ", Balance=" + Balance + '}';
    }
    
    
    
}
