/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

/**
 *
 * @author Patricia
 */
public class PigLatin {
    public static void main(String[] args) {
        String[] token = "Welcome to Java".split(" ", 0);
        String output[] = new String[token.length];
        for(int i = 0; i < token.length; i++){
            output[i] = token[i].substring(1) + token[i].charAt(0) + "ay";
        }
        for(int i = 0; i < output.length; i++){
            System.out.print(output[i] + " ");
        }
    }
}
