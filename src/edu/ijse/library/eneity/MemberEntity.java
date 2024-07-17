/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.eneity;

/**
 *
 * @author malindudulaj
 */
public class MemberEntity {
    private int memberId;
    private String name;
    private String address;
    private String contactnumber;

    public MemberEntity(int memberId, String name, String address, String contactnumber) {
        this.memberId = memberId;
        this.name = name;
        this.address = address;
        this.contactnumber = contactnumber;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }
    
    
    
}
