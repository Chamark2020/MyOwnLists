import java.util.Arrays;

public class MyArrayList {
    final private int DEFAULT_SIZE = 10;
    private int arrSize;
    private int currentOccupancy;
    private int[] currentArr;

    public MyArrayList() {
        currentArr = new int[DEFAULT_SIZE];
        currentOccupancy = 0;
        arrSize = DEFAULT_SIZE;
    }

    public MyArrayList(int size) {
        this.arrSize = size;
        currentArr = new int[size];
        currentOccupancy = 0;
    }

    public void add(int value) {
        if (currentOccupancy >= arrSize) {
            int tempSize = arrSize + 5;
            int[] tempArr = new int[tempSize];
            for (int i = 0; i < arrSize; i++) {
                tempArr[i] = currentArr[i];
            }
            arrSize = tempSize;
            currentArr = tempArr;
        }
        currentArr[currentOccupancy] = value;
        currentOccupancy++;
    }

    public void remove (int index) {
        int[] temp;
        if (currentOccupancy + 5 <= arrSize && arrSize - 5 >= DEFAULT_SIZE) {
            arrSize -= 5;
        }
        temp = new int[arrSize];
        try {
            if (index > currentOccupancy - 1) throw new IllegalArgumentException();
            for (int i = 0; i < currentOccupancy; i++) {
                if (i < index) {
                    temp[i] = currentArr[i];
                    //[0,1,2,3,4,5,6,7,8,9]
                } else {
                    temp[i] = currentArr[i + 1];
                }
            }
            currentArr = temp;
            currentOccupancy--;
        } catch (IllegalArgumentException e) {
            System.out.println("Такого индекса несуществует. Операция удаления не удалась");
        }
    }

    public int getArrSize() {
        return arrSize;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; ; i++) {
            sb.append(currentArr[i]);
            if (i == currentOccupancy - 1) return sb.append(']').toString();
            sb.append(',');
        }
    }
}
