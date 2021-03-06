/*
 *@author @Emile Lubangi kitenge 216012465
 *
 */

package ac.za.cput.factory.equipment;


import ac.za.cput.entity.equipment.Furniture;
import ac.za.cput.util.GenericHelper;

public class FurnitureFactory {

    public static Furniture createFurniture(String furnitureTypeId,String name){
        String furnitureId = GenericHelper.generateId();
        Furniture furniture =new Furniture.Builder()
                .setFurnitureId(furnitureId)
                .setFurnitureTypeId(furnitureTypeId)
                .setName(name)
                .build();
        return furniture;
    }

    public static Furniture createFurniture(String s) {
        return null;
    }
}