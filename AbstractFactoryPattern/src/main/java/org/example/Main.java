package org.example;

import org.example.factory.FurnitureFactory;
import org.example.factory.ModernFurnitureFactory;
import org.example.factory.VictorianFurnitureFactory;
import org.example.product.chair.Chair;
import org.example.product.sofa.Sofa;
import org.example.product.table.Table;

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract Factory...\n");

        FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        FurnitureFactory victorianFurnitureFactory = new VictorianFurnitureFactory();

        Chair modernChair = modernFurnitureFactory.createChair();
        Sofa modernSofa = modernFurnitureFactory.createSofa();
        Table modernTable = modernFurnitureFactory.createTable();

        Chair victorianChair = victorianFurnitureFactory.createChair();
        Sofa victorianSofa = victorianFurnitureFactory.createSofa();
        Table victorianTable = victorianFurnitureFactory.createTable();


        modernChair.sitOn();
        modernSofa.sitOn();
        modernTable.use();
        System.out.println();
        victorianChair.sitOn();
        victorianSofa.sitOn();
        victorianTable.use();

    }
}