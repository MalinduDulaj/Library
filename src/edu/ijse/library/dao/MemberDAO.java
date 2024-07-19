/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.dao;

import edu.ijse.library.view.Member;
import java.util.List;

/**
 *
 * @author malindudulaj
 */
public interface MemberDAO {
    Member create(Member member);
    Member read(int memberId);
    List<Member> readAll();
    Member update(Member member);
    void delete(int memberId);
    
}