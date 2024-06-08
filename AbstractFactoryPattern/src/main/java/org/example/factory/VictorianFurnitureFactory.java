package org.example.factory;

import org.example.product.chair.Chair;
import org.example.product.chair.VictorianChair;
import org.example.product.sofa.Sofa;
import org.example.product.sofa.VictorianSofa;
import org.example.product.table.Table;
import org.example.product.table.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
