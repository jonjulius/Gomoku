/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 *
 * @author Jonathan
 */
public class Test {

    /**
     * @param args the command line arguments
     * @throws java.security.NoSuchAlgorithmException
     * @throws java.io.UnsupportedEncodingException 
     */
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String test = "Hello world!";
        System.out.println(test);
        MessageDigest digest = MessageDigest.getInstance("SHA-1");
       digest.reset();
       byte[] input = digest.digest(test.getBytes("UTF-8"));
         System.out.println(Arrays.toString(input));
         
    }
    
}
