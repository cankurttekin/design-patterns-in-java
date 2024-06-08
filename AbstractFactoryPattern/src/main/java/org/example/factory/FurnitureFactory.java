package org.example.factory;

import org.example.product.chair.Chair;
import org.example.product.sofa.Sofa;
import org.example.product.table.Table;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    Table createTable();
}
