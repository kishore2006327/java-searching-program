class RecursiveSearch {
    static boolean search(int[] a, int i, int key) {
        if (i == a.length) return false;
        if (a[i] == key) return true;
        return search(a, i + 1, key);
    }
    public static void main(String[] args) {
        int[] arr = {3, 6, 9};
        System.out.println(search(arr, 0, 6));
    }
}
