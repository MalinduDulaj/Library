/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dao.impl;

import com.sun.jdi.connect.spi.Connection;
import edu.ijse.library.dao.MemberDAO;
import edu.ijse.library.view.Member;
import java.util.List;

/**
 *
 * @author malindudulaj
 */
public class MemberDAOImpl implements MemberDAO {

    private  Connection connection;

    public MemberDAOImpl(Connection connection) {
        this.connection = connection;
    }

    
    
    

}
    

