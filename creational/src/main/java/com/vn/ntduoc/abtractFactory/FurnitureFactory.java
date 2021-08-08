package com.vn.ntduoc.abtractFactory;

public class FurnitureFactory {

    private FurnitureFactory() {

    }

    public static FurnitureAbstractFactory getFactory(MaterialType materialType) {
        switch (materialType) {
            case WOOD:
                return new WoodFactory();
            case FLASTIC:
                return new FlasticFactory();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
