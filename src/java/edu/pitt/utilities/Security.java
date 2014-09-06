/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.pitt.utilities;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jordanstevenfeldman
 */
public class Security {
    
    public static boolean isValidSession(HttpSession session){
        
        if(session != null){
            if(session.getAttribute("authenticatedUser") != null){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
        
    }
    
    public static boolean checkHijackedSession(HttpSession session, HttpServletRequest request){
        
        if(isValidSession(session)){
            if(request.getRemoteAddr() != session.getAttribute("authenticatedUserIP")){
                if(request.getHeader("User-Agent").contains("Mobile")){
                    return false;
                }
                else{
                    System.out.println("Client is not mobile and IP address has changed");
                    return true;
                }

            }
        }
        return false;  
    }
    
}
