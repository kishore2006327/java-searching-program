class ElementExists {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int key = 5;
        boolean found = false;
        for (int i : arr)
            if (i == key) found = true;
        System.out.println(found ? "Exists" : "Not Exists");
    }
}