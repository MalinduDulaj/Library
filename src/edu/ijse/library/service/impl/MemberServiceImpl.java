/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.service.impl;

import edu.ijse.library.dao.MemberDAO;
import edu.ijse.library.service.BookService;
import edu.ijse.library.service.BookService.ServiceException;
import edu.ijse.library.service.MemberService;
import edu.ijse.library.view.Member;
import java.util.List;

/**
 *
 * @author malindudulaj
 */
public abstract class MemberServiceImpl implements MemberService{
    
    private final MemberDAO memberDao;
    
    public MemberServiceImpl(MemberDAO memberDao) {
        this.memberDao = memberDao;
    }

     @Override
    public List<Member> getAllMembers() {
        return memberDao.findAll();
    }

    @Override
    public Member getMemberById(int memberId) throws ServiceException {
        Member member = memberDao.findById(memberId);
        if (member == null) {
            throw new ServiceException("Member with ID " + memberId + " not found");
        }
        return member;
    }

    public List<Member> searchMembers(String name, String memberId) {
        return memberDao.searchMembers(name, memberId); // Implement search logic in MemberDao
    }

    public void createMember(Member member) throws ServiceException {
        // Validate member data (e.g., name format, unique ID if applicable)
        memberDao.save(member);
    }

    @Override
    public void updateMember(Member member) throws ServiceException {
        // Validate member data before update
        memberDao.update(member);
    }

    @Override
    public void deleteMember(int memberId) throws ServiceException {
        // Check if member has borrowings before deletion (optional)
        memberDao.deleteById(memberId);
    }
    
}
