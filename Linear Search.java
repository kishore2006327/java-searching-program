class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15};
        int key = 10;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key)
                System.out.println("Found at index " + i);
    }
}