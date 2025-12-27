class SearchIndex {
    public static void main(String[] args) {
        int[] arr = {4, 8, 12};
        int key = 12;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key)
                System.out.println("Index: " + i);
    }
}
