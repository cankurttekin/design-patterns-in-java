package org.example.factory;

import org.example.product.chair.Chair;
import org.example.product.chair.ModernChair;
import org.example.product.sofa.ModernSofa;
import org.example.product.sofa.Sofa;
import org.example.product.table.ModernTable;
import org.example.product.table.Table;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
