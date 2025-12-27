class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        int key = 2;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) {
                System.out.println(i);
                break;
            }
    }
}
