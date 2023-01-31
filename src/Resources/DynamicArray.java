package Resources;

import java.util.Arrays;

public class DynamicArray {
    private int[] dynamicArray;
    private int dynamicArraySize;
    private int[] newDynamicArray;
    private int arraySize;


    public int[] createArray() {
        try {
            dynamicArray = new int [2];
            for (int i = 0; i < 3; i++) {
                dynamicArraySize = dynamicArray.length;
                dynamicArray[i] = i+1;
                }
            System.out.println(Arrays.toString(dynamicArray));
        } catch (ArrayIndexOutOfBoundsException oob) {
            duplicateArraySize();
            System.out.println("This is your new array");
        }
        return dynamicArray;
    }

    public int[] duplicateArraySize() {
        newDynamicArray = new int[dynamicArraySize * 2];
        System.arraycopy(dynamicArray,0,newDynamicArray,0,dynamicArray.length);
        System.out.println(newDynamicArray.length);
        for (int i = dynamicArraySize; i < newDynamicArray.length; i++) {
            newDynamicArray[i] = i+1;
        }
        dynamicArray = newDynamicArray;
        System.out.println(Arrays.toString(newDynamicArray));
        return dynamicArray;
    }

    public int [] halfArraySize(){

        System.arraycopy(dynamicArray,0,newDynamicArray,0,dynamicArray.length);
        newDynamicArray = new int [dynamicArraySize / 2];
        newDynamicArray=dynamicArray;
        return dynamicArray;
    }
}

