class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int key = 6, low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Found");
                break;
            } else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
    }
}
