package jc01_2020.buvin.lesson08.task01;

/*
 *
 * Написать программу, которая получает на вход латинскую букву в любом регистре и выводит в консоль номер этой буквы
 * в алфавите. Использовать enum
 *
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class Application {
    enum Alfavit {
        A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,
        a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.next();
        Alfavit[] alfavits = Alfavit.values();
        for (int i = 0; i < alfavits.length; i++) {
            if (alfavits[i].toString().equals(letter)) {
               if (i>=26)i-=26;
               	System.out.println(i+1);
               	break;
            }
        }
//		Pattern pattern = Pattern.compile("[A-Za-z]");
//        if (pattern.matcher(letter).find()){
//			System.out.println(pattern.matcher(letter));
//		}
    }
}
