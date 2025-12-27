class MaxIndex {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30};
        int max = arr[0], index = 0;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        System.out.println("Index = " + index);
    }
}
