class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        int key = 2;
        for (int i = arr.length - 1; i >= 0; i--)
            if (arr[i] == key) {
                System.out.println(i);
                break;
            }
    }
}
