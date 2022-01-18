package com.utn.patrones.singleton;

public class Main {
    public static void main(String[] args) {
        Banco banco = Banco.getInstance();
        
        System.out.println(banco);
        
        Banco banco2 = Banco.getInstance();
        banco2.setCalle("Rivadavia");
        
        
        System.out.println(banco);
        
     //   Calendar c = Calendar.getInstance();
        
        
    }
}
