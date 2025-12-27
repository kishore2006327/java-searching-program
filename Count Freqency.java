class Frequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        int key = 2, count = 0;
        for (int i : arr)
            if (i == key) count++;
        System.out.println("Frequency = " + count);
    }
}
