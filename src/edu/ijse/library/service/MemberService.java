/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.service;

import edu.ijse.library.service.BookService.ServiceException;
import edu.ijse.library.view.Member;
import java.util.List;

/**
 *
 * @author malindudulaj
 */
public interface MemberService {
    
    List<Member> getAllMembers();

    Member getMemberById(int memberId) throws ServiceException;

    List<Member> searchMembers(String membername, int memberId);

    void saveMember(Member member) throws ServiceException;

    void updateMember(Member member) throws ServiceException;

    void deleteMember(int memberId) throws ServiceException;
    
}
